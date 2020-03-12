/*
 * An XML document type.
 * Localname: HostedPageAuthorizationResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.HostedPageAuthorizationResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.HostedPageAuthorizationResponse;
import com.firstatlanticcommerce.schemas.gateway.data.HostedPageAuthorizationResponseDocument;

/**
 * A document containing one HostedPageAuthorizationResponse(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class HostedPageAuthorizationResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPageAuthorizationResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public HostedPageAuthorizationResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSTEDPAGEAUTHORIZATIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "HostedPageAuthorizationResponse");
    
    
    /**
     * Gets the "HostedPageAuthorizationResponse" element
     */
    public HostedPageAuthorizationResponse getHostedPageAuthorizationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageAuthorizationResponse target = null;
            target = (HostedPageAuthorizationResponse)get_store().find_element_user(HOSTEDPAGEAUTHORIZATIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "HostedPageAuthorizationResponse" element
     */
    public boolean isNilHostedPageAuthorizationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageAuthorizationResponse target = null;
            target = (HostedPageAuthorizationResponse)get_store().find_element_user(HOSTEDPAGEAUTHORIZATIONRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "HostedPageAuthorizationResponse" element
     */
    public void setHostedPageAuthorizationResponse(HostedPageAuthorizationResponse hostedPageAuthorizationResponse)
    {
        generatedSetterHelperImpl(hostedPageAuthorizationResponse, HOSTEDPAGEAUTHORIZATIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HostedPageAuthorizationResponse" element
     */
    public HostedPageAuthorizationResponse addNewHostedPageAuthorizationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageAuthorizationResponse target = null;
            target = (HostedPageAuthorizationResponse)get_store().add_element_user(HOSTEDPAGEAUTHORIZATIONRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "HostedPageAuthorizationResponse" element
     */
    public void setNilHostedPageAuthorizationResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageAuthorizationResponse target = null;
            target = (HostedPageAuthorizationResponse)get_store().find_element_user(HOSTEDPAGEAUTHORIZATIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (HostedPageAuthorizationResponse)get_store().add_element_user(HOSTEDPAGEAUTHORIZATIONRESPONSE$0);
            }
            target.setNil();
        }
    }
}
