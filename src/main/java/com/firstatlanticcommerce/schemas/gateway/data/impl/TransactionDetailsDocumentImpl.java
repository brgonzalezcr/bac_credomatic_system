/*
 * An XML document type.
 * Localname: TransactionDetails
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.TransactionDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.TransactionDetails;
import com.firstatlanticcommerce.schemas.gateway.data.TransactionDetailsDocument;

/**
 * A document containing one TransactionDetails(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class TransactionDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements TransactionDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransactionDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONDETAILS$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "TransactionDetails");
    
    
    /**
     * Gets the "TransactionDetails" element
     */
    public TransactionDetails getTransactionDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            TransactionDetails target = null;
            target = (TransactionDetails)get_store().find_element_user(TRANSACTIONDETAILS$0, 0);
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
            target = (TransactionDetails)get_store().find_element_user(TRANSACTIONDETAILS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TransactionDetails" element
     */
    public void setTransactionDetails(TransactionDetails transactionDetails)
    {
        generatedSetterHelperImpl(transactionDetails, TRANSACTIONDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (TransactionDetails)get_store().add_element_user(TRANSACTIONDETAILS$0);
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
            target = (TransactionDetails)get_store().find_element_user(TRANSACTIONDETAILS$0, 0);
            if (target == null)
            {
                target = (TransactionDetails)get_store().add_element_user(TRANSACTIONDETAILS$0);
            }
            target.setNil();
        }
    }
}
