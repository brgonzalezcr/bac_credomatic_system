/*
 * An XML document type.
 * Localname: HostedPagePreprocessResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway
 * Java type: com.firstatlanticcommerce.schemas.gateway.HostedPagePreprocessResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.impl;

import com.firstatlanticcommerce.schemas.gateway.HostedPagePreprocessResponseDocument;

/**
 * A document containing one HostedPagePreprocessResponse(@http://schemas.firstatlanticcommerce.com/gateway) element.
 *
 * This is a complex type.
 */
public class HostedPagePreprocessResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPagePreprocessResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public HostedPagePreprocessResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSTEDPAGEPREPROCESSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway", "HostedPagePreprocessResponse");
    
    
    /**
     * Gets the "HostedPagePreprocessResponse" element
     */
    public HostedPagePreprocessResponse getHostedPagePreprocessResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPagePreprocessResponse target = null;
            target = (HostedPagePreprocessResponse)get_store().find_element_user(HOSTEDPAGEPREPROCESSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "HostedPagePreprocessResponse" element
     */
    public void setHostedPagePreprocessResponse(HostedPagePreprocessResponse hostedPagePreprocessResponse)
    {
        generatedSetterHelperImpl(hostedPagePreprocessResponse, HOSTEDPAGEPREPROCESSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "HostedPagePreprocessResponse" element
     */
    public HostedPagePreprocessResponse addNewHostedPagePreprocessResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPagePreprocessResponse target = null;
            target = (HostedPagePreprocessResponse)get_store().add_element_user(HOSTEDPAGEPREPROCESSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML HostedPagePreprocessResponse(@http://schemas.firstatlanticcommerce.com/gateway).
     *
     * This is a complex type.
     */
    public static class HostedPagePreprocessResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPagePreprocessResponse
    {
        private static final long serialVersionUID = 1L;
        
        public HostedPagePreprocessResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HOSTEDPAGEPREPROCESSRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway", "HostedPagePreprocessResult");
        
        
        /**
         * Gets the "HostedPagePreprocessResult" element
         */
        public com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse getHostedPagePreprocessResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse target = null;
                target = (com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse)get_store().find_element_user(HOSTEDPAGEPREPROCESSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "HostedPagePreprocessResult" element
         */
        public boolean isNilHostedPagePreprocessResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse target = null;
                target = (com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse)get_store().find_element_user(HOSTEDPAGEPREPROCESSRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "HostedPagePreprocessResult" element
         */
        public boolean isSetHostedPagePreprocessResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOSTEDPAGEPREPROCESSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "HostedPagePreprocessResult" element
         */
        public void setHostedPagePreprocessResult(com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse hostedPagePreprocessResult)
        {
            generatedSetterHelperImpl(hostedPagePreprocessResult, HOSTEDPAGEPREPROCESSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "HostedPagePreprocessResult" element
         */
        public com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse addNewHostedPagePreprocessResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse target = null;
                target = (com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse)get_store().add_element_user(HOSTEDPAGEPREPROCESSRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "HostedPagePreprocessResult" element
         */
        public void setNilHostedPagePreprocessResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse target = null;
                target = (com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse)get_store().find_element_user(HOSTEDPAGEPREPROCESSRESULT$0, 0);
                if (target == null)
                {
                    target = (com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse)get_store().add_element_user(HOSTEDPAGEPREPROCESSRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "HostedPagePreprocessResult" element
         */
        public void unsetHostedPagePreprocessResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOSTEDPAGEPREPROCESSRESULT$0, 0);
            }
        }
    }
}
