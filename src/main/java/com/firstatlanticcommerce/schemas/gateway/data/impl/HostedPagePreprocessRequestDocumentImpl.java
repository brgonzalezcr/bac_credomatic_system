/*
 * An XML document type.
 * Localname: HostedPagePreprocessRequest
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessRequest;
import com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessRequestDocument;

/**
 * A document containing one HostedPagePreprocessRequest(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class HostedPagePreprocessRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPagePreprocessRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public HostedPagePreprocessRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSTEDPAGEPREPROCESSREQUEST$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "HostedPagePreprocessRequest");
    
    
    /**
     * Gets the "HostedPagePreprocessRequest" element
     */
    public HostedPagePreprocessRequest getHostedPagePreprocessRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPagePreprocessRequest target = null;
            target = (HostedPagePreprocessRequest)get_store().find_element_user(HOSTEDPAGEPREPROCESSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "HostedPagePreprocessRequest" element
     */
    public boolean isNilHostedPagePreprocessRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPagePreprocessRequest target = null;
            target = (HostedPagePreprocessRequest)get_store().find_element_user(HOSTEDPAGEPREPROCESSREQUEST$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "HostedPagePreprocessRequest" element
     */
    public void setHostedPagePreprocessRequest(HostedPagePreprocessRequest hostedPagePreprocessRequest)
    {
        generatedSetterHelperImpl(hostedPagePreprocessRequest, HOSTEDPAGEPREPROCESSREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "HostedPagePreprocessRequest" element
     */
    public HostedPagePreprocessRequest addNewHostedPagePreprocessRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPagePreprocessRequest target = null;
            target = (HostedPagePreprocessRequest)get_store().add_element_user(HOSTEDPAGEPREPROCESSREQUEST$0);
            return target;
        }
    }
    
    /**
     * Nils the "HostedPagePreprocessRequest" element
     */
    public void setNilHostedPagePreprocessRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPagePreprocessRequest target = null;
            target = (HostedPagePreprocessRequest)get_store().find_element_user(HOSTEDPAGEPREPROCESSREQUEST$0, 0);
            if (target == null)
            {
                target = (HostedPagePreprocessRequest)get_store().add_element_user(HOSTEDPAGEPREPROCESSREQUEST$0);
            }
            target.setNil();
        }
    }
}
