/*
 * XML Type:  AuthorizeResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.AuthorizeResponse
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data;


/**
 * An XML AuthorizeResponse(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public interface AuthorizeResponse extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuthorizeResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9CAC302D2199EADE2090FC77680865A4").resolveHandle("authorizeresponse250dtype");
    
    /**
     * Gets the "AcquirerId" element
     */
    String getAcquirerId();

    /**
     * Gets (as xml) the "AcquirerId" element
     */
    org.apache.xmlbeans.XmlString xgetAcquirerId();

    /**
     * Tests for nil "AcquirerId" element
     */
    boolean isNilAcquirerId();

    /**
     * True if has "AcquirerId" element
     */
    boolean isSetAcquirerId();

    /**
     * Sets the "AcquirerId" element
     */
    void setAcquirerId(String acquirerId);

    /**
     * Sets (as xml) the "AcquirerId" element
     */
    void xsetAcquirerId(org.apache.xmlbeans.XmlString acquirerId);

    /**
     * Nils the "AcquirerId" element
     */
    void setNilAcquirerId();

    /**
     * Unsets the "AcquirerId" element
     */
    void unsetAcquirerId();

    /**
     * Gets the "BillingDetails" element
     */
    BillingDetails getBillingDetails();

    /**
     * Tests for nil "BillingDetails" element
     */
    boolean isNilBillingDetails();

    /**
     * True if has "BillingDetails" element
     */
    boolean isSetBillingDetails();

    /**
     * Sets the "BillingDetails" element
     */
    void setBillingDetails(BillingDetails billingDetails);

    /**
     * Appends and returns a new empty "BillingDetails" element
     */
    BillingDetails addNewBillingDetails();

    /**
     * Nils the "BillingDetails" element
     */
    void setNilBillingDetails();

    /**
     * Unsets the "BillingDetails" element
     */
    void unsetBillingDetails();

    /**
     * Gets the "CreditCardTransactionResults" element
     */
    CreditCardTransactionResults getCreditCardTransactionResults();

    /**
     * Tests for nil "CreditCardTransactionResults" element
     */
    boolean isNilCreditCardTransactionResults();

    /**
     * True if has "CreditCardTransactionResults" element
     */
    boolean isSetCreditCardTransactionResults();

    /**
     * Sets the "CreditCardTransactionResults" element
     */
    void setCreditCardTransactionResults(CreditCardTransactionResults creditCardTransactionResults);

    /**
     * Appends and returns a new empty "CreditCardTransactionResults" element
     */
    CreditCardTransactionResults addNewCreditCardTransactionResults();

    /**
     * Nils the "CreditCardTransactionResults" element
     */
    void setNilCreditCardTransactionResults();

    /**
     * Unsets the "CreditCardTransactionResults" element
     */
    void unsetCreditCardTransactionResults();

    /**
     * Gets the "CustomData" element
     */
    String getCustomData();

    /**
     * Gets (as xml) the "CustomData" element
     */
    org.apache.xmlbeans.XmlString xgetCustomData();

    /**
     * Tests for nil "CustomData" element
     */
    boolean isNilCustomData();

    /**
     * True if has "CustomData" element
     */
    boolean isSetCustomData();

    /**
     * Sets the "CustomData" element
     */
    void setCustomData(String customData);

    /**
     * Sets (as xml) the "CustomData" element
     */
    void xsetCustomData(org.apache.xmlbeans.XmlString customData);

    /**
     * Nils the "CustomData" element
     */
    void setNilCustomData();

    /**
     * Unsets the "CustomData" element
     */
    void unsetCustomData();

    /**
     * Gets the "IPGeoLocationResults" element
     */
    IPGeoLocationResults getIPGeoLocationResults();

    /**
     * Tests for nil "IPGeoLocationResults" element
     */
    boolean isNilIPGeoLocationResults();

    /**
     * True if has "IPGeoLocationResults" element
     */
    boolean isSetIPGeoLocationResults();

    /**
     * Sets the "IPGeoLocationResults" element
     */
    void setIPGeoLocationResults(IPGeoLocationResults ipGeoLocationResults);

    /**
     * Appends and returns a new empty "IPGeoLocationResults" element
     */
    IPGeoLocationResults addNewIPGeoLocationResults();

    /**
     * Nils the "IPGeoLocationResults" element
     */
    void setNilIPGeoLocationResults();

    /**
     * Unsets the "IPGeoLocationResults" element
     */
    void unsetIPGeoLocationResults();

    /**
     * Gets the "MerchantId" element
     */
    String getMerchantId();

    /**
     * Gets (as xml) the "MerchantId" element
     */
    org.apache.xmlbeans.XmlString xgetMerchantId();

    /**
     * Tests for nil "MerchantId" element
     */
    boolean isNilMerchantId();

    /**
     * True if has "MerchantId" element
     */
    boolean isSetMerchantId();

    /**
     * Sets the "MerchantId" element
     */
    void setMerchantId(String merchantId);

    /**
     * Sets (as xml) the "MerchantId" element
     */
    void xsetMerchantId(org.apache.xmlbeans.XmlString merchantId);

    /**
     * Nils the "MerchantId" element
     */
    void setNilMerchantId();

    /**
     * Unsets the "MerchantId" element
     */
    void unsetMerchantId();

    /**
     * Gets the "OrderNumber" element
     */
    String getOrderNumber();

    /**
     * Gets (as xml) the "OrderNumber" element
     */
    org.apache.xmlbeans.XmlString xgetOrderNumber();

    /**
     * Tests for nil "OrderNumber" element
     */
    boolean isNilOrderNumber();

    /**
     * True if has "OrderNumber" element
     */
    boolean isSetOrderNumber();

    /**
     * Sets the "OrderNumber" element
     */
    void setOrderNumber(String orderNumber);

    /**
     * Sets (as xml) the "OrderNumber" element
     */
    void xsetOrderNumber(org.apache.xmlbeans.XmlString orderNumber);

    /**
     * Nils the "OrderNumber" element
     */
    void setNilOrderNumber();

    /**
     * Unsets the "OrderNumber" element
     */
    void unsetOrderNumber();

    /**
     * Gets the "Signature" element
     */
    String getSignature();

    /**
     * Gets (as xml) the "Signature" element
     */
    org.apache.xmlbeans.XmlString xgetSignature();

    /**
     * Tests for nil "Signature" element
     */
    boolean isNilSignature();

    /**
     * True if has "Signature" element
     */
    boolean isSetSignature();

    /**
     * Sets the "Signature" element
     */
    void setSignature(String signature);

    /**
     * Sets (as xml) the "Signature" element
     */
    void xsetSignature(org.apache.xmlbeans.XmlString signature);

    /**
     * Nils the "Signature" element
     */
    void setNilSignature();

    /**
     * Unsets the "Signature" element
     */
    void unsetSignature();

    /**
     * Gets the "SignatureMethod" element
     */
    String getSignatureMethod();

    /**
     * Gets (as xml) the "SignatureMethod" element
     */
    org.apache.xmlbeans.XmlString xgetSignatureMethod();

    /**
     * Tests for nil "SignatureMethod" element
     */
    boolean isNilSignatureMethod();

    /**
     * True if has "SignatureMethod" element
     */
    boolean isSetSignatureMethod();

    /**
     * Sets the "SignatureMethod" element
     */
    void setSignatureMethod(String signatureMethod);

    /**
     * Sets (as xml) the "SignatureMethod" element
     */
    void xsetSignatureMethod(org.apache.xmlbeans.XmlString signatureMethod);

    /**
     * Nils the "SignatureMethod" element
     */
    void setNilSignatureMethod();

    /**
     * Unsets the "SignatureMethod" element
     */
    void unsetSignatureMethod();

    /**
     * Gets the "BinCheckResults" element
     */
    BinCheckResults getBinCheckResults();

    /**
     * Tests for nil "BinCheckResults" element
     */
    boolean isNilBinCheckResults();

    /**
     * True if has "BinCheckResults" element
     */
    boolean isSetBinCheckResults();

    /**
     * Sets the "BinCheckResults" element
     */
    void setBinCheckResults(BinCheckResults binCheckResults);

    /**
     * Appends and returns a new empty "BinCheckResults" element
     */
    BinCheckResults addNewBinCheckResults();

    /**
     * Nils the "BinCheckResults" element
     */
    void setNilBinCheckResults();

    /**
     * Unsets the "BinCheckResults" element
     */
    void unsetBinCheckResults();

    /**
     * Gets the "FraudControlResults" element
     */
    FraudControlResults getFraudControlResults();

    /**
     * Tests for nil "FraudControlResults" element
     */
    boolean isNilFraudControlResults();

    /**
     * True if has "FraudControlResults" element
     */
    boolean isSetFraudControlResults();

    /**
     * Sets the "FraudControlResults" element
     */
    void setFraudControlResults(FraudControlResults fraudControlResults);

    /**
     * Appends and returns a new empty "FraudControlResults" element
     */
    FraudControlResults addNewFraudControlResults();

    /**
     * Nils the "FraudControlResults" element
     */
    void setNilFraudControlResults();

    /**
     * Unsets the "FraudControlResults" element
     */
    void unsetFraudControlResults();

    /**
     * Gets the "ShippingDetails" element
     */
    ShippingDetails getShippingDetails();

    /**
     * Tests for nil "ShippingDetails" element
     */
    boolean isNilShippingDetails();

    /**
     * True if has "ShippingDetails" element
     */
    boolean isSetShippingDetails();

    /**
     * Sets the "ShippingDetails" element
     */
    void setShippingDetails(ShippingDetails shippingDetails);

    /**
     * Appends and returns a new empty "ShippingDetails" element
     */
    ShippingDetails addNewShippingDetails();

    /**
     * Nils the "ShippingDetails" element
     */
    void setNilShippingDetails();

    /**
     * Unsets the "ShippingDetails" element
     */
    void unsetShippingDetails();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static AuthorizeResponse newInstance() {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static AuthorizeResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static AuthorizeResponse parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static AuthorizeResponse parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static AuthorizeResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static AuthorizeResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static AuthorizeResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static AuthorizeResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static AuthorizeResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static AuthorizeResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static AuthorizeResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static AuthorizeResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static AuthorizeResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static AuthorizeResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static AuthorizeResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static AuthorizeResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static AuthorizeResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static AuthorizeResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (AuthorizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
