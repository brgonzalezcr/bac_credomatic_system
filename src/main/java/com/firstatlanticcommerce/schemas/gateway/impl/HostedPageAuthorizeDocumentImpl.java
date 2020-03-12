/*
 * An XML document type.
 * Localname: HostedPageAuthorize
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway
 * Java type: com.firstatlanticcommerce.schemas.gateway.HostedPageAuthorizeDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.impl;

import com.firstatlanticcommerce.schemas.gateway.HostedPageAuthorizeDocument;
import com.firstatlanticcommerce.schemas.gateway.data.HostedPageAuthorizationRequest;

/**
 * A document containing one HostedPageAuthorize(@http://schemas.firstatlanticcommerce.com/gateway) element.
 *
 * This is a complex type.
 */
public class HostedPageAuthorizeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPageAuthorizeDocument
{
    private static final long serialVersionUID = 1L;
    
    public HostedPageAuthorizeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSTEDPAGEAUTHORIZE$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway", "HostedPageAuthorize");
    
    
    /**
     * Gets the "HostedPageAuthorize" element
     */
    public HostedPageAuthorize getHostedPageAuthorize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageAuthorize target = null;
            target = (HostedPageAuthorize)get_store().find_element_user(HOSTEDPAGEAUTHORIZE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "HostedPageAuthorize" element
     */
    public void setHostedPageAuthorize(HostedPageAuthorize hostedPageAuthorize)
    {
        generatedSetterHelperImpl(hostedPageAuthorize, HOSTEDPAGEAUTHORIZE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "HostedPageAuthorize" element
     */
    public HostedPageAuthorize addNewHostedPageAuthorize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageAuthorize target = null;
            target = (HostedPageAuthorize)get_store().add_element_user(HOSTEDPAGEAUTHORIZE$0);
            return target;
        }
    }
    /**
     * An XML HostedPageAuthorize(@http://schemas.firstatlanticcommerce.com/gateway).
     *
     * This is a complex type.
     */
    public static class HostedPageAuthorizeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPageAuthorize
    {
        private static final long serialVersionUID = 1L;
        
        public HostedPageAuthorizeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUEST$0 = 
            new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway", "Request");
        
        
        /**
         * Gets the "Request" element
         */
        public HostedPageAuthorizationRequest getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPageAuthorizationRequest target = null;
                target = (HostedPageAuthorizationRequest)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "Request" element
         */
        public boolean isNilRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPageAuthorizationRequest target = null;
                target = (HostedPageAuthorizationRequest)get_store().find_element_user(REQUEST$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "Request" element
         */
        public boolean isSetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUEST$0) != 0;
            }
        }
        
        /**
         * Sets the "Request" element
         */
        public void setRequest(HostedPageAuthorizationRequest request)
        {
            generatedSetterHelperImpl(request, REQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Request" element
         */
        public HostedPageAuthorizationRequest addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPageAuthorizationRequest target = null;
                target = (HostedPageAuthorizationRequest)get_store().add_element_user(REQUEST$0);
                return target;
            }
        }
        
        /**
         * Nils the "Request" element
         */
        public void setNilRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPageAuthorizationRequest target = null;
                target = (HostedPageAuthorizationRequest)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    target = (HostedPageAuthorizationRequest)get_store().add_element_user(REQUEST$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "Request" element
         */
        public void unsetRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUEST$0, 0);
            }
        }
    }
}
