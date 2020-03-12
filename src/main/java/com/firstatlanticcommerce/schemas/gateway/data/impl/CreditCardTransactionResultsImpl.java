/*
 * XML Type:  CreditCardTransactionResults
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.CreditCardTransactionResults
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.CreditCardTransactionResults;

/**
 * An XML CreditCardTransactionResults(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class CreditCardTransactionResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements CreditCardTransactionResults
{
    private static final long serialVersionUID = 1L;
    
    public CreditCardTransactionResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AVSRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "AVSResult");
    private static final javax.xml.namespace.QName AUTHCODE$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "AuthCode");
    private static final javax.xml.namespace.QName CVV2RESULT$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "CVV2Result");
    private static final javax.xml.namespace.QName ORIGINALRESPONSECODE$6 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "OriginalResponseCode");
    private static final javax.xml.namespace.QName PADDEDCARDNUMBER$8 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "PaddedCardNumber");
    private static final javax.xml.namespace.QName REASONCODE$10 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ReasonCode");
    private static final javax.xml.namespace.QName REASONCODEDESCRIPTION$12 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ReasonCodeDescription");
    private static final javax.xml.namespace.QName REFERENCENUMBER$14 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ReferenceNumber");
    private static final javax.xml.namespace.QName RESPONSECODE$16 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ResponseCode");
    private static final javax.xml.namespace.QName TOKENIZEDPAN$18 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "TokenizedPAN");
    
    
    /**
     * Gets the "AVSResult" element
     */
    public String getAVSResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVSRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "AVSResult" element
     */
    public org.apache.xmlbeans.XmlString xgetAVSResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AVSRESULT$0, 0);
            return target;
        }
    }

    /**
     * Tests for nil "AVSResult" element
     */
    public boolean isNilAVSResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AVSRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "AVSResult" element
     */
    public boolean isSetAVSResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVSRESULT$0) != 0;
        }
    }

    /**
     * Sets the "AVSResult" element
     */
    public void setAVSResult(String avsResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVSRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVSRESULT$0);
            }
            target.setStringValue(avsResult);
        }
    }

    /**
     * Sets (as xml) the "AVSResult" element
     */
    public void xsetAVSResult(org.apache.xmlbeans.XmlString avsResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AVSRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AVSRESULT$0);
            }
            target.set(avsResult);
        }
    }

    /**
     * Nils the "AVSResult" element
     */
    public void setNilAVSResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AVSRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AVSRESULT$0);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "AVSResult" element
     */
    public void unsetAVSResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVSRESULT$0, 0);
        }
    }

    /**
     * Gets the "AuthCode" element
     */
    public String getAuthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "AuthCode" element
     */
    public org.apache.xmlbeans.XmlString xgetAuthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHCODE$2, 0);
            return target;
        }
    }

    /**
     * Tests for nil "AuthCode" element
     */
    public boolean isNilAuthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHCODE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "AuthCode" element
     */
    public boolean isSetAuthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHCODE$2) != 0;
        }
    }

    /**
     * Sets the "AuthCode" element
     */
    public void setAuthCode(String authCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHCODE$2);
            }
            target.setStringValue(authCode);
        }
    }

    /**
     * Sets (as xml) the "AuthCode" element
     */
    public void xsetAuthCode(org.apache.xmlbeans.XmlString authCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHCODE$2);
            }
            target.set(authCode);
        }
    }

    /**
     * Nils the "AuthCode" element
     */
    public void setNilAuthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHCODE$2);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "AuthCode" element
     */
    public void unsetAuthCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHCODE$2, 0);
        }
    }

    /**
     * Gets the "CVV2Result" element
     */
    public String getCVV2Result()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVV2RESULT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "CVV2Result" element
     */
    public org.apache.xmlbeans.XmlString xgetCVV2Result()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVV2RESULT$4, 0);
            return target;
        }
    }

    /**
     * Tests for nil "CVV2Result" element
     */
    public boolean isNilCVV2Result()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVV2RESULT$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "CVV2Result" element
     */
    public boolean isSetCVV2Result()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CVV2RESULT$4) != 0;
        }
    }

    /**
     * Sets the "CVV2Result" element
     */
    public void setCVV2Result(String cvv2Result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CVV2RESULT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CVV2RESULT$4);
            }
            target.setStringValue(cvv2Result);
        }
    }

    /**
     * Sets (as xml) the "CVV2Result" element
     */
    public void xsetCVV2Result(org.apache.xmlbeans.XmlString cvv2Result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVV2RESULT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CVV2RESULT$4);
            }
            target.set(cvv2Result);
        }
    }

    /**
     * Nils the "CVV2Result" element
     */
    public void setNilCVV2Result()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CVV2RESULT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CVV2RESULT$4);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "CVV2Result" element
     */
    public void unsetCVV2Result()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CVV2RESULT$4, 0);
        }
    }

    /**
     * Gets the "OriginalResponseCode" element
     */
    public String getOriginalResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINALRESPONSECODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "OriginalResponseCode" element
     */
    public org.apache.xmlbeans.XmlString xgetOriginalResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINALRESPONSECODE$6, 0);
            return target;
        }
    }

    /**
     * Tests for nil "OriginalResponseCode" element
     */
    public boolean isNilOriginalResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINALRESPONSECODE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "OriginalResponseCode" element
     */
    public boolean isSetOriginalResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINALRESPONSECODE$6) != 0;
        }
    }

    /**
     * Sets the "OriginalResponseCode" element
     */
    public void setOriginalResponseCode(String originalResponseCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINALRESPONSECODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINALRESPONSECODE$6);
            }
            target.setStringValue(originalResponseCode);
        }
    }

    /**
     * Sets (as xml) the "OriginalResponseCode" element
     */
    public void xsetOriginalResponseCode(org.apache.xmlbeans.XmlString originalResponseCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINALRESPONSECODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORIGINALRESPONSECODE$6);
            }
            target.set(originalResponseCode);
        }
    }

    /**
     * Nils the "OriginalResponseCode" element
     */
    public void setNilOriginalResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORIGINALRESPONSECODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORIGINALRESPONSECODE$6);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "OriginalResponseCode" element
     */
    public void unsetOriginalResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINALRESPONSECODE$6, 0);
        }
    }

    /**
     * Gets the "PaddedCardNumber" element
     */
    public String getPaddedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PADDEDCARDNUMBER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "PaddedCardNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetPaddedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PADDEDCARDNUMBER$8, 0);
            return target;
        }
    }

    /**
     * Tests for nil "PaddedCardNumber" element
     */
    public boolean isNilPaddedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PADDEDCARDNUMBER$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "PaddedCardNumber" element
     */
    public boolean isSetPaddedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PADDEDCARDNUMBER$8) != 0;
        }
    }

    /**
     * Sets the "PaddedCardNumber" element
     */
    public void setPaddedCardNumber(String paddedCardNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PADDEDCARDNUMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PADDEDCARDNUMBER$8);
            }
            target.setStringValue(paddedCardNumber);
        }
    }

    /**
     * Sets (as xml) the "PaddedCardNumber" element
     */
    public void xsetPaddedCardNumber(org.apache.xmlbeans.XmlString paddedCardNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PADDEDCARDNUMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PADDEDCARDNUMBER$8);
            }
            target.set(paddedCardNumber);
        }
    }

    /**
     * Nils the "PaddedCardNumber" element
     */
    public void setNilPaddedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PADDEDCARDNUMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PADDEDCARDNUMBER$8);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "PaddedCardNumber" element
     */
    public void unsetPaddedCardNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PADDEDCARDNUMBER$8, 0);
        }
    }

    /**
     * Gets the "ReasonCode" element
     */
    public String getReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ReasonCode" element
     */
    public org.apache.xmlbeans.XmlString xgetReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODE$10, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ReasonCode" element
     */
    public boolean isNilReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODE$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ReasonCode" element
     */
    public boolean isSetReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASONCODE$10) != 0;
        }
    }

    /**
     * Sets the "ReasonCode" element
     */
    public void setReasonCode(String reasonCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASONCODE$10);
            }
            target.setStringValue(reasonCode);
        }
    }

    /**
     * Sets (as xml) the "ReasonCode" element
     */
    public void xsetReasonCode(org.apache.xmlbeans.XmlString reasonCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASONCODE$10);
            }
            target.set(reasonCode);
        }
    }

    /**
     * Nils the "ReasonCode" element
     */
    public void setNilReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASONCODE$10);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ReasonCode" element
     */
    public void unsetReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASONCODE$10, 0);
        }
    }

    /**
     * Gets the "ReasonCodeDescription" element
     */
    public String getReasonCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODEDESCRIPTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ReasonCodeDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetReasonCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODEDESCRIPTION$12, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ReasonCodeDescription" element
     */
    public boolean isNilReasonCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODEDESCRIPTION$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ReasonCodeDescription" element
     */
    public boolean isSetReasonCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASONCODEDESCRIPTION$12) != 0;
        }
    }

    /**
     * Sets the "ReasonCodeDescription" element
     */
    public void setReasonCodeDescription(String reasonCodeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODEDESCRIPTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASONCODEDESCRIPTION$12);
            }
            target.setStringValue(reasonCodeDescription);
        }
    }

    /**
     * Sets (as xml) the "ReasonCodeDescription" element
     */
    public void xsetReasonCodeDescription(org.apache.xmlbeans.XmlString reasonCodeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODEDESCRIPTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASONCODEDESCRIPTION$12);
            }
            target.set(reasonCodeDescription);
        }
    }

    /**
     * Nils the "ReasonCodeDescription" element
     */
    public void setNilReasonCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODEDESCRIPTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASONCODEDESCRIPTION$12);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ReasonCodeDescription" element
     */
    public void unsetReasonCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASONCODEDESCRIPTION$12, 0);
        }
    }

    /**
     * Gets the "ReferenceNumber" element
     */
    public String getReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCENUMBER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ReferenceNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCENUMBER$14, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ReferenceNumber" element
     */
    public boolean isNilReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCENUMBER$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ReferenceNumber" element
     */
    public boolean isSetReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCENUMBER$14) != 0;
        }
    }

    /**
     * Sets the "ReferenceNumber" element
     */
    public void setReferenceNumber(String referenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCENUMBER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCENUMBER$14);
            }
            target.setStringValue(referenceNumber);
        }
    }

    /**
     * Sets (as xml) the "ReferenceNumber" element
     */
    public void xsetReferenceNumber(org.apache.xmlbeans.XmlString referenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCENUMBER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCENUMBER$14);
            }
            target.set(referenceNumber);
        }
    }

    /**
     * Nils the "ReferenceNumber" element
     */
    public void setNilReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCENUMBER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCENUMBER$14);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ReferenceNumber" element
     */
    public void unsetReferenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCENUMBER$14, 0);
        }
    }

    /**
     * Gets the "ResponseCode" element
     */
    public String getResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSECODE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ResponseCode" element
     */
    public org.apache.xmlbeans.XmlString xgetResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODE$16, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ResponseCode" element
     */
    public boolean isNilResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODE$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ResponseCode" element
     */
    public boolean isSetResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSECODE$16) != 0;
        }
    }

    /**
     * Sets the "ResponseCode" element
     */
    public void setResponseCode(String responseCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSECODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSECODE$16);
            }
            target.setStringValue(responseCode);
        }
    }

    /**
     * Sets (as xml) the "ResponseCode" element
     */
    public void xsetResponseCode(org.apache.xmlbeans.XmlString responseCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSECODE$16);
            }
            target.set(responseCode);
        }
    }

    /**
     * Nils the "ResponseCode" element
     */
    public void setNilResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSECODE$16);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ResponseCode" element
     */
    public void unsetResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSECODE$16, 0);
        }
    }

    /**
     * Gets the "TokenizedPAN" element
     */
    public String getTokenizedPAN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENIZEDPAN$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "TokenizedPAN" element
     */
    public org.apache.xmlbeans.XmlString xgetTokenizedPAN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENIZEDPAN$18, 0);
            return target;
        }
    }

    /**
     * Tests for nil "TokenizedPAN" element
     */
    public boolean isNilTokenizedPAN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENIZEDPAN$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "TokenizedPAN" element
     */
    public boolean isSetTokenizedPAN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOKENIZEDPAN$18) != 0;
        }
    }

    /**
     * Sets the "TokenizedPAN" element
     */
    public void setTokenizedPAN(String tokenizedPAN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENIZEDPAN$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOKENIZEDPAN$18);
            }
            target.setStringValue(tokenizedPAN);
        }
    }
    
    /**
     * Sets (as xml) the "TokenizedPAN" element
     */
    public void xsetTokenizedPAN(org.apache.xmlbeans.XmlString tokenizedPAN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENIZEDPAN$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOKENIZEDPAN$18);
            }
            target.set(tokenizedPAN);
        }
    }
    
    /**
     * Nils the "TokenizedPAN" element
     */
    public void setNilTokenizedPAN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENIZEDPAN$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOKENIZEDPAN$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TokenizedPAN" element
     */
    public void unsetTokenizedPAN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOKENIZEDPAN$18, 0);
        }
    }
}
