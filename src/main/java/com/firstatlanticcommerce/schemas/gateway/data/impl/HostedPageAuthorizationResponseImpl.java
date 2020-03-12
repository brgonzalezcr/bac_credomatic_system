/*
 * XML Type:  HostedPageAuthorizationResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.HostedPageAuthorizationResponse
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.HostedPageAuthorizationResponse;

/**
 * An XML HostedPageAuthorizationResponse(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class HostedPageAuthorizationResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPageAuthorizationResponse
{
    private static final long serialVersionUID = 1L;
    
    public HostedPageAuthorizationResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSECODE$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ResponseCode");
    private static final javax.xml.namespace.QName RESPONSECODEDESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ResponseCodeDescription");
    private static final javax.xml.namespace.QName SINGLEUSETOKEN$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "SingleUseToken");
    
    
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
     * Gets the "SingleUseToken" element
     */
    public String getSingleUseToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINGLEUSETOKEN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "SingleUseToken" element
     */
    public org.apache.xmlbeans.XmlString xgetSingleUseToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SINGLEUSETOKEN$4, 0);
            return target;
        }
    }

    /**
     * Tests for nil "SingleUseToken" element
     */
    public boolean isNilSingleUseToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SINGLEUSETOKEN$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "SingleUseToken" element
     */
    public boolean isSetSingleUseToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SINGLEUSETOKEN$4) != 0;
        }
    }

    /**
     * Sets the "SingleUseToken" element
     */
    public void setSingleUseToken(String singleUseToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINGLEUSETOKEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SINGLEUSETOKEN$4);
            }
            target.setStringValue(singleUseToken);
        }
    }
    
    /**
     * Sets (as xml) the "SingleUseToken" element
     */
    public void xsetSingleUseToken(org.apache.xmlbeans.XmlString singleUseToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SINGLEUSETOKEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SINGLEUSETOKEN$4);
            }
            target.set(singleUseToken);
        }
    }
    
    /**
     * Nils the "SingleUseToken" element
     */
    public void setNilSingleUseToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SINGLEUSETOKEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SINGLEUSETOKEN$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "SingleUseToken" element
     */
    public void unsetSingleUseToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SINGLEUSETOKEN$4, 0);
        }
    }
}
