/*
 * An XML document type.
 * Localname: ShippingDetails
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.ShippingDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.ShippingDetails;
import com.firstatlanticcommerce.schemas.gateway.data.ShippingDetailsDocument;

/**
 * A document containing one ShippingDetails(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class ShippingDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ShippingDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShippingDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHIPPINGDETAILS$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShippingDetails");
    
    
    /**
     * Gets the "ShippingDetails" element
     */
    public ShippingDetails getShippingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ShippingDetails target = null;
            target = (ShippingDetails)get_store().find_element_user(SHIPPINGDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ShippingDetails" element
     */
    public boolean isNilShippingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ShippingDetails target = null;
            target = (ShippingDetails)get_store().find_element_user(SHIPPINGDETAILS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ShippingDetails" element
     */
    public void setShippingDetails(ShippingDetails shippingDetails)
    {
        generatedSetterHelperImpl(shippingDetails, SHIPPINGDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ShippingDetails" element
     */
    public ShippingDetails addNewShippingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ShippingDetails target = null;
            target = (ShippingDetails)get_store().add_element_user(SHIPPINGDETAILS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ShippingDetails" element
     */
    public void setNilShippingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ShippingDetails target = null;
            target = (ShippingDetails)get_store().find_element_user(SHIPPINGDETAILS$0, 0);
            if (target == null)
            {
                target = (ShippingDetails)get_store().add_element_user(SHIPPINGDETAILS$0);
            }
            target.setNil();
        }
    }
}
