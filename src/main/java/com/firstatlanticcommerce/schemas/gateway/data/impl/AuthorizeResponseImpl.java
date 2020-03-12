/*
 * XML Type:  AuthorizeResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.AuthorizeResponse
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.*;


/**
 * An XML AuthorizeResponse(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class AuthorizeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements AuthorizeResponse
{
    private static final long serialVersionUID = 1L;
    
    public AuthorizeResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACQUIRERID$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "AcquirerId");
    private static final javax.xml.namespace.QName BILLINGDETAILS$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillingDetails");
    private static final javax.xml.namespace.QName CREDITCARDTRANSACTIONRESULTS$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "CreditCardTransactionResults");
    private static final javax.xml.namespace.QName CUSTOMDATA$6 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "CustomData");
    private static final javax.xml.namespace.QName IPGEOLOCATIONRESULTS$8 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "IPGeoLocationResults");
    private static final javax.xml.namespace.QName MERCHANTID$10 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "MerchantId");
    private static final javax.xml.namespace.QName ORDERNUMBER$12 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "OrderNumber");
    private static final javax.xml.namespace.QName SIGNATURE$14 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Signature");
    private static final javax.xml.namespace.QName SIGNATUREMETHOD$16 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "SignatureMethod");
    private static final javax.xml.namespace.QName BINCHECKRESULTS$18 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BinCheckResults");
    private static final javax.xml.namespace.QName FRAUDCONTROLRESULTS$20 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "FraudControlResults");
    private static final javax.xml.namespace.QName SHIPPINGDETAILS$22 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShippingDetails");
    
    
    /**
     * Gets the "AcquirerId" element
     */
    public String getAcquirerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACQUIRERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "AcquirerId" element
     */
    public org.apache.xmlbeans.XmlString xgetAcquirerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACQUIRERID$0, 0);
            return target;
        }
    }

    /**
     * Tests for nil "AcquirerId" element
     */
    public boolean isNilAcquirerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACQUIRERID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "AcquirerId" element
     */
    public boolean isSetAcquirerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACQUIRERID$0) != 0;
        }
    }

    /**
     * Sets the "AcquirerId" element
     */
    public void setAcquirerId(String acquirerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACQUIRERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACQUIRERID$0);
            }
            target.setStringValue(acquirerId);
        }
    }

    /**
     * Sets (as xml) the "AcquirerId" element
     */
    public void xsetAcquirerId(org.apache.xmlbeans.XmlString acquirerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACQUIRERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACQUIRERID$0);
            }
            target.set(acquirerId);
        }
    }

    /**
     * Nils the "AcquirerId" element
     */
    public void setNilAcquirerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACQUIRERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACQUIRERID$0);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "AcquirerId" element
     */
    public void unsetAcquirerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACQUIRERID$0, 0);
        }
    }

    /**
     * Gets the "BillingDetails" element
     */
    public BillingDetails getBillingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            BillingDetails target = null;
            target = (BillingDetails)get_store().find_element_user(BILLINGDETAILS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Tests for nil "BillingDetails" element
     */
    public boolean isNilBillingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            BillingDetails target = null;
            target = (BillingDetails)get_store().find_element_user(BILLINGDETAILS$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BillingDetails" element
     */
    public boolean isSetBillingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLINGDETAILS$2) != 0;
        }
    }

    /**
     * Sets the "BillingDetails" element
     */
    public void setBillingDetails(BillingDetails billingDetails)
    {
        generatedSetterHelperImpl(billingDetails, BILLINGDETAILS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "BillingDetails" element
     */
    public BillingDetails addNewBillingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            BillingDetails target = null;
            target = (BillingDetails)get_store().add_element_user(BILLINGDETAILS$2);
            return target;
        }
    }

    /**
     * Nils the "BillingDetails" element
     */
    public void setNilBillingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            BillingDetails target = null;
            target = (BillingDetails)get_store().find_element_user(BILLINGDETAILS$2, 0);
            if (target == null)
            {
                target = (BillingDetails)get_store().add_element_user(BILLINGDETAILS$2);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "BillingDetails" element
     */
    public void unsetBillingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLINGDETAILS$2, 0);
        }
    }

    /**
     * Gets the "CreditCardTransactionResults" element
     */
    public CreditCardTransactionResults getCreditCardTransactionResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            CreditCardTransactionResults target = null;
            target = (CreditCardTransactionResults)get_store().find_element_user(CREDITCARDTRANSACTIONRESULTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Tests for nil "CreditCardTransactionResults" element
     */
    public boolean isNilCreditCardTransactionResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            CreditCardTransactionResults target = null;
            target = (CreditCardTransactionResults)get_store().find_element_user(CREDITCARDTRANSACTIONRESULTS$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "CreditCardTransactionResults" element
     */
    public boolean isSetCreditCardTransactionResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREDITCARDTRANSACTIONRESULTS$4) != 0;
        }
    }

    /**
     * Sets the "CreditCardTransactionResults" element
     */
    public void setCreditCardTransactionResults(CreditCardTransactionResults creditCardTransactionResults)
    {
        generatedSetterHelperImpl(creditCardTransactionResults, CREDITCARDTRANSACTIONRESULTS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "CreditCardTransactionResults" element
     */
    public CreditCardTransactionResults addNewCreditCardTransactionResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            CreditCardTransactionResults target = null;
            target = (CreditCardTransactionResults)get_store().add_element_user(CREDITCARDTRANSACTIONRESULTS$4);
            return target;
        }
    }

    /**
     * Nils the "CreditCardTransactionResults" element
     */
    public void setNilCreditCardTransactionResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            CreditCardTransactionResults target = null;
            target = (CreditCardTransactionResults)get_store().find_element_user(CREDITCARDTRANSACTIONRESULTS$4, 0);
            if (target == null)
            {
                target = (CreditCardTransactionResults)get_store().add_element_user(CREDITCARDTRANSACTIONRESULTS$4);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "CreditCardTransactionResults" element
     */
    public void unsetCreditCardTransactionResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREDITCARDTRANSACTIONRESULTS$4, 0);
        }
    }

    /**
     * Gets the "CustomData" element
     */
    public String getCustomData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMDATA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "CustomData" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMDATA$6, 0);
            return target;
        }
    }

    /**
     * Tests for nil "CustomData" element
     */
    public boolean isNilCustomData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMDATA$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "CustomData" element
     */
    public boolean isSetCustomData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMDATA$6) != 0;
        }
    }

    /**
     * Sets the "CustomData" element
     */
    public void setCustomData(String customData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMDATA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMDATA$6);
            }
            target.setStringValue(customData);
        }
    }

    /**
     * Sets (as xml) the "CustomData" element
     */
    public void xsetCustomData(org.apache.xmlbeans.XmlString customData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMDATA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMDATA$6);
            }
            target.set(customData);
        }
    }

    /**
     * Nils the "CustomData" element
     */
    public void setNilCustomData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMDATA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMDATA$6);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "CustomData" element
     */
    public void unsetCustomData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMDATA$6, 0);
        }
    }

    /**
     * Gets the "IPGeoLocationResults" element
     */
    public IPGeoLocationResults getIPGeoLocationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            IPGeoLocationResults target = null;
            target = (IPGeoLocationResults)get_store().find_element_user(IPGEOLOCATIONRESULTS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Tests for nil "IPGeoLocationResults" element
     */
    public boolean isNilIPGeoLocationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            IPGeoLocationResults target = null;
            target = (IPGeoLocationResults)get_store().find_element_user(IPGEOLOCATIONRESULTS$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "IPGeoLocationResults" element
     */
    public boolean isSetIPGeoLocationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IPGEOLOCATIONRESULTS$8) != 0;
        }
    }

    /**
     * Sets the "IPGeoLocationResults" element
     */
    public void setIPGeoLocationResults(IPGeoLocationResults ipGeoLocationResults)
    {
        generatedSetterHelperImpl(ipGeoLocationResults, IPGEOLOCATIONRESULTS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "IPGeoLocationResults" element
     */
    public IPGeoLocationResults addNewIPGeoLocationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            IPGeoLocationResults target = null;
            target = (IPGeoLocationResults)get_store().add_element_user(IPGEOLOCATIONRESULTS$8);
            return target;
        }
    }

    /**
     * Nils the "IPGeoLocationResults" element
     */
    public void setNilIPGeoLocationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            IPGeoLocationResults target = null;
            target = (IPGeoLocationResults)get_store().find_element_user(IPGEOLOCATIONRESULTS$8, 0);
            if (target == null)
            {
                target = (IPGeoLocationResults)get_store().add_element_user(IPGEOLOCATIONRESULTS$8);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "IPGeoLocationResults" element
     */
    public void unsetIPGeoLocationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IPGEOLOCATIONRESULTS$8, 0);
        }
    }

    /**
     * Gets the "MerchantId" element
     */
    public String getMerchantId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERCHANTID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "MerchantId" element
     */
    public org.apache.xmlbeans.XmlString xgetMerchantId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERCHANTID$10, 0);
            return target;
        }
    }

    /**
     * Tests for nil "MerchantId" element
     */
    public boolean isNilMerchantId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERCHANTID$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "MerchantId" element
     */
    public boolean isSetMerchantId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MERCHANTID$10) != 0;
        }
    }

    /**
     * Sets the "MerchantId" element
     */
    public void setMerchantId(String merchantId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERCHANTID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MERCHANTID$10);
            }
            target.setStringValue(merchantId);
        }
    }

    /**
     * Sets (as xml) the "MerchantId" element
     */
    public void xsetMerchantId(org.apache.xmlbeans.XmlString merchantId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERCHANTID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MERCHANTID$10);
            }
            target.set(merchantId);
        }
    }

    /**
     * Nils the "MerchantId" element
     */
    public void setNilMerchantId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERCHANTID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MERCHANTID$10);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "MerchantId" element
     */
    public void unsetMerchantId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MERCHANTID$10, 0);
        }
    }

    /**
     * Gets the "OrderNumber" element
     */
    public String getOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "OrderNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$12, 0);
            return target;
        }
    }

    /**
     * Tests for nil "OrderNumber" element
     */
    public boolean isNilOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "OrderNumber" element
     */
    public boolean isSetOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORDERNUMBER$12) != 0;
        }
    }

    /**
     * Sets the "OrderNumber" element
     */
    public void setOrderNumber(String orderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNUMBER$12);
            }
            target.setStringValue(orderNumber);
        }
    }

    /**
     * Sets (as xml) the "OrderNumber" element
     */
    public void xsetOrderNumber(org.apache.xmlbeans.XmlString orderNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$12);
            }
            target.set(orderNumber);
        }
    }

    /**
     * Nils the "OrderNumber" element
     */
    public void setNilOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$12);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "OrderNumber" element
     */
    public void unsetOrderNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORDERNUMBER$12, 0);
        }
    }

    /**
     * Gets the "Signature" element
     */
    public String getSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Signature" element
     */
    public org.apache.xmlbeans.XmlString xgetSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATURE$14, 0);
            return target;
        }
    }

    /**
     * Tests for nil "Signature" element
     */
    public boolean isNilSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATURE$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "Signature" element
     */
    public boolean isSetSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNATURE$14) != 0;
        }
    }

    /**
     * Sets the "Signature" element
     */
    public void setSignature(String signature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATURE$14);
            }
            target.setStringValue(signature);
        }
    }

    /**
     * Sets (as xml) the "Signature" element
     */
    public void xsetSignature(org.apache.xmlbeans.XmlString signature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATURE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGNATURE$14);
            }
            target.set(signature);
        }
    }

    /**
     * Nils the "Signature" element
     */
    public void setNilSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATURE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGNATURE$14);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "Signature" element
     */
    public void unsetSignature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNATURE$14, 0);
        }
    }

    /**
     * Gets the "SignatureMethod" element
     */
    public String getSignatureMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREMETHOD$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "SignatureMethod" element
     */
    public org.apache.xmlbeans.XmlString xgetSignatureMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATUREMETHOD$16, 0);
            return target;
        }
    }

    /**
     * Tests for nil "SignatureMethod" element
     */
    public boolean isNilSignatureMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATUREMETHOD$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "SignatureMethod" element
     */
    public boolean isSetSignatureMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIGNATUREMETHOD$16) != 0;
        }
    }

    /**
     * Sets the "SignatureMethod" element
     */
    public void setSignatureMethod(String signatureMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREMETHOD$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATUREMETHOD$16);
            }
            target.setStringValue(signatureMethod);
        }
    }
    
    /**
     * Sets (as xml) the "SignatureMethod" element
     */
    public void xsetSignatureMethod(org.apache.xmlbeans.XmlString signatureMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATUREMETHOD$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGNATUREMETHOD$16);
            }
            target.set(signatureMethod);
        }
    }
    
    /**
     * Nils the "SignatureMethod" element
     */
    public void setNilSignatureMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATUREMETHOD$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGNATUREMETHOD$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SignatureMethod" element
     */
    public void unsetSignatureMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIGNATUREMETHOD$16, 0);
        }
    }
    
    /**
     * Gets the "BinCheckResults" element
     */
    public BinCheckResults getBinCheckResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            BinCheckResults target = null;
            target = (BinCheckResults)get_store().find_element_user(BINCHECKRESULTS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "BinCheckResults" element
     */
    public boolean isNilBinCheckResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            BinCheckResults target = null;
            target = (BinCheckResults)get_store().find_element_user(BINCHECKRESULTS$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "BinCheckResults" element
     */
    public boolean isSetBinCheckResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BINCHECKRESULTS$18) != 0;
        }
    }
    
    /**
     * Sets the "BinCheckResults" element
     */
    public void setBinCheckResults(BinCheckResults binCheckResults)
    {
        generatedSetterHelperImpl(binCheckResults, BINCHECKRESULTS$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BinCheckResults" element
     */
    public BinCheckResults addNewBinCheckResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            BinCheckResults target = null;
            target = (BinCheckResults)get_store().add_element_user(BINCHECKRESULTS$18);
            return target;
        }
    }
    
    /**
     * Nils the "BinCheckResults" element
     */
    public void setNilBinCheckResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            BinCheckResults target = null;
            target = (BinCheckResults)get_store().find_element_user(BINCHECKRESULTS$18, 0);
            if (target == null)
            {
                target = (BinCheckResults)get_store().add_element_user(BINCHECKRESULTS$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BinCheckResults" element
     */
    public void unsetBinCheckResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BINCHECKRESULTS$18, 0);
        }
    }
    
    /**
     * Gets the "FraudControlResults" element
     */
    public FraudControlResults getFraudControlResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            FraudControlResults target = null;
            target = (FraudControlResults)get_store().find_element_user(FRAUDCONTROLRESULTS$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "FraudControlResults" element
     */
    public boolean isNilFraudControlResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            FraudControlResults target = null;
            target = (FraudControlResults)get_store().find_element_user(FRAUDCONTROLRESULTS$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "FraudControlResults" element
     */
    public boolean isSetFraudControlResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRAUDCONTROLRESULTS$20) != 0;
        }
    }
    
    /**
     * Sets the "FraudControlResults" element
     */
    public void setFraudControlResults(FraudControlResults fraudControlResults)
    {
        generatedSetterHelperImpl(fraudControlResults, FRAUDCONTROLRESULTS$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FraudControlResults" element
     */
    public FraudControlResults addNewFraudControlResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            FraudControlResults target = null;
            target = (FraudControlResults)get_store().add_element_user(FRAUDCONTROLRESULTS$20);
            return target;
        }
    }
    
    /**
     * Nils the "FraudControlResults" element
     */
    public void setNilFraudControlResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            FraudControlResults target = null;
            target = (FraudControlResults)get_store().find_element_user(FRAUDCONTROLRESULTS$20, 0);
            if (target == null)
            {
                target = (FraudControlResults)get_store().add_element_user(FRAUDCONTROLRESULTS$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "FraudControlResults" element
     */
    public void unsetFraudControlResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRAUDCONTROLRESULTS$20, 0);
        }
    }
    
    /**
     * Gets the "ShippingDetails" element
     */
    public ShippingDetails getShippingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ShippingDetails target = null;
            target = (ShippingDetails)get_store().find_element_user(SHIPPINGDETAILS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingDetails" element
     */
    public boolean isNilShippingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ShippingDetails target = null;
            target = (ShippingDetails)get_store().find_element_user(SHIPPINGDETAILS$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ShippingDetails" element
     */
    public boolean isSetShippingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPPINGDETAILS$22) != 0;
        }
    }
    
    /**
     * Sets the "ShippingDetails" element
     */
    public void setShippingDetails(ShippingDetails shippingDetails)
    {
        generatedSetterHelperImpl(shippingDetails, SHIPPINGDETAILS$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ShippingDetails" element
     */
    public ShippingDetails addNewShippingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ShippingDetails target = null;
            target = (ShippingDetails)get_store().add_element_user(SHIPPINGDETAILS$22);
            return target;
        }
    }
    
    /**
     * Nils the "ShippingDetails" element
     */
    public void setNilShippingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ShippingDetails target = null;
            target = (ShippingDetails)get_store().find_element_user(SHIPPINGDETAILS$22, 0);
            if (target == null)
            {
                target = (ShippingDetails)get_store().add_element_user(SHIPPINGDETAILS$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ShippingDetails" element
     */
    public void unsetShippingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPPINGDETAILS$22, 0);
        }
    }
}
