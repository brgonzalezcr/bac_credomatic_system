/*
 * XML Type:  BinCheckResults
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.BinCheckResults
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.BinCheckResults;

/**
 * An XML BinCheckResults(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class BinCheckResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements BinCheckResults
{
    private static final long serialVersionUID = 1L;
    
    public BinCheckResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BIN$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BIN");
    private static final javax.xml.namespace.QName BRAND$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Brand");
    private static final javax.xml.namespace.QName COUNTRY$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Country");
    private static final javax.xml.namespace.QName ISSUER$6 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Issuer");
    private static final javax.xml.namespace.QName SUBTYPE$8 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Subtype");
    private static final javax.xml.namespace.QName TYPE$10 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Type");
    
    
    /**
     * Gets the "BIN" element
     */
    public String getBIN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BIN" element
     */
    public org.apache.xmlbeans.XmlString xgetBIN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIN$0, 0);
            return target;
        }
    }

    /**
     * Tests for nil "BIN" element
     */
    public boolean isNilBIN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIN$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BIN" element
     */
    public boolean isSetBIN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIN$0) != 0;
        }
    }

    /**
     * Sets the "BIN" element
     */
    public void setBIN(String bin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIN$0);
            }
            target.setStringValue(bin);
        }
    }

    /**
     * Sets (as xml) the "BIN" element
     */
    public void xsetBIN(org.apache.xmlbeans.XmlString bin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BIN$0);
            }
            target.set(bin);
        }
    }

    /**
     * Nils the "BIN" element
     */
    public void setNilBIN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BIN$0);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "BIN" element
     */
    public void unsetBIN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIN$0, 0);
        }
    }

    /**
     * Gets the "Brand" element
     */
    public String getBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRAND$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Brand" element
     */
    public org.apache.xmlbeans.XmlString xgetBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRAND$2, 0);
            return target;
        }
    }

    /**
     * Tests for nil "Brand" element
     */
    public boolean isNilBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRAND$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "Brand" element
     */
    public boolean isSetBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRAND$2) != 0;
        }
    }

    /**
     * Sets the "Brand" element
     */
    public void setBrand(String brand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRAND$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRAND$2);
            }
            target.setStringValue(brand);
        }
    }

    /**
     * Sets (as xml) the "Brand" element
     */
    public void xsetBrand(org.apache.xmlbeans.XmlString brand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRAND$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRAND$2);
            }
            target.set(brand);
        }
    }

    /**
     * Nils the "Brand" element
     */
    public void setNilBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRAND$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRAND$2);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "Brand" element
     */
    public void unsetBrand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRAND$2, 0);
        }
    }

    /**
     * Gets the "Country" element
     */
    public String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Country" element
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$4, 0);
            return target;
        }
    }

    /**
     * Tests for nil "Country" element
     */
    public boolean isNilCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "Country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$4) != 0;
        }
    }

    /**
     * Sets the "Country" element
     */
    public void setCountry(String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$4);
            }
            target.setStringValue(country);
        }
    }

    /**
     * Sets (as xml) the "Country" element
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$4);
            }
            target.set(country);
        }
    }

    /**
     * Nils the "Country" element
     */
    public void setNilCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$4);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "Country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$4, 0);
        }
    }

    /**
     * Gets the "Issuer" element
     */
    public String getIssuer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Issuer" element
     */
    public org.apache.xmlbeans.XmlString xgetIssuer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUER$6, 0);
            return target;
        }
    }

    /**
     * Tests for nil "Issuer" element
     */
    public boolean isNilIssuer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUER$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "Issuer" element
     */
    public boolean isSetIssuer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSUER$6) != 0;
        }
    }

    /**
     * Sets the "Issuer" element
     */
    public void setIssuer(String issuer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUER$6);
            }
            target.setStringValue(issuer);
        }
    }

    /**
     * Sets (as xml) the "Issuer" element
     */
    public void xsetIssuer(org.apache.xmlbeans.XmlString issuer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISSUER$6);
            }
            target.set(issuer);
        }
    }

    /**
     * Nils the "Issuer" element
     */
    public void setNilIssuer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISSUER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISSUER$6);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "Issuer" element
     */
    public void unsetIssuer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSUER$6, 0);
        }
    }

    /**
     * Gets the "Subtype" element
     */
    public String getSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Subtype" element
     */
    public org.apache.xmlbeans.XmlString xgetSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBTYPE$8, 0);
            return target;
        }
    }

    /**
     * Tests for nil "Subtype" element
     */
    public boolean isNilSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBTYPE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "Subtype" element
     */
    public boolean isSetSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBTYPE$8) != 0;
        }
    }

    /**
     * Sets the "Subtype" element
     */
    public void setSubtype(String subtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBTYPE$8);
            }
            target.setStringValue(subtype);
        }
    }

    /**
     * Sets (as xml) the "Subtype" element
     */
    public void xsetSubtype(org.apache.xmlbeans.XmlString subtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBTYPE$8);
            }
            target.set(subtype);
        }
    }

    /**
     * Nils the "Subtype" element
     */
    public void setNilSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBTYPE$8);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "Subtype" element
     */
    public void unsetSubtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBTYPE$8, 0);
        }
    }

    /**
     * Gets the "Type" element
     */
    public String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$10, 0);
            return target;
        }
    }

    /**
     * Tests for nil "Type" element
     */
    public boolean isNilType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "Type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$10) != 0;
        }
    }

    /**
     * Sets the "Type" element
     */
    public void setType(String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$10);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$10);
            }
            target.set(type);
        }
    }
    
    /**
     * Nils the "Type" element
     */
    public void setNilType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$10, 0);
        }
    }
}
