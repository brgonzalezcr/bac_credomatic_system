/*
 * An XML document type.
 * Localname: ThreeDSecureDetails
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.ThreeDSecureDetailsDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.ThreeDSecureDetails;
import com.firstatlanticcommerce.schemas.gateway.data.ThreeDSecureDetailsDocument;

/**
 * A document containing one ThreeDSecureDetails(@http://schemas.firstatlanticcommerce.com/gateway/data) element.
 *
 * This is a complex type.
 */
public class ThreeDSecureDetailsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ThreeDSecureDetailsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ThreeDSecureDetailsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THREEDSECUREDETAILS$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ThreeDSecureDetails");
    
    
    /**
     * Gets the "ThreeDSecureDetails" element
     */
    public ThreeDSecureDetails getThreeDSecureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ThreeDSecureDetails target = null;
            target = (ThreeDSecureDetails)get_store().find_element_user(THREEDSECUREDETAILS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ThreeDSecureDetails" element
     */
    public boolean isNilThreeDSecureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ThreeDSecureDetails target = null;
            target = (ThreeDSecureDetails)get_store().find_element_user(THREEDSECUREDETAILS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ThreeDSecureDetails" element
     */
    public void setThreeDSecureDetails(ThreeDSecureDetails threeDSecureDetails)
    {
        generatedSetterHelperImpl(threeDSecureDetails, THREEDSECUREDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ThreeDSecureDetails" element
     */
    public ThreeDSecureDetails addNewThreeDSecureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ThreeDSecureDetails target = null;
            target = (ThreeDSecureDetails)get_store().add_element_user(THREEDSECUREDETAILS$0);
            return target;
        }
    }
    
    /**
     * Nils the "ThreeDSecureDetails" element
     */
    public void setNilThreeDSecureDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ThreeDSecureDetails target = null;
            target = (ThreeDSecureDetails)get_store().find_element_user(THREEDSECUREDETAILS$0, 0);
            if (target == null)
            {
                target = (ThreeDSecureDetails)get_store().add_element_user(THREEDSECUREDETAILS$0);
            }
            target.setNil();
        }
    }
}
