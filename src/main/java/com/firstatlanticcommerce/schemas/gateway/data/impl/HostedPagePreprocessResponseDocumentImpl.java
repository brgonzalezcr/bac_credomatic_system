/*
 * An XML document type.
 * Localname: HostedPagePreprocessResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse;
import com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponseDocument;

/**
 * A document containing one HostedPagePreprocessResponse(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
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
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "HostedPagePreprocessResponse");
    
    
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
     * Tests for nil "HostedPagePreprocessResponse" element
     */
    public boolean isNilHostedPagePreprocessResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPagePreprocessResponse target = null;
            target = (HostedPagePreprocessResponse)get_store().find_element_user(HOSTEDPAGEPREPROCESSRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
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
     * Nils the "HostedPagePreprocessResponse" element
     */
    public void setNilHostedPagePreprocessResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPagePreprocessResponse target = null;
            target = (HostedPagePreprocessResponse)get_store().find_element_user(HOSTEDPAGEPREPROCESSRESPONSE$0, 0);
            if (target == null)
            {
                target = (HostedPagePreprocessResponse)get_store().add_element_user(HOSTEDPAGEPREPROCESSRESPONSE$0);
            }
            target.setNil();
        }
    }
}
