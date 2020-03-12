/*
 * An XML document type.
 * Localname: FraudControlResults
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.FraudControlResultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.FraudControlResults;
import com.firstatlanticcommerce.schemas.gateway.data.FraudControlResultsDocument;

/**
 * A document containing one FraudControlResults(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class FraudControlResultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements FraudControlResultsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FraudControlResultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FRAUDCONTROLRESULTS$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "FraudControlResults");
    
    
    /**
     * Gets the "FraudControlResults" element
     */
    public FraudControlResults getFraudControlResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            FraudControlResults target = null;
            target = (FraudControlResults)get_store().find_element_user(FRAUDCONTROLRESULTS$0, 0);
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
            target = (FraudControlResults)get_store().find_element_user(FRAUDCONTROLRESULTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "FraudControlResults" element
     */
    public void setFraudControlResults(FraudControlResults fraudControlResults)
    {
        generatedSetterHelperImpl(fraudControlResults, FRAUDCONTROLRESULTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (FraudControlResults)get_store().add_element_user(FRAUDCONTROLRESULTS$0);
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
            target = (FraudControlResults)get_store().find_element_user(FRAUDCONTROLRESULTS$0, 0);
            if (target == null)
            {
                target = (FraudControlResults)get_store().add_element_user(FRAUDCONTROLRESULTS$0);
            }
            target.setNil();
        }
    }
}
