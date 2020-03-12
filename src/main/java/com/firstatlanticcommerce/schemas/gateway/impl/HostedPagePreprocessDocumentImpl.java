/*
 * An XML document type.
 * Localname: HostedPagePreprocess
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway
 * Java type: com.firstatlanticcommerce.schemas.gateway.HostedPagePreprocessDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.impl;

import com.firstatlanticcommerce.schemas.gateway.HostedPagePreprocessDocument;
import com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessRequest;

/**
 * A document containing one HostedPagePreprocess(@http://schemas.firstatlanticcommerce.com/gateway) element.
 *
 * This is a complex type.
 */
public class HostedPagePreprocessDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPagePreprocessDocument
{
    private static final long serialVersionUID = 1L;
    
    public HostedPagePreprocessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSTEDPAGEPREPROCESS$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway", "HostedPagePreprocess");
    
    
    /**
     * Gets the "HostedPagePreprocess" element
     */
    public HostedPagePreprocess getHostedPagePreprocess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPagePreprocess target = null;
            target = (HostedPagePreprocess)get_store().find_element_user(HOSTEDPAGEPREPROCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "HostedPagePreprocess" element
     */
    public void setHostedPagePreprocess(HostedPagePreprocess hostedPagePreprocess)
    {
        generatedSetterHelperImpl(hostedPagePreprocess, HOSTEDPAGEPREPROCESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "HostedPagePreprocess" element
     */
    public HostedPagePreprocess addNewHostedPagePreprocess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPagePreprocess target = null;
            target = (HostedPagePreprocess)get_store().add_element_user(HOSTEDPAGEPREPROCESS$0);
            return target;
        }
    }
    /**
     * An XML HostedPagePreprocess(@http://schemas.firstatlanticcommerce.com/gateway).
     *
     * This is a complex type.
     */
    public static class HostedPagePreprocessImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPagePreprocess
    {
        private static final long serialVersionUID = 1L;
        
        public HostedPagePreprocessImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUEST$0 = 
            new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway", "Request");
        
        
        /**
         * Gets the "Request" element
         */
        public HostedPagePreprocessRequest getRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPagePreprocessRequest target = null;
                target = (HostedPagePreprocessRequest)get_store().find_element_user(REQUEST$0, 0);
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
                HostedPagePreprocessRequest target = null;
                target = (HostedPagePreprocessRequest)get_store().find_element_user(REQUEST$0, 0);
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
        public void setRequest(HostedPagePreprocessRequest request)
        {
            generatedSetterHelperImpl(request, REQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "Request" element
         */
        public HostedPagePreprocessRequest addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPagePreprocessRequest target = null;
                target = (HostedPagePreprocessRequest)get_store().add_element_user(REQUEST$0);
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
                HostedPagePreprocessRequest target = null;
                target = (HostedPagePreprocessRequest)get_store().find_element_user(REQUEST$0, 0);
                if (target == null)
                {
                    target = (HostedPagePreprocessRequest)get_store().add_element_user(REQUEST$0);
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
