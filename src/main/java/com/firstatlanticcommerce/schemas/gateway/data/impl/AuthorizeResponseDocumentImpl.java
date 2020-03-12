/*
 * An XML document type.
 * Localname: AuthorizeResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.AuthorizeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.AuthorizeResponse;
import com.firstatlanticcommerce.schemas.gateway.data.AuthorizeResponseDocument;

/**
 * A document containing one AuthorizeResponse(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class AuthorizeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements AuthorizeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuthorizeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHORIZERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "AuthorizeResponse");
    
    
    /**
     * Gets the "AuthorizeResponse" element
     */
    public AuthorizeResponse getAuthorizeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AuthorizeResponse target = null;
            target = (AuthorizeResponse)get_store().find_element_user(AUTHORIZERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AuthorizeResponse" element
     */
    public boolean isNilAuthorizeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AuthorizeResponse target = null;
            target = (AuthorizeResponse)get_store().find_element_user(AUTHORIZERESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AuthorizeResponse" element
     */
    public void setAuthorizeResponse(AuthorizeResponse authorizeResponse)
    {
        generatedSetterHelperImpl(authorizeResponse, AUTHORIZERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AuthorizeResponse" element
     */
    public AuthorizeResponse addNewAuthorizeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AuthorizeResponse target = null;
            target = (AuthorizeResponse)get_store().add_element_user(AUTHORIZERESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "AuthorizeResponse" element
     */
    public void setNilAuthorizeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AuthorizeResponse target = null;
            target = (AuthorizeResponse)get_store().find_element_user(AUTHORIZERESPONSE$0, 0);
            if (target == null)
            {
                target = (AuthorizeResponse)get_store().add_element_user(AUTHORIZERESPONSE$0);
            }
            target.setNil();
        }
    }
}
