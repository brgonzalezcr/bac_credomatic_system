/*
 * XML Type:  ShippingDetails
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.ShippingDetails
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.ShippingDetails;

/**
 * An XML ShippingDetails(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class ShippingDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ShippingDetails
{
    private static final long serialVersionUID = 1L;
    
    public ShippingDetailsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHIPTOADDRESS$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShipToAddress");
    private static final javax.xml.namespace.QName SHIPTOADDRESS2$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShipToAddress2");
    private static final javax.xml.namespace.QName SHIPTOCITY$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShipToCity");
    private static final javax.xml.namespace.QName SHIPTOCOUNTRY$6 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShipToCountry");
    private static final javax.xml.namespace.QName SHIPTOCOUNTY$8 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShipToCounty");
    private static final javax.xml.namespace.QName SHIPTOEMAIL$10 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShipToEmail");
    private static final javax.xml.namespace.QName SHIPTOFIRSTNAME$12 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShipToFirstName");
    private static final javax.xml.namespace.QName SHIPTOLASTNAME$14 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShipToLastName");
    private static final javax.xml.namespace.QName SHIPTOMOBILE$16 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShipToMobile");
    private static final javax.xml.namespace.QName SHIPTOSTATE$18 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShipToState");
    private static final javax.xml.namespace.QName SHIPTOTELEPHONE$20 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShipToTelephone");
    private static final javax.xml.namespace.QName SHIPTOZIPPOSTCODE$22 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ShipToZipPostCode");
    
    
    /**
     * Gets the "ShipToAddress" element
     */
    public String getShipToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ShipToAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetShipToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOADDRESS$0, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ShipToAddress" element
     */
    public boolean isNilShipToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOADDRESS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ShipToAddress" element
     */
    public boolean isSetShipToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOADDRESS$0) != 0;
        }
    }

    /**
     * Sets the "ShipToAddress" element
     */
    public void setShipToAddress(String shipToAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOADDRESS$0);
            }
            target.setStringValue(shipToAddress);
        }
    }

    /**
     * Sets (as xml) the "ShipToAddress" element
     */
    public void xsetShipToAddress(org.apache.xmlbeans.XmlString shipToAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOADDRESS$0);
            }
            target.set(shipToAddress);
        }
    }

    /**
     * Nils the "ShipToAddress" element
     */
    public void setNilShipToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOADDRESS$0);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ShipToAddress" element
     */
    public void unsetShipToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOADDRESS$0, 0);
        }
    }

    /**
     * Gets the "ShipToAddress2" element
     */
    public String getShipToAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOADDRESS2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ShipToAddress2" element
     */
    public org.apache.xmlbeans.XmlString xgetShipToAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOADDRESS2$2, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ShipToAddress2" element
     */
    public boolean isNilShipToAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOADDRESS2$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ShipToAddress2" element
     */
    public boolean isSetShipToAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOADDRESS2$2) != 0;
        }
    }

    /**
     * Sets the "ShipToAddress2" element
     */
    public void setShipToAddress2(String shipToAddress2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOADDRESS2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOADDRESS2$2);
            }
            target.setStringValue(shipToAddress2);
        }
    }

    /**
     * Sets (as xml) the "ShipToAddress2" element
     */
    public void xsetShipToAddress2(org.apache.xmlbeans.XmlString shipToAddress2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOADDRESS2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOADDRESS2$2);
            }
            target.set(shipToAddress2);
        }
    }

    /**
     * Nils the "ShipToAddress2" element
     */
    public void setNilShipToAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOADDRESS2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOADDRESS2$2);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ShipToAddress2" element
     */
    public void unsetShipToAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOADDRESS2$2, 0);
        }
    }

    /**
     * Gets the "ShipToCity" element
     */
    public String getShipToCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ShipToCity" element
     */
    public org.apache.xmlbeans.XmlString xgetShipToCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCITY$4, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ShipToCity" element
     */
    public boolean isNilShipToCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCITY$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ShipToCity" element
     */
    public boolean isSetShipToCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOCITY$4) != 0;
        }
    }

    /**
     * Sets the "ShipToCity" element
     */
    public void setShipToCity(String shipToCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOCITY$4);
            }
            target.setStringValue(shipToCity);
        }
    }

    /**
     * Sets (as xml) the "ShipToCity" element
     */
    public void xsetShipToCity(org.apache.xmlbeans.XmlString shipToCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOCITY$4);
            }
            target.set(shipToCity);
        }
    }

    /**
     * Nils the "ShipToCity" element
     */
    public void setNilShipToCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOCITY$4);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ShipToCity" element
     */
    public void unsetShipToCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOCITY$4, 0);
        }
    }

    /**
     * Gets the "ShipToCountry" element
     */
    public String getShipToCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCOUNTRY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ShipToCountry" element
     */
    public org.apache.xmlbeans.XmlString xgetShipToCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCOUNTRY$6, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ShipToCountry" element
     */
    public boolean isNilShipToCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCOUNTRY$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ShipToCountry" element
     */
    public boolean isSetShipToCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOCOUNTRY$6) != 0;
        }
    }

    /**
     * Sets the "ShipToCountry" element
     */
    public void setShipToCountry(String shipToCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCOUNTRY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOCOUNTRY$6);
            }
            target.setStringValue(shipToCountry);
        }
    }

    /**
     * Sets (as xml) the "ShipToCountry" element
     */
    public void xsetShipToCountry(org.apache.xmlbeans.XmlString shipToCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCOUNTRY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOCOUNTRY$6);
            }
            target.set(shipToCountry);
        }
    }

    /**
     * Nils the "ShipToCountry" element
     */
    public void setNilShipToCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCOUNTRY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOCOUNTRY$6);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ShipToCountry" element
     */
    public void unsetShipToCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOCOUNTRY$6, 0);
        }
    }

    /**
     * Gets the "ShipToCounty" element
     */
    public String getShipToCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCOUNTY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ShipToCounty" element
     */
    public org.apache.xmlbeans.XmlString xgetShipToCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCOUNTY$8, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ShipToCounty" element
     */
    public boolean isNilShipToCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCOUNTY$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ShipToCounty" element
     */
    public boolean isSetShipToCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOCOUNTY$8) != 0;
        }
    }

    /**
     * Sets the "ShipToCounty" element
     */
    public void setShipToCounty(String shipToCounty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOCOUNTY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOCOUNTY$8);
            }
            target.setStringValue(shipToCounty);
        }
    }

    /**
     * Sets (as xml) the "ShipToCounty" element
     */
    public void xsetShipToCounty(org.apache.xmlbeans.XmlString shipToCounty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCOUNTY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOCOUNTY$8);
            }
            target.set(shipToCounty);
        }
    }

    /**
     * Nils the "ShipToCounty" element
     */
    public void setNilShipToCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOCOUNTY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOCOUNTY$8);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ShipToCounty" element
     */
    public void unsetShipToCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOCOUNTY$8, 0);
        }
    }

    /**
     * Gets the "ShipToEmail" element
     */
    public String getShipToEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOEMAIL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ShipToEmail" element
     */
    public org.apache.xmlbeans.XmlString xgetShipToEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOEMAIL$10, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ShipToEmail" element
     */
    public boolean isNilShipToEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOEMAIL$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ShipToEmail" element
     */
    public boolean isSetShipToEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOEMAIL$10) != 0;
        }
    }

    /**
     * Sets the "ShipToEmail" element
     */
    public void setShipToEmail(String shipToEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOEMAIL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOEMAIL$10);
            }
            target.setStringValue(shipToEmail);
        }
    }

    /**
     * Sets (as xml) the "ShipToEmail" element
     */
    public void xsetShipToEmail(org.apache.xmlbeans.XmlString shipToEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOEMAIL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOEMAIL$10);
            }
            target.set(shipToEmail);
        }
    }

    /**
     * Nils the "ShipToEmail" element
     */
    public void setNilShipToEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOEMAIL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOEMAIL$10);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ShipToEmail" element
     */
    public void unsetShipToEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOEMAIL$10, 0);
        }
    }

    /**
     * Gets the "ShipToFirstName" element
     */
    public String getShipToFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOFIRSTNAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ShipToFirstName" element
     */
    public org.apache.xmlbeans.XmlString xgetShipToFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOFIRSTNAME$12, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ShipToFirstName" element
     */
    public boolean isNilShipToFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOFIRSTNAME$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ShipToFirstName" element
     */
    public boolean isSetShipToFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOFIRSTNAME$12) != 0;
        }
    }

    /**
     * Sets the "ShipToFirstName" element
     */
    public void setShipToFirstName(String shipToFirstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOFIRSTNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOFIRSTNAME$12);
            }
            target.setStringValue(shipToFirstName);
        }
    }

    /**
     * Sets (as xml) the "ShipToFirstName" element
     */
    public void xsetShipToFirstName(org.apache.xmlbeans.XmlString shipToFirstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOFIRSTNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOFIRSTNAME$12);
            }
            target.set(shipToFirstName);
        }
    }

    /**
     * Nils the "ShipToFirstName" element
     */
    public void setNilShipToFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOFIRSTNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOFIRSTNAME$12);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ShipToFirstName" element
     */
    public void unsetShipToFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOFIRSTNAME$12, 0);
        }
    }

    /**
     * Gets the "ShipToLastName" element
     */
    public String getShipToLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLASTNAME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ShipToLastName" element
     */
    public org.apache.xmlbeans.XmlString xgetShipToLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLASTNAME$14, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ShipToLastName" element
     */
    public boolean isNilShipToLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLASTNAME$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ShipToLastName" element
     */
    public boolean isSetShipToLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOLASTNAME$14) != 0;
        }
    }

    /**
     * Sets the "ShipToLastName" element
     */
    public void setShipToLastName(String shipToLastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOLASTNAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOLASTNAME$14);
            }
            target.setStringValue(shipToLastName);
        }
    }

    /**
     * Sets (as xml) the "ShipToLastName" element
     */
    public void xsetShipToLastName(org.apache.xmlbeans.XmlString shipToLastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLASTNAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOLASTNAME$14);
            }
            target.set(shipToLastName);
        }
    }

    /**
     * Nils the "ShipToLastName" element
     */
    public void setNilShipToLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOLASTNAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOLASTNAME$14);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ShipToLastName" element
     */
    public void unsetShipToLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOLASTNAME$14, 0);
        }
    }

    /**
     * Gets the "ShipToMobile" element
     */
    public String getShipToMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOMOBILE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ShipToMobile" element
     */
    public org.apache.xmlbeans.XmlString xgetShipToMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOMOBILE$16, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ShipToMobile" element
     */
    public boolean isNilShipToMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOMOBILE$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ShipToMobile" element
     */
    public boolean isSetShipToMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOMOBILE$16) != 0;
        }
    }

    /**
     * Sets the "ShipToMobile" element
     */
    public void setShipToMobile(String shipToMobile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOMOBILE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOMOBILE$16);
            }
            target.setStringValue(shipToMobile);
        }
    }

    /**
     * Sets (as xml) the "ShipToMobile" element
     */
    public void xsetShipToMobile(org.apache.xmlbeans.XmlString shipToMobile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOMOBILE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOMOBILE$16);
            }
            target.set(shipToMobile);
        }
    }

    /**
     * Nils the "ShipToMobile" element
     */
    public void setNilShipToMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOMOBILE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOMOBILE$16);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ShipToMobile" element
     */
    public void unsetShipToMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOMOBILE$16, 0);
        }
    }

    /**
     * Gets the "ShipToState" element
     */
    public String getShipToState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOSTATE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ShipToState" element
     */
    public org.apache.xmlbeans.XmlString xgetShipToState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOSTATE$18, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ShipToState" element
     */
    public boolean isNilShipToState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOSTATE$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ShipToState" element
     */
    public boolean isSetShipToState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOSTATE$18) != 0;
        }
    }

    /**
     * Sets the "ShipToState" element
     */
    public void setShipToState(String shipToState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOSTATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOSTATE$18);
            }
            target.setStringValue(shipToState);
        }
    }

    /**
     * Sets (as xml) the "ShipToState" element
     */
    public void xsetShipToState(org.apache.xmlbeans.XmlString shipToState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOSTATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOSTATE$18);
            }
            target.set(shipToState);
        }
    }

    /**
     * Nils the "ShipToState" element
     */
    public void setNilShipToState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOSTATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOSTATE$18);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ShipToState" element
     */
    public void unsetShipToState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOSTATE$18, 0);
        }
    }

    /**
     * Gets the "ShipToTelephone" element
     */
    public String getShipToTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOTELEPHONE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ShipToTelephone" element
     */
    public org.apache.xmlbeans.XmlString xgetShipToTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOTELEPHONE$20, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ShipToTelephone" element
     */
    public boolean isNilShipToTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOTELEPHONE$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ShipToTelephone" element
     */
    public boolean isSetShipToTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOTELEPHONE$20) != 0;
        }
    }

    /**
     * Sets the "ShipToTelephone" element
     */
    public void setShipToTelephone(String shipToTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOTELEPHONE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOTELEPHONE$20);
            }
            target.setStringValue(shipToTelephone);
        }
    }

    /**
     * Sets (as xml) the "ShipToTelephone" element
     */
    public void xsetShipToTelephone(org.apache.xmlbeans.XmlString shipToTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOTELEPHONE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOTELEPHONE$20);
            }
            target.set(shipToTelephone);
        }
    }

    /**
     * Nils the "ShipToTelephone" element
     */
    public void setNilShipToTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOTELEPHONE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOTELEPHONE$20);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ShipToTelephone" element
     */
    public void unsetShipToTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOTELEPHONE$20, 0);
        }
    }

    /**
     * Gets the "ShipToZipPostCode" element
     */
    public String getShipToZipPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOZIPPOSTCODE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ShipToZipPostCode" element
     */
    public org.apache.xmlbeans.XmlString xgetShipToZipPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOZIPPOSTCODE$22, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ShipToZipPostCode" element
     */
    public boolean isNilShipToZipPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOZIPPOSTCODE$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ShipToZipPostCode" element
     */
    public boolean isSetShipToZipPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHIPTOZIPPOSTCODE$22) != 0;
        }
    }

    /**
     * Sets the "ShipToZipPostCode" element
     */
    public void setShipToZipPostCode(String shipToZipPostCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHIPTOZIPPOSTCODE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHIPTOZIPPOSTCODE$22);
            }
            target.setStringValue(shipToZipPostCode);
        }
    }
    
    /**
     * Sets (as xml) the "ShipToZipPostCode" element
     */
    public void xsetShipToZipPostCode(org.apache.xmlbeans.XmlString shipToZipPostCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOZIPPOSTCODE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOZIPPOSTCODE$22);
            }
            target.set(shipToZipPostCode);
        }
    }
    
    /**
     * Nils the "ShipToZipPostCode" element
     */
    public void setNilShipToZipPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHIPTOZIPPOSTCODE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHIPTOZIPPOSTCODE$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ShipToZipPostCode" element
     */
    public void unsetShipToZipPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHIPTOZIPPOSTCODE$22, 0);
        }
    }
}
