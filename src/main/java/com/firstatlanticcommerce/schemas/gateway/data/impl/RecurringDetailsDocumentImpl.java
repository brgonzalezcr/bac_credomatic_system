/*
 * An XML document type.
 * Localname: RecurringDetails
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.RecurringDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.RecurringDetails;
import com.firstatlanticcommerce.schemas.gateway.data.RecurringDetailsDocument;

/**
 * A document containing one RecurringDetails(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class RecurringDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements RecurringDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecurringDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECURRINGDETAILS$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "RecurringDetails");
    
    
    /**
     * Gets the "RecurringDetails" element
     */
    public RecurringDetails getRecurringDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            RecurringDetails target = null;
            target = (RecurringDetails)get_store().find_element_user(RECURRINGDETAILS$0, 0);
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
            target = (RecurringDetails)get_store().find_element_user(RECURRINGDETAILS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RecurringDetails" element
     */
    public void setRecurringDetails(RecurringDetails recurringDetails)
    {
        generatedSetterHelperImpl(recurringDetails, RECURRINGDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (RecurringDetails)get_store().add_element_user(RECURRINGDETAILS$0);
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
            target = (RecurringDetails)get_store().find_element_user(RECURRINGDETAILS$0, 0);
            if (target == null)
            {
                target = (RecurringDetails)get_store().add_element_user(RECURRINGDETAILS$0);
            }
            target.setNil();
        }
    }
}
