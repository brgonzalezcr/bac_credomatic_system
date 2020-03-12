/*
 * An XML document type.
 * Localname: CreditCardTransactionResults
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.CreditCardTransactionResultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.CreditCardTransactionResults;
import com.firstatlanticcommerce.schemas.gateway.data.CreditCardTransactionResultsDocument;

/**
 * A document containing one CreditCardTransactionResults(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class CreditCardTransactionResultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements CreditCardTransactionResultsDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreditCardTransactionResultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREDITCARDTRANSACTIONRESULTS$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "CreditCardTransactionResults");
    
    
    /**
     * Gets the "CreditCardTransactionResults" element
     */
    public CreditCardTransactionResults getCreditCardTransactionResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            CreditCardTransactionResults target = null;
            target = (CreditCardTransactionResults)get_store().find_element_user(CREDITCARDTRANSACTIONRESULTS$0, 0);
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
            target = (CreditCardTransactionResults)get_store().find_element_user(CREDITCARDTRANSACTIONRESULTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CreditCardTransactionResults" element
     */
    public void setCreditCardTransactionResults(CreditCardTransactionResults creditCardTransactionResults)
    {
        generatedSetterHelperImpl(creditCardTransactionResults, CREDITCARDTRANSACTIONRESULTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (CreditCardTransactionResults)get_store().add_element_user(CREDITCARDTRANSACTIONRESULTS$0);
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
            target = (CreditCardTransactionResults)get_store().find_element_user(CREDITCARDTRANSACTIONRESULTS$0, 0);
            if (target == null)
            {
                target = (CreditCardTransactionResults)get_store().add_element_user(CREDITCARDTRANSACTIONRESULTS$0);
            }
            target.setNil();
        }
    }
}
