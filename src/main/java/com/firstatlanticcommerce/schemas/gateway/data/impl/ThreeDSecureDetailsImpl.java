/*
 * XML Type:  ThreeDSecureDetails
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.ThreeDSecureDetails
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.ThreeDSecureDetails;

/**
 * An XML ThreeDSecureDetails(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class ThreeDSecureDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ThreeDSecureDetails
{
    private static final long serialVersionUID = 1L;
    
    public ThreeDSecureDetailsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHENTICATIONRESULT$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "AuthenticationResult");
    private static final javax.xml.namespace.QName CAVV$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "CAVV");
    private static final javax.xml.namespace.QName ECIINDICATOR$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ECIIndicator");
    private static final javax.xml.namespace.QName TRANSACTIONSTAIN$6 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "TransactionStain");
    
    
    /**
     * Gets the "AuthenticationResult" element
     */
    public String getAuthenticationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHENTICATIONRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "AuthenticationResult" element
     */
    public org.apache.xmlbeans.XmlString xgetAuthenticationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHENTICATIONRESULT$0, 0);
            return target;
        }
    }

    /**
     * Tests for nil "AuthenticationResult" element
     */
    public boolean isNilAuthenticationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHENTICATIONRESULT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "AuthenticationResult" element
     */
    public boolean isSetAuthenticationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHENTICATIONRESULT$0) != 0;
        }
    }

    /**
     * Sets the "AuthenticationResult" element
     */
    public void setAuthenticationResult(String authenticationResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHENTICATIONRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHENTICATIONRESULT$0);
            }
            target.setStringValue(authenticationResult);
        }
    }

    /**
     * Sets (as xml) the "AuthenticationResult" element
     */
    public void xsetAuthenticationResult(org.apache.xmlbeans.XmlString authenticationResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHENTICATIONRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHENTICATIONRESULT$0);
            }
            target.set(authenticationResult);
        }
    }

    /**
     * Nils the "AuthenticationResult" element
     */
    public void setNilAuthenticationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHENTICATIONRESULT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHENTICATIONRESULT$0);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "AuthenticationResult" element
     */
    public void unsetAuthenticationResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHENTICATIONRESULT$0, 0);
        }
    }

    /**
     * Gets the "CAVV" element
     */
    public String getCAVV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAVV$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "CAVV" element
     */
    public org.apache.xmlbeans.XmlString xgetCAVV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAVV$2, 0);
            return target;
        }
    }

    /**
     * Tests for nil "CAVV" element
     */
    public boolean isNilCAVV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAVV$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "CAVV" element
     */
    public boolean isSetCAVV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAVV$2) != 0;
        }
    }

    /**
     * Sets the "CAVV" element
     */
    public void setCAVV(String cavv)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAVV$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAVV$2);
            }
            target.setStringValue(cavv);
        }
    }

    /**
     * Sets (as xml) the "CAVV" element
     */
    public void xsetCAVV(org.apache.xmlbeans.XmlString cavv)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAVV$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CAVV$2);
            }
            target.set(cavv);
        }
    }

    /**
     * Nils the "CAVV" element
     */
    public void setNilCAVV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAVV$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CAVV$2);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "CAVV" element
     */
    public void unsetCAVV()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAVV$2, 0);
        }
    }

    /**
     * Gets the "ECIIndicator" element
     */
    public String getECIIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ECIINDICATOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ECIIndicator" element
     */
    public org.apache.xmlbeans.XmlString xgetECIIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ECIINDICATOR$4, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ECIIndicator" element
     */
    public boolean isNilECIIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ECIINDICATOR$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ECIIndicator" element
     */
    public boolean isSetECIIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ECIINDICATOR$4) != 0;
        }
    }

    /**
     * Sets the "ECIIndicator" element
     */
    public void setECIIndicator(String eciIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ECIINDICATOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ECIINDICATOR$4);
            }
            target.setStringValue(eciIndicator);
        }
    }

    /**
     * Sets (as xml) the "ECIIndicator" element
     */
    public void xsetECIIndicator(org.apache.xmlbeans.XmlString eciIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ECIINDICATOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ECIINDICATOR$4);
            }
            target.set(eciIndicator);
        }
    }

    /**
     * Nils the "ECIIndicator" element
     */
    public void setNilECIIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ECIINDICATOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ECIINDICATOR$4);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ECIIndicator" element
     */
    public void unsetECIIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ECIINDICATOR$4, 0);
        }
    }

    /**
     * Gets the "TransactionStain" element
     */
    public String getTransactionStain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONSTAIN$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "TransactionStain" element
     */
    public org.apache.xmlbeans.XmlString xgetTransactionStain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSACTIONSTAIN$6, 0);
            return target;
        }
    }

    /**
     * Tests for nil "TransactionStain" element
     */
    public boolean isNilTransactionStain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSACTIONSTAIN$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "TransactionStain" element
     */
    public boolean isSetTransactionStain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONSTAIN$6) != 0;
        }
    }

    /**
     * Sets the "TransactionStain" element
     */
    public void setTransactionStain(String transactionStain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSACTIONSTAIN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSACTIONSTAIN$6);
            }
            target.setStringValue(transactionStain);
        }
    }
    
    /**
     * Sets (as xml) the "TransactionStain" element
     */
    public void xsetTransactionStain(org.apache.xmlbeans.XmlString transactionStain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSACTIONSTAIN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANSACTIONSTAIN$6);
            }
            target.set(transactionStain);
        }
    }
    
    /**
     * Nils the "TransactionStain" element
     */
    public void setNilTransactionStain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRANSACTIONSTAIN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRANSACTIONSTAIN$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "TransactionStain" element
     */
    public void unsetTransactionStain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONSTAIN$6, 0);
        }
    }
}
