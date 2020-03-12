/*
 * An XML document type.
 * Localname: BillingDetails
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.BillingDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.BillingDetails;
import com.firstatlanticcommerce.schemas.gateway.data.BillingDetailsDocument;

/**
 * A document containing one BillingDetails(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class BillingDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements BillingDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public BillingDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BILLINGDETAILS$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillingDetails");
    
    
    /**
     * Gets the "BillingDetails" element
     */
    public BillingDetails getBillingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            BillingDetails target = null;
            target = (BillingDetails)get_store().find_element_user(BILLINGDETAILS$0, 0);
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
            target = (BillingDetails)get_store().find_element_user(BILLINGDETAILS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BillingDetails" element
     */
    public void setBillingDetails(BillingDetails billingDetails)
    {
        generatedSetterHelperImpl(billingDetails, BILLINGDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (BillingDetails)get_store().add_element_user(BILLINGDETAILS$0);
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
            target = (BillingDetails)get_store().find_element_user(BILLINGDETAILS$0, 0);
            if (target == null)
            {
                target = (BillingDetails)get_store().add_element_user(BILLINGDETAILS$0);
            }
            target.setNil();
        }
    }
}
