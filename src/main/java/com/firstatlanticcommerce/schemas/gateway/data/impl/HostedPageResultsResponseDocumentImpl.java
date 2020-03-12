/*
 * An XML document type.
 * Localname: HostedPageResultsResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.HostedPageResultsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.HostedPageResultsResponseDocument;
import com.firstatlanticcommerce.schemas.gateway.data.HostedPageResultsResponse;

/**
 * A document containing one HostedPageResultsResponse(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class HostedPageResultsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPageResultsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public HostedPageResultsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSTEDPAGERESULTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "HostedPageResultsResponse");
    
    
    /**
     * Gets the "HostedPageResultsResponse" element
     */
    public HostedPageResultsResponse getHostedPageResultsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageResultsResponse target = null;
            target = (HostedPageResultsResponse)get_store().find_element_user(HOSTEDPAGERESULTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "HostedPageResultsResponse" element
     */
    public boolean isNilHostedPageResultsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageResultsResponse target = null;
            target = (HostedPageResultsResponse)get_store().find_element_user(HOSTEDPAGERESULTSRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "HostedPageResultsResponse" element
     */
    public void setHostedPageResultsResponse(HostedPageResultsResponse hostedPageResultsResponse)
    {
        generatedSetterHelperImpl(hostedPageResultsResponse, HOSTEDPAGERESULTSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HostedPageResultsResponse" element
     */
    public HostedPageResultsResponse addNewHostedPageResultsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageResultsResponse target = null;
            target = (HostedPageResultsResponse)get_store().add_element_user(HOSTEDPAGERESULTSRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "HostedPageResultsResponse" element
     */
    public void setNilHostedPageResultsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageResultsResponse target = null;
            target = (HostedPageResultsResponse)get_store().find_element_user(HOSTEDPAGERESULTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (HostedPageResultsResponse)get_store().add_element_user(HOSTEDPAGERESULTSRESPONSE$0);
            }
            target.setNil();
        }
    }
}
