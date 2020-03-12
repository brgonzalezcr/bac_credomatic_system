/*
 * An XML document type.
 * Localname: HostedPageAuthorizationRequest
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.HostedPageAuthorizationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.HostedPageAuthorizationRequest;
import com.firstatlanticcommerce.schemas.gateway.data.HostedPageAuthorizationRequestDocument;

/**
 * A document containing one HostedPageAuthorizationRequest(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class HostedPageAuthorizationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPageAuthorizationRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public HostedPageAuthorizationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSTEDPAGEAUTHORIZATIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "HostedPageAuthorizationRequest");
    
    
    /**
     * Gets the "HostedPageAuthorizationRequest" element
     */
    public HostedPageAuthorizationRequest getHostedPageAuthorizationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageAuthorizationRequest target = null;
            target = (HostedPageAuthorizationRequest)get_store().find_element_user(HOSTEDPAGEAUTHORIZATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "HostedPageAuthorizationRequest" element
     */
    public boolean isNilHostedPageAuthorizationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageAuthorizationRequest target = null;
            target = (HostedPageAuthorizationRequest)get_store().find_element_user(HOSTEDPAGEAUTHORIZATIONREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "HostedPageAuthorizationRequest" element
     */
    public void setHostedPageAuthorizationRequest(HostedPageAuthorizationRequest hostedPageAuthorizationRequest)
    {
        generatedSetterHelperImpl(hostedPageAuthorizationRequest, HOSTEDPAGEAUTHORIZATIONREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HostedPageAuthorizationRequest" element
     */
    public HostedPageAuthorizationRequest addNewHostedPageAuthorizationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageAuthorizationRequest target = null;
            target = (HostedPageAuthorizationRequest)get_store().add_element_user(HOSTEDPAGEAUTHORIZATIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "HostedPageAuthorizationRequest" element
     */
    public void setNilHostedPageAuthorizationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageAuthorizationRequest target = null;
            target = (HostedPageAuthorizationRequest)get_store().find_element_user(HOSTEDPAGEAUTHORIZATIONREQUEST$0, 0);
            if (target == null)
            {
                target = (HostedPageAuthorizationRequest)get_store().add_element_user(HOSTEDPAGEAUTHORIZATIONREQUEST$0);
            }
            target.setNil();
        }
    }
}
