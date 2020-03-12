package com.payment.bac;

import com.firstatlanticcommerce.schemas.gateway.HostedPagePreprocessDocument;
import com.firstatlanticcommerce.schemas.gateway.HostedPagePreprocessResponseDocument;
import com.firstatlanticcommerce.schemas.gateway.HostedPageResultsResponseDocument;
import com.firstatlanticcommerce.schemas.gateway.data.AuthorizeResponse;
import com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessRequest;
import com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse;
import com.firstatlanticcommerce.schemas.gateway.data.HostedPageResultsResponse;
import com.firstatlanticcommerce.schemas.gateway.default2.HostedPageStub;


import icg.gateway.common.CommonGatewayInterface;
import icg.gateway.common.entities.*;


import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Application Common Gateway Interface
 *
 * This class extends from CommonGatewayInterface, It is an interfaces provided from a bank
 *
 */
public class ApplicationCommonGatewayInterface implements CommonGatewayInterface
{
    private final static Logger LOGGER = Logger.getLogger( ApplicationCommonGatewayInterface.class.getName() );

    private static final String MERCHANT_URL = "https://ecm.firstatlanticcommerce.com/MerchantPages/PortalRest/PortalRestFormV1/";
    private static final String PROD_URL = "https://marlin.firstatlanticcommerce.com/PGService/HostedPage.svc";
    private static final String DEV_URL = "https://ecm.firstatlanticcommerce.com/PGService/HostedPage.svc";


    private static final String AUTH_CODE = "authCode";

    /* Test Values. They will be removed in final version
    private static final String ACQUIRER_ID = "454647";
    private static final String MERCHANT_ID = "88801214";
    private static final String MERCHANT_PASSWORD_ID = "454647";

    private static final String CONCURRENCY_ISO_CODE = "188"; // colones

     */


    /**
     * Method to generate a unique ID
     * @return unique ID
     */
    @Override
    public String getNewPaymentNumOrder()
    {
        return UUID.randomUUID().toString();
    }


    /**
     * This method makes the first request to the third party to get a token
     * @param pAmount amount to be charged
     * @param pConcurrencyISO currency
     * @param pMerchantSiteURL merchant site url
     * @param pNumOrder order
     * @param params params. they are defined by the developers
     * @param isTest to know if is a test execution
     * @return Web form and url with token
     */
    public icg.gateway.common.entities.WebForm doPayment(BigDecimal pAmount, String pConcurrencyISO, String pMerchantSiteURL, String pNumOrder, List<String> params, boolean isTest ) throws Exception
    {
        Map<String, String> fields = new HashMap<>();
        String securityCode = "";
        try
        {
            String acquirerId = params.get( 0 );
            String merchantId = params.get( 1 );
            String merchantPassword = params.get( 2 );

            String hostedPageURL = isTest ? DEV_URL : PROD_URL;

            HostedPagePreprocessResponse preprocessResponse = getPreprocessResponse( hostedPageURL, pMerchantSiteURL, acquirerId,
                    merchantId, merchantPassword, pNumOrder, pAmount, pConcurrencyISO );


            if ( preprocessResponse != null )
            {
                securityCode  = preprocessResponse.getResponseCode().equals( "00" ) ? preprocessResponse.getSecurityToken() : "";

                fields.put( "responseCode", preprocessResponse.getResponseCode() );
                fields.put( "responseCodeDescription", preprocessResponse.getResponseCodeDescription() );
                fields.put( "securityCode", preprocessResponse.getSecurityToken() );
            }
            else
            {
                fields.put( "responseCode", "-1" );
                fields.put( "responseCodeDescription", "Error getting preprocess response" );
            }
            return new icg.gateway.common.entities.WebForm( MERCHANT_URL + securityCode, fields );

        }
        catch ( Exception e )
        {
            LOGGER.log( Level.SEVERE, String.format( "Error doing payment Getting token. Num Order: %s", pNumOrder ), e );
            throw e;
        }
    }


    /**
     * This method decodes the bank result
     * @param httpServletRequest information
     * @return Bank Response
     */
    @Override
    public BankResponse decodePaymentResponse( HttpServletRequest httpServletRequest ) throws Exception
    {
        BankResponse bankResponse = new BankResponse();
        try
        {
            Map<String, String> params = new HashMap<>();

            if ( httpServletRequest.getInputStream() != null )
            {
                String stringResponse = httpServletRequest.getInputStream().toString();

                HostedPageResultsResponse hostedPageResultsResponse = HostedPageResultsResponseDocument.Factory.parse( stringResponse ).getHostedPageResultsResponse().getHostedPageResultsResult();

                AuthorizeResponse authorizeResponse = hostedPageResultsResponse.getAuthResponse();

                bankResponse.setNumOrder( authorizeResponse.getOrderNumber() );

                params.put( AUTH_CODE, authorizeResponse.getCreditCardTransactionResults().getAuthCode() );

                bankResponse.setParameters( params );
            }
            else
            {
                throw new Exception( "Cannot find serialized data entity" );
            }
        }
        catch ( Exception e )
        {
            LOGGER.log( Level.SEVERE, String.format( "Error decoding payment response. Num Order: %s", bankResponse.getNumOrder() ), e );
            throw e;
        }
        return bankResponse;
    }

