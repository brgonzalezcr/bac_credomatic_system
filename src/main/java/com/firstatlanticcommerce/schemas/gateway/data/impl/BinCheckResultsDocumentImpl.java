/*
 * An XML document type.
 * Localname: BinCheckResults
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.BinCheckResultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.BinCheckResults;
import com.firstatlanticcommerce.schemas.gateway.data.BinCheckResultsDocument;

/**
 * A document containing one BinCheckResults(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class BinCheckResultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements BinCheckResultsDocument
{
    private static final long serialVersionUID = 1L;
    
    public BinCheckResultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BINCHECKRESULTS$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BinCheckResults");
    
    
    /**
     * Gets the "BinCheckResults" element
     */
    public BinCheckResults getBinCheckResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            BinCheckResults target = null;
            target = (BinCheckResults)get_store().find_element_user(BINCHECKRESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "BinCheckResults" element
     */
    public boolean isNilBinCheckResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            BinCheckResults target = null;
            target = (BinCheckResults)get_store().find_element_user(BINCHECKRESULTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "BinCheckResults" element
     */
    public void setBinCheckResults(BinCheckResults binCheckResults)
    {
        generatedSetterHelperImpl(binCheckResults, BINCHECKRESULTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BinCheckResults" element
     */
    public BinCheckResults addNewBinCheckResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            BinCheckResults target = null;
            target = (BinCheckResults)get_store().add_element_user(BINCHECKRESULTS$0);
            return target;
        }
    }
    
    /**
     * Nils the "BinCheckResults" element
     */
    public void setNilBinCheckResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            BinCheckResults target = null;
            target = (BinCheckResults)get_store().find_element_user(BINCHECKRESULTS$0, 0);
            if (target == null)
            {
                target = (BinCheckResults)get_store().add_element_user(BINCHECKRESULTS$0);
            }
            target.setNil();
        }
    }
}
