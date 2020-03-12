/*
 * An XML document type.
 * Localname: HostedPageAuthorizeResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway
 * Java type: com.firstatlanticcommerce.schemas.gateway.HostedPageAuthorizeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.impl;

import com.firstatlanticcommerce.schemas.gateway.HostedPageAuthorizeResponseDocument;
import com.firstatlanticcommerce.schemas.gateway.data.HostedPageAuthorizationResponse;

/**
 * A document containing one HostedPageAuthorizeResponse(@http://schemas.firstatlanticcommerce.com/gateway) element.
 *
 * This is a complex type.
 */
public class HostedPageAuthorizeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPageAuthorizeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public HostedPageAuthorizeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSTEDPAGEAUTHORIZERESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway", "HostedPageAuthorizeResponse");
    
    
    /**
     * Gets the "HostedPageAuthorizeResponse" element
     */
    public HostedPageAuthorizeResponse getHostedPageAuthorizeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageAuthorizeResponse target = null;
            target = (HostedPageAuthorizeResponse)get_store().find_element_user(HOSTEDPAGEAUTHORIZERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "HostedPageAuthorizeResponse" element
     */
    public void setHostedPageAuthorizeResponse(HostedPageAuthorizeResponse hostedPageAuthorizeResponse)
    {
        generatedSetterHelperImpl(hostedPageAuthorizeResponse, HOSTEDPAGEAUTHORIZERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "HostedPageAuthorizeResponse" element
     */
    public HostedPageAuthorizeResponse addNewHostedPageAuthorizeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageAuthorizeResponse target = null;
            target = (HostedPageAuthorizeResponse)get_store().add_element_user(HOSTEDPAGEAUTHORIZERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML HostedPageAuthorizeResponse(@http://schemas.firstatlanticcommerce.com/gateway).
     *
     * This is a complex type.
     */
    public static class HostedPageAuthorizeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPageAuthorizeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public HostedPageAuthorizeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HOSTEDPAGEAUTHORIZERESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway", "HostedPageAuthorizeResult");
        
        
        /**
         * Gets the "HostedPageAuthorizeResult" element
         */
        public HostedPageAuthorizationResponse getHostedPageAuthorizeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPageAuthorizationResponse target = null;
                target = (HostedPageAuthorizationResponse)get_store().find_element_user(HOSTEDPAGEAUTHORIZERESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "HostedPageAuthorizeResult" element
         */
        public boolean isNilHostedPageAuthorizeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPageAuthorizationResponse target = null;
                target = (HostedPageAuthorizationResponse)get_store().find_element_user(HOSTEDPAGEAUTHORIZERESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "HostedPageAuthorizeResult" element
         */
        public boolean isSetHostedPageAuthorizeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOSTEDPAGEAUTHORIZERESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "HostedPageAuthorizeResult" element
         */
        public void setHostedPageAuthorizeResult(HostedPageAuthorizationResponse hostedPageAuthorizeResult)
        {
            generatedSetterHelperImpl(hostedPageAuthorizeResult, HOSTEDPAGEAUTHORIZERESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "HostedPageAuthorizeResult" element
         */
        public HostedPageAuthorizationResponse addNewHostedPageAuthorizeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPageAuthorizationResponse target = null;
                target = (HostedPageAuthorizationResponse)get_store().add_element_user(HOSTEDPAGEAUTHORIZERESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "HostedPageAuthorizeResult" element
         */
        public void setNilHostedPageAuthorizeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPageAuthorizationResponse target = null;
                target = (HostedPageAuthorizationResponse)get_store().find_element_user(HOSTEDPAGEAUTHORIZERESULT$0, 0);
                if (target == null)
                {
                    target = (HostedPageAuthorizationResponse)get_store().add_element_user(HOSTEDPAGEAUTHORIZERESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "HostedPageAuthorizeResult" element
         */
        public void unsetHostedPageAuthorizeResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOSTEDPAGEAUTHORIZERESULT$0, 0);
            }
        }
    }
}