    /**
     * Method to process bank response
     * @param bankResponse bank response
     * @param list param list
     * @return payment response object
     */
    @Override
    public PaymentResponse processPaymentResponse( BankResponse bankResponse, List<String> list )
    {
        PaymentResponse paymentResponse = new PaymentResponse();
        try
        {

            if ( bankResponse.getParameters() != null )
            {
                paymentResponse.setNumOrder( bankResponse.getNumOrder() );
                paymentResponse.setAuthorizationCode( bankResponse.getParameters().get( AUTH_CODE ) );

                if ( paymentResponse.getAuthorizationCode().equals( "00" ) )
                {
                    paymentResponse.setOk (true );
                    //paymentResponse.setVoucher( "success html" );
                    paymentResponse.setVoucherTitle( "Success Payment Receipt" );
                }

                else
                {
                    paymentResponse.setOk( false );
                    //paymentResponse.setVoucher( "Unsuccessful html" );
                    paymentResponse.setVoucherTitle( "Unsuccessful Payment Receipt");
                }
            }
            return paymentResponse;

        }
        catch ( Exception ex )
        {
            LOGGER.log( Level.SEVERE, String.format( "Error processing payment response. Num Order: %s", bankResponse.getNumOrder() ), ex );
            PaymentResponse response = new PaymentResponse();
            response.setErrorMessage( ex.getMessage() );
            response.setOk( false );
        }
        return paymentResponse;
    }

    /**
     * Method to get the preprocess response that contains the security token necessary to append to the merchant site URL
     * @param pHostedPageUrl third party URL
     * @param pMerchantUrlSite merchant site url
     * @param pAcquiredId acquired id
     * @param pMerchantId merchant id
     * @param pNumOrder num order
     * @param pAmount amount
     * @param pConcurrencyISO currency ISO
     * @return HostedPagePreprocessResponse object that contains the security token
     */
    public HostedPagePreprocessResponse getPreprocessResponse(String pHostedPageUrl, String pMerchantUrlSite, String pAcquiredId,
                                                                                                   String pMerchantId, String pMerchantPassword, String pNumOrder, BigDecimal pAmount,
                                                                                                   String pConcurrencyISO  )
    {
        try
        {
            HostedPageStub stub = new HostedPageStub( pHostedPageUrl );

            HostedPagePreprocessDocument requestDocument = HostedPagePreprocessDocument.Factory.newInstance();
            HostedPagePreprocessRequest tokenRequest = requestDocument.addNewHostedPagePreprocess().addNewRequest();

            tokenRequest.addNewTransactionDetails();
            tokenRequest.addNewRecurringDetails();

            tokenRequest.getRecurringDetails().setIsRecurring( false );
            tokenRequest.getRecurringDetails().setNumberOfRecurrences( 0 );

            tokenRequest.setCardHolderResponseURL( pMerchantUrlSite );

            tokenRequest.getTransactionDetails().setAcquirerId( pAcquiredId );
            tokenRequest.getTransactionDetails().setMerchantId( pMerchantId );
            tokenRequest.getTransactionDetails().setOrderNumber( pNumOrder );
            tokenRequest.getTransactionDetails().setTransactionCode( 0 );

            String amountFormatted = getAmountFormatted( pAmount );


            tokenRequest.getTransactionDetails().setAmount( amountFormatted );
            tokenRequest.getTransactionDetails().setCurrency( pConcurrencyISO );
            tokenRequest.getTransactionDetails().setCurrencyExponent( 2 );
            tokenRequest.getTransactionDetails().setSignatureMethod( "SHA1" );


            tokenRequest.getTransactionDetails().setSignature( getSignature( pMerchantPassword, pMerchantId, pAcquiredId, pNumOrder, amountFormatted, pConcurrencyISO ) );


            HostedPagePreprocessResponseDocument hostedPagePreprocessResponseDocument = stub.hostedPagePreprocess( requestDocument );


            if ( hostedPagePreprocessResponseDocument != null && hostedPagePreprocessResponseDocument.getHostedPagePreprocessResponse() != null )
            {
                return hostedPagePreprocessResponseDocument.getHostedPagePreprocessResponse().getHostedPagePreprocessResult();
            }
            return null;
        }
        catch ( Exception e )
        {
            LOGGER.log( Level.SEVERE, String.format( "Error getting HostedPage Preprocess Response object. NumOrder %s", pNumOrder ), e );
            return null;
        }

    }


    /**
     * Method to get a signature
     *
     * This method encrypts the params using SHA-1 encryption and then the result is encoded

     * @return encoded string
     */
    private static String getSignature( String password, String merchantId, String acquirerId, String order,
                                        String amount, String currency ) throws UnsupportedEncodingException {
        try
        {
            MessageDigest md = MessageDigest.getInstance( "SHA-1" );

            String message = password.trim() + merchantId.trim() + acquirerId.trim() + order.trim() + amount.trim() + currency.trim();

            md.update( message.getBytes() );

            byte[] digest = md.digest();
            String encoded = Base64.getEncoder().encodeToString(digest);

            return URLEncoder.encode(encoded, "UTF-8");
        }
        catch ( NoSuchAlgorithmException e )
        {
            LOGGER.log( Level.SEVERE, String.format( "Error creating signature. Num Order: %s", order ), e );
        }
        return null;
    }

    /**
     * Method to get the amount formatted.
     *
     * The result should contain 12 digits considering the decimals, so it is required add zeros to the left
     *
     * Example: $12.12 should be 000000001212
     *
     * @param amount amount to be formatted
     * @return  amount formatted
     */
    private static String getAmountFormatted( BigDecimal amount )
    {
        return String.format("%012d", Integer.parseInt( amount.toString().replace(".", "" ) ) ) ;
    }

    public static void main(String[] args) {

    }
}
