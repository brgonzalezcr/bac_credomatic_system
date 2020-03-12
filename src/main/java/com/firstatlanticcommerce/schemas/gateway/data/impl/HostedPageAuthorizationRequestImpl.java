/*
 * XML Type:  HostedPageAuthorizationRequest
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.HostedPageAuthorizationRequest
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.HostedPageAuthorizationRequest;
import com.firstatlanticcommerce.schemas.gateway.data.RecurringDetails;
import com.firstatlanticcommerce.schemas.gateway.data.ThreeDSecureDetails;
import com.firstatlanticcommerce.schemas.gateway.data.TransactionDetails;

/**
 * An XML HostedPageAuthorizationRequest(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class HostedPageAuthorizationRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPageAuthorizationRequest
{
    private static final long serialVersionUID = 1L;
    
    public HostedPageAuthorizationRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARDHOLDERRESPONSEURL$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "CardHolderResponseURL");
    private static final javax.xml.namespace.QName MERRESPURL$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "MerRespURL");
    private static final javax.xml.namespace.QName RECURRINGDETAILS$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "RecurringDetails");
    private static final javax.xml.namespace.QName THREEDSECUREDETAILS$6 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ThreeDSecureDetails");
    private static final javax.xml.namespace.QName TRANSACTIONDETAILS$8 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "TransactionDetails");
    private static final javax.xml.namespace.QName SESSIONID$10 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "SessionID");
    
    
    /**
     * Gets the "CardHolderResponseURL" element
     */
    public String getCardHolderResponseURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDHOLDERRESPONSEURL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "CardHolderResponseURL" element
     */
    public org.apache.xmlbeans.XmlString xgetCardHolderResponseURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARDHOLDERRESPONSEURL$0, 0);
            return target;
        }
    }

    /**
     * Tests for nil "CardHolderResponseURL" element
     */
    public boolean isNilCardHolderResponseURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARDHOLDERRESPONSEURL$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "CardHolderResponseURL" element
     */
    public boolean isSetCardHolderResponseURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARDHOLDERRESPONSEURL$0) != 0;
        }
    }

    /**
     * Sets the "CardHolderResponseURL" element
     */
    public void setCardHolderResponseURL(String cardHolderResponseURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDHOLDERRESPONSEURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARDHOLDERRESPONSEURL$0);
            }
            target.setStringValue(cardHolderResponseURL);
        }
    }

    /**
     * Sets (as xml) the "CardHolderResponseURL" element
     */
    public void xsetCardHolderResponseURL(org.apache.xmlbeans.XmlString cardHolderResponseURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARDHOLDERRESPONSEURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARDHOLDERRESPONSEURL$0);
            }
            target.set(cardHolderResponseURL);
        }
    }

    /**
     * Nils the "CardHolderResponseURL" element
     */
    public void setNilCardHolderResponseURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CARDHOLDERRESPONSEURL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CARDHOLDERRESPONSEURL$0);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "CardHolderResponseURL" element
     */
    public void unsetCardHolderResponseURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARDHOLDERRESPONSEURL$0, 0);
        }
    }

    /**
     * Gets the "MerRespURL" element
     */
    public String getMerRespURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERRESPURL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "MerRespURL" element
     */
    public org.apache.xmlbeans.XmlString xgetMerRespURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERRESPURL$2, 0);
            return target;
        }
    }

    /**
     * Tests for nil "MerRespURL" element
     */
    public boolean isNilMerRespURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERRESPURL$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "MerRespURL" element
     */
    public boolean isSetMerRespURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MERRESPURL$2) != 0;
        }
    }

    /**
     * Sets the "MerRespURL" element
     */
    public void setMerRespURL(String merRespURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MERRESPURL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MERRESPURL$2);
            }
            target.setStringValue(merRespURL);
        }
    }

    /**
     * Sets (as xml) the "MerRespURL" element
     */
    public void xsetMerRespURL(org.apache.xmlbeans.XmlString merRespURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERRESPURL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MERRESPURL$2);
            }
            target.set(merRespURL);
        }
    }

    /**
     * Nils the "MerRespURL" element
     */
    public void setNilMerRespURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MERRESPURL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MERRESPURL$2);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "MerRespURL" element
     */
    public void unsetMerRespURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MERRESPURL$2, 0);
        }
    }

    /**
     * Gets the "RecurringDetails" element
     */
    public RecurringDetails getRecurringDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            RecurringDetails target = null;
            target = (RecurringDetails)get_store().find_element_user(RECURRINGDETAILS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Tests for nil "RecurringDetails" element
     */
    public boolean isNilRecurringDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            RecurringDetails target = null;
            target = (RecurringDetails)get_store().find_element_user(RECURRINGDETAILS$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "RecurringDetails" element
     */
    public boolean isSetRecurringDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECURRINGDETAILS$4) != 0;
        }
    }

    /**
     * Sets the "RecurringDetails" element
     */
    public void setRecurringDetails(RecurringDetails recurringDetails)
    {
        generatedSetterHelperImpl(recurringDetails, RECURRINGDETAILS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "RecurringDetails" element
     */
    public RecurringDetails addNewRecurringDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            RecurringDetails target = null;
            target = (RecurringDetails)get_store().add_element_user(RECURRINGDETAILS$4);
            return target;
        }
    }

    /**
     * Nils the "RecurringDetails" element
     */
    public void setNilRecurringDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            RecurringDetails target = null;
            target = (RecurringDetails)get_store().find_element_user(RECURRINGDETAILS$4, 0);
            if (target == null)
            {
                target = (RecurringDetails)get_store().add_element_user(RECURRINGDETAILS$4);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "RecurringDetails" element
     */
    public void unsetRecurringDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECURRINGDETAILS$4, 0);
        }
    }

    /**
     * Gets the "ThreeDSecureDetails" element
     */
    public ThreeDSecureDetails getThreeDSecureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ThreeDSecureDetails target = null;
            target = (ThreeDSecureDetails)get_store().find_element_user(THREEDSECUREDETAILS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Tests for nil "ThreeDSecureDetails" element
     */
    public boolean isNilThreeDSecureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ThreeDSecureDetails target = null;
            target = (ThreeDSecureDetails)get_store().find_element_user(THREEDSECUREDETAILS$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ThreeDSecureDetails" element
     */
    public boolean isSetThreeDSecureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THREEDSECUREDETAILS$6) != 0;
        }
    }

    /**
     * Sets the "ThreeDSecureDetails" element
     */
    public void setThreeDSecureDetails(ThreeDSecureDetails threeDSecureDetails)
    {
        generatedSetterHelperImpl(threeDSecureDetails, THREEDSECUREDETAILS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "ThreeDSecureDetails" element
     */
    public ThreeDSecureDetails addNewThreeDSecureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ThreeDSecureDetails target = null;
            target = (ThreeDSecureDetails)get_store().add_element_user(THREEDSECUREDETAILS$6);
            return target;
        }
    }

    /**
     * Nils the "ThreeDSecureDetails" element
     */
    public void setNilThreeDSecureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ThreeDSecureDetails target = null;
            target = (ThreeDSecureDetails)get_store().find_element_user(THREEDSECUREDETAILS$6, 0);
            if (target == null)
            {
                target = (ThreeDSecureDetails)get_store().add_element_user(THREEDSECUREDETAILS$6);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ThreeDSecureDetails" element
     */
    public void unsetThreeDSecureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THREEDSECUREDETAILS$6, 0);
        }
    }

    /**
     * Gets the "TransactionDetails" element
     */
    public TransactionDetails getTransactionDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            TransactionDetails target = null;
            target = (TransactionDetails)get_store().find_element_user(TRANSACTIONDETAILS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Tests for nil "TransactionDetails" element
     */
    public boolean isNilTransactionDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            TransactionDetails target = null;
            target = (TransactionDetails)get_store().find_element_user(TRANSACTIONDETAILS$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "TransactionDetails" element
     */
    public boolean isSetTransactionDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSACTIONDETAILS$8) != 0;
        }
    }

    /**
     * Sets the "TransactionDetails" element
     */
    public void setTransactionDetails(TransactionDetails transactionDetails)
    {
        generatedSetterHelperImpl(transactionDetails, TRANSACTIONDETAILS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "TransactionDetails" element
     */
    public TransactionDetails addNewTransactionDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            TransactionDetails target = null;
            target = (TransactionDetails)get_store().add_element_user(TRANSACTIONDETAILS$8);
            return target;
        }
    }

    /**
     * Nils the "TransactionDetails" element
     */
    public void setNilTransactionDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            TransactionDetails target = null;
            target = (TransactionDetails)get_store().find_element_user(TRANSACTIONDETAILS$8, 0);
            if (target == null)
            {
                target = (TransactionDetails)get_store().add_element_user(TRANSACTIONDETAILS$8);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "TransactionDetails" element
     */
    public void unsetTransactionDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSACTIONDETAILS$8, 0);
        }
    }

    /**
     * Gets the "SessionID" element
     */
    public String getSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "SessionID" element
     */
    public org.apache.xmlbeans.XmlString xgetSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONID$10, 0);
            return target;
        }
    }

    /**
     * Tests for nil "SessionID" element
     */
    public boolean isNilSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONID$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "SessionID" element
     */
    public boolean isSetSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SESSIONID$10) != 0;
        }
    }

    /**
     * Sets the "SessionID" element
     */
    public void setSessionID(String sessionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SESSIONID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SESSIONID$10);
            }
            target.setStringValue(sessionID);
        }
    }
    
    /**
     * Sets (as xml) the "SessionID" element
     */
    public void xsetSessionID(org.apache.xmlbeans.XmlString sessionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SESSIONID$10);
            }
            target.set(sessionID);
        }
    }
    
    /**
     * Nils the "SessionID" element
     */
    public void setNilSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SESSIONID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SESSIONID$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SessionID" element
     */
    public void unsetSessionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SESSIONID$10, 0);
        }
    }
}
