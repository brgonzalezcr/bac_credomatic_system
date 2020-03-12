/*
 * An XML document type.
 * Localname: IPGeoLocationResults
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.IPGeoLocationResultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.IPGeoLocationResults;
import com.firstatlanticcommerce.schemas.gateway.data.IPGeoLocationResultsDocument;

/**
 * A document containing one IPGeoLocationResults(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class IPGeoLocationResultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements IPGeoLocationResultsDocument
{
    private static final long serialVersionUID = 1L;
    
    public IPGeoLocationResultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IPGEOLOCATIONRESULTS$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "IPGeoLocationResults");
    
    
    /**
     * Gets the "IPGeoLocationResults" element
     */
    public IPGeoLocationResults getIPGeoLocationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            IPGeoLocationResults target = null;
            target = (IPGeoLocationResults)get_store().find_element_user(IPGEOLOCATIONRESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IPGeoLocationResults" element
     */
    public boolean isNilIPGeoLocationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            IPGeoLocationResults target = null;
            target = (IPGeoLocationResults)get_store().find_element_user(IPGEOLOCATIONRESULTS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IPGeoLocationResults" element
     */
    public void setIPGeoLocationResults(IPGeoLocationResults ipGeoLocationResults)
    {
        generatedSetterHelperImpl(ipGeoLocationResults, IPGEOLOCATIONRESULTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IPGeoLocationResults" element
     */
    public IPGeoLocationResults addNewIPGeoLocationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            IPGeoLocationResults target = null;
            target = (IPGeoLocationResults)get_store().add_element_user(IPGEOLOCATIONRESULTS$0);
            return target;
        }
    }
    
    /**
     * Nils the "IPGeoLocationResults" element
     */
    public void setNilIPGeoLocationResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            IPGeoLocationResults target = null;
            target = (IPGeoLocationResults)get_store().find_element_user(IPGEOLOCATIONRESULTS$0, 0);
            if (target == null)
            {
                target = (IPGeoLocationResults)get_store().add_element_user(IPGEOLOCATIONRESULTS$0);
            }
            target.setNil();
        }
    }
}
