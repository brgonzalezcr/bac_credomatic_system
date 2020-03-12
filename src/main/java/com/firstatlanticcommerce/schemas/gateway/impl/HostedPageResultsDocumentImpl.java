/*
 * An XML document type.
 * Localname: HostedPageResults
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway
 * Java type: com.firstatlanticcommerce.schemas.gateway.HostedPageResultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.impl;

import com.firstatlanticcommerce.schemas.gateway.HostedPageResultsDocument;

/**
 * A document containing one HostedPageResults(@http://schemas.firstatlanticcommerce.com/gateway) element.
 *
 * This is a complex type.
 */
public class HostedPageResultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPageResultsDocument
{
    private static final long serialVersionUID = 1L;
    
    public HostedPageResultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSTEDPAGERESULTS$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway", "HostedPageResults");
    
    
    /**
     * Gets the "HostedPageResults" element
     */
    public HostedPageResults getHostedPageResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageResults target = null;
            target = (HostedPageResults)get_store().find_element_user(HOSTEDPAGERESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "HostedPageResults" element
     */
    public void setHostedPageResults(HostedPageResults hostedPageResults)
    {
        generatedSetterHelperImpl(hostedPageResults, HOSTEDPAGERESULTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "HostedPageResults" element
     */
    public HostedPageResults addNewHostedPageResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            HostedPageResults target = null;
            target = (HostedPageResults)get_store().add_element_user(HOSTEDPAGERESULTS$0);
            return target;
        }
    }
    /**
     * An XML HostedPageResults(@http://schemas.firstatlanticcommerce.com/gateway).
     *
     * This is a complex type.
     */
    public static class HostedPageResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPageResults
    {
        private static final long serialVersionUID = 1L;

        public HostedPageResultsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName KEY$0 =
            new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway", "key");


        /**
         * Gets the "key" element
         */
        public String getKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "key" element
         */
        public org.apache.xmlbeans.XmlString xgetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                return target;
            }
        }

        /**
         * Tests for nil "key" element
         */
        public boolean isNilKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }

        /**
         * True if has "key" element
         */
        public boolean isSetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEY$0) != 0;
            }
        }

        /**
         * Sets the "key" element
         */
        public void setKey(String key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEY$0);
                }
                target.setStringValue(key);
            }
        }
        
        /**
         * Sets (as xml) the "key" element
         */
        public void xsetKey(org.apache.xmlbeans.XmlString key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEY$0);
                }
                target.set(key);
            }
        }
        
        /**
         * Nils the "key" element
         */
        public void setNilKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEY$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "key" element
         */
        public void unsetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEY$0, 0);
            }
        }
    }
}
