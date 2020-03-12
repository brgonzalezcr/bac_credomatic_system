/*
 * XML Type:  HostedPageResultsResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.HostedPageResultsResponse
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.AuthorizeResponse;
import com.firstatlanticcommerce.schemas.gateway.data.HostedPageResultsResponse;
import com.firstatlanticcommerce.schemas.gateway.data.ThreeDSecureDetails;

/**
 * An XML HostedPageResultsResponse(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class HostedPageResultsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements HostedPageResultsResponse
{
    private static final long serialVersionUID = 1L;
    
    public HostedPageResultsResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHRESPONSE$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "AuthResponse");
    private static final javax.xml.namespace.QName THREEDSRESPONSE$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ThreeDSResponse");
    private static final javax.xml.namespace.QName PURCHASEAMOUNT$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "PurchaseAmount");
    
    
    /**
     * Gets the "AuthResponse" element
     */
    public AuthorizeResponse getAuthResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AuthorizeResponse target = null;
            target = (AuthorizeResponse)get_store().find_element_user(AUTHRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AuthResponse" element
     */
    public boolean isNilAuthResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AuthorizeResponse target = null;
            target = (AuthorizeResponse)get_store().find_element_user(AUTHRESPONSE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AuthResponse" element
     */
    public boolean isSetAuthResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHRESPONSE$0) != 0;
        }
    }
    
    /**
     * Sets the "AuthResponse" element
     */
    public void setAuthResponse(AuthorizeResponse authResponse)
    {
        generatedSetterHelperImpl(authResponse, AUTHRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AuthResponse" element
     */
    public AuthorizeResponse addNewAuthResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AuthorizeResponse target = null;
            target = (AuthorizeResponse)get_store().add_element_user(AUTHRESPONSE$0);
            return target;
        }
    }
    
    /**
     * Nils the "AuthResponse" element
     */
    public void setNilAuthResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            AuthorizeResponse target = null;
            target = (AuthorizeResponse)get_store().find_element_user(AUTHRESPONSE$0, 0);
            if (target == null)
            {
                target = (AuthorizeResponse)get_store().add_element_user(AUTHRESPONSE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AuthResponse" element
     */
    public void unsetAuthResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHRESPONSE$0, 0);
        }
    }
    
    /**
     * Gets the "ThreeDSResponse" element
     */
    public ThreeDSecureDetails getThreeDSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ThreeDSecureDetails target = null;
            target = (ThreeDSecureDetails)get_store().find_element_user(THREEDSRESPONSE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ThreeDSResponse" element
     */
    public boolean isNilThreeDSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ThreeDSecureDetails target = null;
            target = (ThreeDSecureDetails)get_store().find_element_user(THREEDSRESPONSE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ThreeDSResponse" element
     */
    public boolean isSetThreeDSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THREEDSRESPONSE$2) != 0;
        }
    }
    
    /**
     * Sets the "ThreeDSResponse" element
     */
    public void setThreeDSResponse(ThreeDSecureDetails threeDSResponse)
    {
        generatedSetterHelperImpl(threeDSResponse, THREEDSRESPONSE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ThreeDSResponse" element
     */
    public ThreeDSecureDetails addNewThreeDSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ThreeDSecureDetails target = null;
            target = (ThreeDSecureDetails)get_store().add_element_user(THREEDSRESPONSE$2);
            return target;
        }
    }
    
    /**
     * Nils the "ThreeDSResponse" element
     */
    public void setNilThreeDSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ThreeDSecureDetails target = null;
            target = (ThreeDSecureDetails)get_store().find_element_user(THREEDSRESPONSE$2, 0);
            if (target == null)
            {
                target = (ThreeDSecureDetails)get_store().add_element_user(THREEDSRESPONSE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ThreeDSResponse" element
     */
    public void unsetThreeDSResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THREEDSRESPONSE$2, 0);
        }
    }
    
    /**
     * Gets the "PurchaseAmount" element
     */
    public String getPurchaseAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURCHASEAMOUNT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "PurchaseAmount" element
     */
    public org.apache.xmlbeans.XmlString xgetPurchaseAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PURCHASEAMOUNT$4, 0);
            return target;
        }
    }

    /**
     * Tests for nil "PurchaseAmount" element
     */
    public boolean isNilPurchaseAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PURCHASEAMOUNT$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "PurchaseAmount" element
     */
    public boolean isSetPurchaseAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURCHASEAMOUNT$4) != 0;
        }
    }

    /**
     * Sets the "PurchaseAmount" element
     */
    public void setPurchaseAmount(String purchaseAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PURCHASEAMOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PURCHASEAMOUNT$4);
            }
            target.setStringValue(purchaseAmount);
        }
    }
    
    /**
     * Sets (as xml) the "PurchaseAmount" element
     */
    public void xsetPurchaseAmount(org.apache.xmlbeans.XmlString purchaseAmount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PURCHASEAMOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PURCHASEAMOUNT$4);
            }
            target.set(purchaseAmount);
        }
    }
    
    /**
     * Nils the "PurchaseAmount" element
     */
    public void setNilPurchaseAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PURCHASEAMOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PURCHASEAMOUNT$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PurchaseAmount" element
     */
    public void unsetPurchaseAmount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURCHASEAMOUNT$4, 0);
        }
    }
}
