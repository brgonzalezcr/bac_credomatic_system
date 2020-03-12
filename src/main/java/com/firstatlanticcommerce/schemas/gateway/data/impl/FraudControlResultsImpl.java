/*
 * XML Type:  FraudControlResults
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.FraudControlResults
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.FraudControlResults;

/**
 * An XML FraudControlResults(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class FraudControlResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements FraudControlResults
{
    private static final long serialVersionUID = 1L;
    
    public FraudControlResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FRAUDCONTROLID$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "FraudControlId");
    private static final javax.xml.namespace.QName FRAUDRESPONSECODE$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "FraudResponseCode");
    private static final javax.xml.namespace.QName REASONCODE$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ReasonCode");
    private static final javax.xml.namespace.QName REASONCODEDESC$6 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ReasonCodeDesc");
    private static final javax.xml.namespace.QName RESPONSECODE$8 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ResponseCode");
    private static final javax.xml.namespace.QName SCORE$10 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Score");
    
    
    /**
     * Gets the "FraudControlId" element
     */
    public String getFraudControlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRAUDCONTROLID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "FraudControlId" element
     */
    public org.apache.xmlbeans.XmlString xgetFraudControlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRAUDCONTROLID$0, 0);
            return target;
        }
    }

    /**
     * Tests for nil "FraudControlId" element
     */
    public boolean isNilFraudControlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRAUDCONTROLID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "FraudControlId" element
     */
    public boolean isSetFraudControlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRAUDCONTROLID$0) != 0;
        }
    }

    /**
     * Sets the "FraudControlId" element
     */
    public void setFraudControlId(String fraudControlId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRAUDCONTROLID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FRAUDCONTROLID$0);
            }
            target.setStringValue(fraudControlId);
        }
    }

    /**
     * Sets (as xml) the "FraudControlId" element
     */
    public void xsetFraudControlId(org.apache.xmlbeans.XmlString fraudControlId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRAUDCONTROLID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FRAUDCONTROLID$0);
            }
            target.set(fraudControlId);
        }
    }

    /**
     * Nils the "FraudControlId" element
     */
    public void setNilFraudControlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRAUDCONTROLID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FRAUDCONTROLID$0);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "FraudControlId" element
     */
    public void unsetFraudControlId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRAUDCONTROLID$0, 0);
        }
    }

    /**
     * Gets the "FraudResponseCode" element
     */
    public String getFraudResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRAUDRESPONSECODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "FraudResponseCode" element
     */
    public org.apache.xmlbeans.XmlString xgetFraudResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRAUDRESPONSECODE$2, 0);
            return target;
        }
    }

    /**
     * Tests for nil "FraudResponseCode" element
     */
    public boolean isNilFraudResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRAUDRESPONSECODE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "FraudResponseCode" element
     */
    public boolean isSetFraudResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FRAUDRESPONSECODE$2) != 0;
        }
    }

    /**
     * Sets the "FraudResponseCode" element
     */
    public void setFraudResponseCode(String fraudResponseCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FRAUDRESPONSECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FRAUDRESPONSECODE$2);
            }
            target.setStringValue(fraudResponseCode);
        }
    }

    /**
     * Sets (as xml) the "FraudResponseCode" element
     */
    public void xsetFraudResponseCode(org.apache.xmlbeans.XmlString fraudResponseCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRAUDRESPONSECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FRAUDRESPONSECODE$2);
            }
            target.set(fraudResponseCode);
        }
    }

    /**
     * Nils the "FraudResponseCode" element
     */
    public void setNilFraudResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FRAUDRESPONSECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FRAUDRESPONSECODE$2);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "FraudResponseCode" element
     */
    public void unsetFraudResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FRAUDRESPONSECODE$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODE$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODE$4, 0);
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
            return get_store().count_elements(REASONCODE$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASONCODE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASONCODE$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASONCODE$4);
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
            get_store().remove_element(REASONCODE$4, 0);
        }
    }

    /**
     * Gets the "ReasonCodeDesc" element
     */
    public String getReasonCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODEDESC$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ReasonCodeDesc" element
     */
    public org.apache.xmlbeans.XmlString xgetReasonCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODEDESC$6, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ReasonCodeDesc" element
     */
    public boolean isNilReasonCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODEDESC$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ReasonCodeDesc" element
     */
    public boolean isSetReasonCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASONCODEDESC$6) != 0;
        }
    }

    /**
     * Sets the "ReasonCodeDesc" element
     */
    public void setReasonCodeDesc(String reasonCodeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASONCODEDESC$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASONCODEDESC$6);
            }
            target.setStringValue(reasonCodeDesc);
        }
    }

    /**
     * Sets (as xml) the "ReasonCodeDesc" element
     */
    public void xsetReasonCodeDesc(org.apache.xmlbeans.XmlString reasonCodeDesc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODEDESC$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASONCODEDESC$6);
            }
            target.set(reasonCodeDesc);
        }
    }

    /**
     * Nils the "ReasonCodeDesc" element
     */
    public void setNilReasonCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASONCODEDESC$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASONCODEDESC$6);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ReasonCodeDesc" element
     */
    public void unsetReasonCodeDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASONCODEDESC$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSECODE$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODE$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODE$8, 0);
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
            return get_store().count_elements(RESPONSECODE$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSECODE$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSECODE$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSECODE$8);
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
            get_store().remove_element(RESPONSECODE$8, 0);
        }
    }

    /**
     * Gets the "Score" element
     */
    public String getScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Score" element
     */
    public org.apache.xmlbeans.XmlString xgetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCORE$10, 0);
            return target;
        }
    }

    /**
     * Tests for nil "Score" element
     */
    public boolean isNilScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCORE$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "Score" element
     */
    public boolean isSetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCORE$10) != 0;
        }
    }

    /**
     * Sets the "Score" element
     */
    public void setScore(String score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCORE$10);
            }
            target.setStringValue(score);
        }
    }
    
    /**
     * Sets (as xml) the "Score" element
     */
    public void xsetScore(org.apache.xmlbeans.XmlString score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCORE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCORE$10);
            }
            target.set(score);
        }
    }
    
    /**
     * Nils the "Score" element
     */
    public void setNilScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCORE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCORE$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Score" element
     */
    public void unsetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCORE$10, 0);
        }
    }
}
