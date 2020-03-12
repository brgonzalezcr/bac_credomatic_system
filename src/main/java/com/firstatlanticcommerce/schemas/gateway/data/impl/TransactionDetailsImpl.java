/*
 * XML Type:  TransactionDetails
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.TransactionDetails
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.TransactionDetails;

/**
 * An XML TransactionDetails(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class TransactionDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements TransactionDetails
{
    private static final long serialVersionUID = 1L;
    
    public TransactionDetailsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACQUIRERID$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "AcquirerId");
    private static final javax.xml.namespace.QName AMOUNT$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Amount");
    private static final javax.xml.namespace.QName CURRENCY$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Currency");
    private static final javax.xml.namespace.QName CURRENCYEXPONENT$6 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "CurrencyExponent");
    private static final javax.xml.namespace.QName CUSTOMDATA$8 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "CustomData");
    private static final javax.xml.namespace.QName IPADDRESS$10 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "IPAddress");
    private static final javax.xml.namespace.QName MERCHANTID$12 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "MerchantId");
    private static final javax.xml.namespace.QName ORDERNUMBER$14 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "OrderNumber");
    private static final javax.xml.namespace.QName SIGNATURE$16 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Signature");
    private static final javax.xml.namespace.QName SIGNATUREMETHOD$18 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "SignatureMethod");
    private static final javax.xml.namespace.QName TRANSACTIONCODE$20 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "TransactionCode");
    private static final javax.xml.namespace.QName CUSTOMERREFERENCE$22 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "CustomerReference");
    
    
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
     * Gets the "Amount" element
     */
    public String getAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Amount" element
     */
    public org.apache.xmlbeans.XmlString xgetAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AMOUNT$2, 0);
            return target;
        }
    }

    /**
     * Tests for nil "Amount" element
     */
    public boolean isNilAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AMOUNT$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * Sets the "Amount" element
     */
    public void setAmount(String amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMOUNT$2);
            }
            target.setStringValue(amount);
        }
    }

    /**
     * Sets (as xml) the "Amount" element
     */
    public void xsetAmount(org.apache.xmlbeans.XmlString amount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AMOUNT$2);
            }
            target.set(amount);
        }
    }

    /**
     * Nils the "Amount" element
     */
    public void setNilAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AMOUNT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AMOUNT$2);
            }
            target.setNil();
        }
    }

    /**
     * Gets the "Currency" element
     */
    public String getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Currency" element
     */
    public org.apache.xmlbeans.XmlString xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$4, 0);
            return target;
        }
    }

    /**
     * Tests for nil "Currency" element
     */
    public boolean isNilCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * Sets the "Currency" element
     */
    public void setCurrency(String currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCY$4);
            }
            target.setStringValue(currency);
        }
    }

    /**
     * Sets (as xml) the "Currency" element
     */
    public void xsetCurrency(org.apache.xmlbeans.XmlString currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCY$4);
            }
            target.set(currency);
        }
    }

    /**
     * Nils the "Currency" element
     */
    public void setNilCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENCY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENCY$4);
            }
            target.setNil();
        }
    }

    /**
     * Gets the "CurrencyExponent" element
     */
    public int getCurrencyExponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYEXPONENT$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "CurrencyExponent" element
     */
    public org.apache.xmlbeans.XmlInt xgetCurrencyExponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENCYEXPONENT$6, 0);
            return target;
        }
    }

    /**
     * Sets the "CurrencyExponent" element
     */
    public void setCurrencyExponent(int currencyExponent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENCYEXPONENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENCYEXPONENT$6);
            }
            target.setIntValue(currencyExponent);
        }
    }

    /**
     * Sets (as xml) the "CurrencyExponent" element
     */
    public void xsetCurrencyExponent(org.apache.xmlbeans.XmlInt currencyExponent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CURRENCYEXPONENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CURRENCYEXPONENT$6);
            }
            target.set(currencyExponent);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMDATA$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMDATA$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMDATA$8, 0);
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
            return get_store().count_elements(CUSTOMDATA$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMDATA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMDATA$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMDATA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMDATA$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMDATA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMDATA$8);
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
            get_store().remove_element(CUSTOMDATA$8, 0);
        }
    }

    /**
     * Gets the "IPAddress" element
     */
    public String getIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPADDRESS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "IPAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPADDRESS$10, 0);
            return target;
        }
    }

    /**
     * Tests for nil "IPAddress" element
     */
    public boolean isNilIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPADDRESS$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "IPAddress" element
     */
    public boolean isSetIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IPADDRESS$10) != 0;
        }
    }

    /**
     * Sets the "IPAddress" element
     */
    public void setIPAddress(String ipAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IPADDRESS$10);
            }
            target.setStringValue(ipAddress);
        }
    }

    /**
     * Sets (as xml) the "IPAddress" element
     */
    public void xsetIPAddress(org.apache.xmlbeans.XmlString ipAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IPADDRESS$10);
            }
            target.set(ipAddress);
        }
    }

    /**
     * Nils the "IPAddress" element
     */
    public void setNilIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IPADDRESS$10);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "IPAddress" element
     */
    public void unsetIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IPADDRESS$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERCHANTID$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERCHANTID$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERCHANTID$12, 0);
            if (target == null) return false;
            return target.isNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERCHANTID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MERCHANTID$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERCHANTID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MERCHANTID$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERCHANTID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MERCHANTID$12);
            }
            target.setNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$14, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$14, 0);
            if (target == null) return false;
            return target.isNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERNUMBER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERNUMBER$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERNUMBER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERNUMBER$14);
            }
            target.setNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURE$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATURE$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATURE$16, 0);
            if (target == null) return false;
            return target.isNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATURE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATURE$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATURE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGNATURE$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATURE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGNATURE$16);
            }
            target.setNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREMETHOD$18, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATUREMETHOD$18, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATUREMETHOD$18, 0);
            if (target == null) return false;
            return target.isNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREMETHOD$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATUREMETHOD$18);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATUREMETHOD$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGNATUREMETHOD$18);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIGNATUREMETHOD$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIGNATUREMETHOD$18);
            }
            target.setNil();
        }
    }

    /**
     * Gets the "TransactionCode" element
     */
    public int getTransactionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONCODE$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }

    /**
     * Gets (as xml) the "TransactionCode" element
     */
    public org.apache.xmlbeans.XmlInt xgetTransactionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRANSACTIONCODE$20, 0);
            return target;
        }
    }

    /**
     * Sets the "TransactionCode" element
     */
    public void setTransactionCode(int transactionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONCODE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONCODE$20);
            }
            target.setIntValue(transactionCode);
        }
    }

    /**
     * Sets (as xml) the "TransactionCode" element
     */
    public void xsetTransactionCode(org.apache.xmlbeans.XmlInt transactionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRANSACTIONCODE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TRANSACTIONCODE$20);
            }
            target.set(transactionCode);
        }
    }

    /**
     * Gets the "CustomerReference" element
     */
    public String getCustomerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERREFERENCE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "CustomerReference" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERREFERENCE$22, 0);
            return target;
        }
    }

    /**
     * Tests for nil "CustomerReference" element
     */
    public boolean isNilCustomerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERREFERENCE$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "CustomerReference" element
     */
    public boolean isSetCustomerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERREFERENCE$22) != 0;
        }
    }

    /**
     * Sets the "CustomerReference" element
     */
    public void setCustomerReference(String customerReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERREFERENCE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERREFERENCE$22);
            }
            target.setStringValue(customerReference);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerReference" element
     */
    public void xsetCustomerReference(org.apache.xmlbeans.XmlString customerReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERREFERENCE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERREFERENCE$22);
            }
            target.set(customerReference);
        }
    }
    
    /**
     * Nils the "CustomerReference" element
     */
    public void setNilCustomerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERREFERENCE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERREFERENCE$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "CustomerReference" element
     */
    public void unsetCustomerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERREFERENCE$22, 0);
        }
    }
}
