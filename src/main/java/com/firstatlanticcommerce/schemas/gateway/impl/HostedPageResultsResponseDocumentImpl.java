/*
 * An XML document type.
 * Localname: HostedPageResultsResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway
 * Java type: com.firstatlanticcommerce.schemas.gateway.HostedPageResultsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.impl;

import com.firstatlanticcommerce.schemas.gateway.HostedPageResultsResponseDocument;

/**
 * A document containing one HostedPageResultsResponse(@http://schemas.firstatlanticcommerce.com/gateway) element.
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
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway", "HostedPageResultsResponse");
    
    
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
     * An XML HostedPageResultsResponse(@http://schemas.firstatlanticcommerce.com/gateway).
     *
     * This is a complex type.
     */
    public static class HostedPageResultsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPageResultsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public HostedPageResultsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HOSTEDPAGERESULTSRESULT$0 = 
            new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway", "HostedPageResultsResult");
        
        
        /**
         * Gets the "HostedPageResultsResult" element
         */
        public HostedPageResultsResponse getHostedPageResultsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPageResultsResponse target = null;
                target = (HostedPageResultsResponse)get_store().find_element_user(HOSTEDPAGERESULTSRESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "HostedPageResultsResult" element
         */
        public boolean isNilHostedPageResultsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPageResultsResponse target = null;
                target = (HostedPageResultsResponse)get_store().find_element_user(HOSTEDPAGERESULTSRESULT$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "HostedPageResultsResult" element
         */
        public boolean isSetHostedPageResultsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOSTEDPAGERESULTSRESULT$0) != 0;
            }
        }
        
        /**
         * Sets the "HostedPageResultsResult" element
         */
        public void setHostedPageResultsResult(HostedPageResultsResponse hostedPageResultsResult)
        {
            generatedSetterHelperImpl(hostedPageResultsResult, HOSTEDPAGERESULTSRESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "HostedPageResultsResult" element
         */
        public HostedPageResultsResponse addNewHostedPageResultsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPageResultsResponse target = null;
                target = (HostedPageResultsResponse)get_store().add_element_user(HOSTEDPAGERESULTSRESULT$0);
                return target;
            }
        }
        
        /**
         * Nils the "HostedPageResultsResult" element
         */
        public void setNilHostedPageResultsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                HostedPageResultsResponse target = null;
                target = (HostedPageResultsResponse)get_store().find_element_user(HOSTEDPAGERESULTSRESULT$0, 0);
                if (target == null)
                {
                    target = (HostedPageResultsResponse)get_store().add_element_user(HOSTEDPAGERESULTSRESULT$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "HostedPageResultsResult" element
         */
        public void unsetHostedPageResultsResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOSTEDPAGERESULTSRESULT$0, 0);
            }
        }
    }
}
