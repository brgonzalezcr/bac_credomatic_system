/*
 * XML Type:  HostedPagePreprocessResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse;

/**
 * An XML HostedPagePreprocessResponse(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class HostedPagePreprocessResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPagePreprocessResponse
{
    private static final long serialVersionUID = 1L;
    
    public HostedPagePreprocessResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSECODE$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ResponseCode");
    private static final javax.xml.namespace.QName RESPONSECODEDESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ResponseCodeDescription");
    private static final javax.xml.namespace.QName SECURITYTOKEN$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "SecurityToken");
    
    
    /**
     * Gets the "ResponseCode" element
     */
    public String getResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ResponseCode" element
     */
    public org.apache.xmlbeans.XmlString xgetResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODE$0, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ResponseCode" element
     */
    public boolean isNilResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ResponseCode" element
     */
    public boolean isSetResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSECODE$0) != 0;
        }
    }

    /**
     * Sets the "ResponseCode" element
     */
    public void setResponseCode(String responseCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSECODE$0);
            }
            target.setStringValue(responseCode);
        }
    }

    /**
     * Sets (as xml) the "ResponseCode" element
     */
    public void xsetResponseCode(org.apache.xmlbeans.XmlString responseCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSECODE$0);
            }
            target.set(responseCode);
        }
    }

    /**
     * Nils the "ResponseCode" element
     */
    public void setNilResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSECODE$0);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ResponseCode" element
     */
    public void unsetResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSECODE$0, 0);
        }
    }

    /**
     * Gets the "ResponseCodeDescription" element
     */
    public String getResponseCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSECODEDESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ResponseCodeDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetResponseCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODEDESCRIPTION$2, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ResponseCodeDescription" element
     */
    public boolean isNilResponseCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODEDESCRIPTION$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ResponseCodeDescription" element
     */
    public boolean isSetResponseCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSECODEDESCRIPTION$2) != 0;
        }
    }

    /**
     * Sets the "ResponseCodeDescription" element
     */
    public void setResponseCodeDescription(String responseCodeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSECODEDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSECODEDESCRIPTION$2);
            }
            target.setStringValue(responseCodeDescription);
        }
    }

    /**
     * Sets (as xml) the "ResponseCodeDescription" element
     */
    public void xsetResponseCodeDescription(org.apache.xmlbeans.XmlString responseCodeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODEDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSECODEDESCRIPTION$2);
            }
            target.set(responseCodeDescription);
        }
    }

    /**
     * Nils the "ResponseCodeDescription" element
     */
    public void setNilResponseCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESPONSECODEDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESPONSECODEDESCRIPTION$2);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ResponseCodeDescription" element
     */
    public void unsetResponseCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSECODEDESCRIPTION$2, 0);
        }
    }

    /**
     * Gets the "SecurityToken" element
     */
    public String getSecurityToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYTOKEN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "SecurityToken" element
     */
    public org.apache.xmlbeans.XmlString xgetSecurityToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYTOKEN$4, 0);
            return target;
        }
    }

    /**
     * Tests for nil "SecurityToken" element
     */
    public boolean isNilSecurityToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYTOKEN$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "SecurityToken" element
     */
    public boolean isSetSecurityToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYTOKEN$4) != 0;
        }
    }

    /**
     * Sets the "SecurityToken" element
     */
    public void setSecurityToken(String securityToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYTOKEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYTOKEN$4);
            }
            target.setStringValue(securityToken);
        }
    }
    
    /**
     * Sets (as xml) the "SecurityToken" element
     */
    public void xsetSecurityToken(org.apache.xmlbeans.XmlString securityToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYTOKEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECURITYTOKEN$4);
            }
            target.set(securityToken);
        }
    }
    
    /**
     * Nils the "SecurityToken" element
     */
    public void setNilSecurityToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SECURITYTOKEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SECURITYTOKEN$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SecurityToken" element
     */
    public void unsetSecurityToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYTOKEN$4, 0);
        }
    }
}
