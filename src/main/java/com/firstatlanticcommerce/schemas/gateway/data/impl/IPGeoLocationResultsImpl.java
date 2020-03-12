/*
 * XML Type:  IPGeoLocationResults
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.IPGeoLocationResults
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.IPGeoLocationResults;

/**
 * An XML IPGeoLocationResults(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class IPGeoLocationResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements IPGeoLocationResults
{
    private static final long serialVersionUID = 1L;
    
    public IPGeoLocationResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITY$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "City");
    private static final javax.xml.namespace.QName COUNTRYLONG$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "CountryLong");
    private static final javax.xml.namespace.QName COUNTRYSHORT$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "CountryShort");
    private static final javax.xml.namespace.QName DOMAINNAME$6 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "DomainName");
    private static final javax.xml.namespace.QName IPADDRESS$8 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "IPAddress");
    private static final javax.xml.namespace.QName IPRESPONSECODE$10 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "IPResponseCode");
    private static final javax.xml.namespace.QName IPRESPONSECODEDESCRIPTION$12 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "IPResponseCodeDescription");
    private static final javax.xml.namespace.QName ISP$14 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ISP");
    private static final javax.xml.namespace.QName LATITUDE$16 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Latitude");
    private static final javax.xml.namespace.QName LONGITUDE$18 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Longitude");
    private static final javax.xml.namespace.QName REGION$20 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Region");
    private static final javax.xml.namespace.QName TIMEZONE$22 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "TimeZone");
    private static final javax.xml.namespace.QName ZIPCODE$24 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ZipCode");
    
    
    /**
     * Gets the "City" element
     */
    public String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "City" element
     */
    public org.apache.xmlbeans.XmlString xgetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$0, 0);
            return target;
        }
    }

    /**
     * Tests for nil "City" element
     */
    public boolean isNilCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "City" element
     */
    public boolean isSetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITY$0) != 0;
        }
    }

    /**
     * Sets the "City" element
     */
    public void setCity(String city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$0);
            }
            target.setStringValue(city);
        }
    }

    /**
     * Sets (as xml) the "City" element
     */
    public void xsetCity(org.apache.xmlbeans.XmlString city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$0);
            }
            target.set(city);
        }
    }

    /**
     * Nils the "City" element
     */
    public void setNilCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$0);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "City" element
     */
    public void unsetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITY$0, 0);
        }
    }

    /**
     * Gets the "CountryLong" element
     */
    public String getCountryLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYLONG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "CountryLong" element
     */
    public org.apache.xmlbeans.XmlString xgetCountryLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYLONG$2, 0);
            return target;
        }
    }

    /**
     * Tests for nil "CountryLong" element
     */
    public boolean isNilCountryLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYLONG$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "CountryLong" element
     */
    public boolean isSetCountryLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRYLONG$2) != 0;
        }
    }

    /**
     * Sets the "CountryLong" element
     */
    public void setCountryLong(String countryLong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYLONG$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYLONG$2);
            }
            target.setStringValue(countryLong);
        }
    }

    /**
     * Sets (as xml) the "CountryLong" element
     */
    public void xsetCountryLong(org.apache.xmlbeans.XmlString countryLong)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYLONG$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYLONG$2);
            }
            target.set(countryLong);
        }
    }

    /**
     * Nils the "CountryLong" element
     */
    public void setNilCountryLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYLONG$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYLONG$2);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "CountryLong" element
     */
    public void unsetCountryLong()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRYLONG$2, 0);
        }
    }

    /**
     * Gets the "CountryShort" element
     */
    public String getCountryShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYSHORT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "CountryShort" element
     */
    public org.apache.xmlbeans.XmlString xgetCountryShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYSHORT$4, 0);
            return target;
        }
    }

    /**
     * Tests for nil "CountryShort" element
     */
    public boolean isNilCountryShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYSHORT$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "CountryShort" element
     */
    public boolean isSetCountryShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRYSHORT$4) != 0;
        }
    }

    /**
     * Sets the "CountryShort" element
     */
    public void setCountryShort(String countryShort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYSHORT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYSHORT$4);
            }
            target.setStringValue(countryShort);
        }
    }

    /**
     * Sets (as xml) the "CountryShort" element
     */
    public void xsetCountryShort(org.apache.xmlbeans.XmlString countryShort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYSHORT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYSHORT$4);
            }
            target.set(countryShort);
        }
    }

    /**
     * Nils the "CountryShort" element
     */
    public void setNilCountryShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRYSHORT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRYSHORT$4);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "CountryShort" element
     */
    public void unsetCountryShort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRYSHORT$4, 0);
        }
    }

    /**
     * Gets the "DomainName" element
     */
    public String getDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "DomainName" element
     */
    public org.apache.xmlbeans.XmlString xgetDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINNAME$6, 0);
            return target;
        }
    }

    /**
     * Tests for nil "DomainName" element
     */
    public boolean isNilDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINNAME$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "DomainName" element
     */
    public boolean isSetDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINNAME$6) != 0;
        }
    }

    /**
     * Sets the "DomainName" element
     */
    public void setDomainName(String domainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMAINNAME$6);
            }
            target.setStringValue(domainName);
        }
    }

    /**
     * Sets (as xml) the "DomainName" element
     */
    public void xsetDomainName(org.apache.xmlbeans.XmlString domainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMAINNAME$6);
            }
            target.set(domainName);
        }
    }

    /**
     * Nils the "DomainName" element
     */
    public void setNilDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMAINNAME$6);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "DomainName" element
     */
    public void unsetDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINNAME$6, 0);
        }
    }

    /**
     * Gets the "IPAddress" element
     */
    public String getIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPADDRESS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "IPAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPADDRESS$8, 0);
            return target;
        }
    }

    /**
     * Tests for nil "IPAddress" element
     */
    public boolean isNilIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPADDRESS$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "IPAddress" element
     */
    public boolean isSetIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IPADDRESS$8) != 0;
        }
    }

    /**
     * Sets the "IPAddress" element
     */
    public void setIPAddress(String ipAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPADDRESS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IPADDRESS$8);
            }
            target.setStringValue(ipAddress);
        }
    }

    /**
     * Sets (as xml) the "IPAddress" element
     */
    public void xsetIPAddress(org.apache.xmlbeans.XmlString ipAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPADDRESS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IPADDRESS$8);
            }
            target.set(ipAddress);
        }
    }

    /**
     * Nils the "IPAddress" element
     */
    public void setNilIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPADDRESS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IPADDRESS$8);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "IPAddress" element
     */
    public void unsetIPAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IPADDRESS$8, 0);
        }
    }

    /**
     * Gets the "IPResponseCode" element
     */
    public String getIPResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPRESPONSECODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "IPResponseCode" element
     */
    public org.apache.xmlbeans.XmlString xgetIPResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPRESPONSECODE$10, 0);
            return target;
        }
    }

    /**
     * Tests for nil "IPResponseCode" element
     */
    public boolean isNilIPResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPRESPONSECODE$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "IPResponseCode" element
     */
    public boolean isSetIPResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IPRESPONSECODE$10) != 0;
        }
    }

    /**
     * Sets the "IPResponseCode" element
     */
    public void setIPResponseCode(String ipResponseCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPRESPONSECODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IPRESPONSECODE$10);
            }
            target.setStringValue(ipResponseCode);
        }
    }

    /**
     * Sets (as xml) the "IPResponseCode" element
     */
    public void xsetIPResponseCode(org.apache.xmlbeans.XmlString ipResponseCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPRESPONSECODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IPRESPONSECODE$10);
            }
            target.set(ipResponseCode);
        }
    }

    /**
     * Nils the "IPResponseCode" element
     */
    public void setNilIPResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPRESPONSECODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IPRESPONSECODE$10);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "IPResponseCode" element
     */
    public void unsetIPResponseCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IPRESPONSECODE$10, 0);
        }
    }

    /**
     * Gets the "IPResponseCodeDescription" element
     */
    public String getIPResponseCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPRESPONSECODEDESCRIPTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "IPResponseCodeDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetIPResponseCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPRESPONSECODEDESCRIPTION$12, 0);
            return target;
        }
    }

    /**
     * Tests for nil "IPResponseCodeDescription" element
     */
    public boolean isNilIPResponseCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPRESPONSECODEDESCRIPTION$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "IPResponseCodeDescription" element
     */
    public boolean isSetIPResponseCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IPRESPONSECODEDESCRIPTION$12) != 0;
        }
    }

    /**
     * Sets the "IPResponseCodeDescription" element
     */
    public void setIPResponseCodeDescription(String ipResponseCodeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IPRESPONSECODEDESCRIPTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IPRESPONSECODEDESCRIPTION$12);
            }
            target.setStringValue(ipResponseCodeDescription);
        }
    }

    /**
     * Sets (as xml) the "IPResponseCodeDescription" element
     */
    public void xsetIPResponseCodeDescription(org.apache.xmlbeans.XmlString ipResponseCodeDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPRESPONSECODEDESCRIPTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IPRESPONSECODEDESCRIPTION$12);
            }
            target.set(ipResponseCodeDescription);
        }
    }

    /**
     * Nils the "IPResponseCodeDescription" element
     */
    public void setNilIPResponseCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IPRESPONSECODEDESCRIPTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IPRESPONSECODEDESCRIPTION$12);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "IPResponseCodeDescription" element
     */
    public void unsetIPResponseCodeDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IPRESPONSECODEDESCRIPTION$12, 0);
        }
    }

    /**
     * Gets the "ISP" element
     */
    public String getISP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISP$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ISP" element
     */
    public org.apache.xmlbeans.XmlString xgetISP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISP$14, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ISP" element
     */
    public boolean isNilISP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISP$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ISP" element
     */
    public boolean isSetISP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISP$14) != 0;
        }
    }

    /**
     * Sets the "ISP" element
     */
    public void setISP(String isp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISP$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISP$14);
            }
            target.setStringValue(isp);
        }
    }

    /**
     * Sets (as xml) the "ISP" element
     */
    public void xsetISP(org.apache.xmlbeans.XmlString isp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISP$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISP$14);
            }
            target.set(isp);
        }
    }

    /**
     * Nils the "ISP" element
     */
    public void setNilISP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISP$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISP$14);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ISP" element
     */
    public void unsetISP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISP$14, 0);
        }
    }

    /**
     * Gets the "Latitude" element
     */
    public String getLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Latitude" element
     */
    public org.apache.xmlbeans.XmlString xgetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$16, 0);
            return target;
        }
    }

    /**
     * Tests for nil "Latitude" element
     */
    public boolean isNilLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "Latitude" element
     */
    public boolean isSetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATITUDE$16) != 0;
        }
    }

    /**
     * Sets the "Latitude" element
     */
    public void setLatitude(String latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$16);
            }
            target.setStringValue(latitude);
        }
    }

    /**
     * Sets (as xml) the "Latitude" element
     */
    public void xsetLatitude(org.apache.xmlbeans.XmlString latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LATITUDE$16);
            }
            target.set(latitude);
        }
    }

    /**
     * Nils the "Latitude" element
     */
    public void setNilLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LATITUDE$16);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "Latitude" element
     */
    public void unsetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATITUDE$16, 0);
        }
    }

    /**
     * Gets the "Longitude" element
     */
    public String getLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Longitude" element
     */
    public org.apache.xmlbeans.XmlString xgetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$18, 0);
            return target;
        }
    }

    /**
     * Tests for nil "Longitude" element
     */
    public boolean isNilLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "Longitude" element
     */
    public boolean isSetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LONGITUDE$18) != 0;
        }
    }

    /**
     * Sets the "Longitude" element
     */
    public void setLongitude(String longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$18);
            }
            target.setStringValue(longitude);
        }
    }

    /**
     * Sets (as xml) the "Longitude" element
     */
    public void xsetLongitude(org.apache.xmlbeans.XmlString longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LONGITUDE$18);
            }
            target.set(longitude);
        }
    }

    /**
     * Nils the "Longitude" element
     */
    public void setNilLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LONGITUDE$18);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "Longitude" element
     */
    public void unsetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LONGITUDE$18, 0);
        }
    }

    /**
     * Gets the "Region" element
     */
    public String getRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Region" element
     */
    public org.apache.xmlbeans.XmlString xgetRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$20, 0);
            return target;
        }
    }

    /**
     * Tests for nil "Region" element
     */
    public boolean isNilRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "Region" element
     */
    public boolean isSetRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGION$20) != 0;
        }
    }

    /**
     * Sets the "Region" element
     */
    public void setRegion(String region)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGION$20);
            }
            target.setStringValue(region);
        }
    }

    /**
     * Sets (as xml) the "Region" element
     */
    public void xsetRegion(org.apache.xmlbeans.XmlString region)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGION$20);
            }
            target.set(region);
        }
    }

    /**
     * Nils the "Region" element
     */
    public void setNilRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGION$20);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "Region" element
     */
    public void unsetRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGION$20, 0);
        }
    }

    /**
     * Gets the "TimeZone" element
     */
    public String getTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "TimeZone" element
     */
    public org.apache.xmlbeans.XmlString xgetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEZONE$22, 0);
            return target;
        }
    }

    /**
     * Tests for nil "TimeZone" element
     */
    public boolean isNilTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEZONE$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "TimeZone" element
     */
    public boolean isSetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEZONE$22) != 0;
        }
    }

    /**
     * Sets the "TimeZone" element
     */
    public void setTimeZone(String timeZone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEZONE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEZONE$22);
            }
            target.setStringValue(timeZone);
        }
    }

    /**
     * Sets (as xml) the "TimeZone" element
     */
    public void xsetTimeZone(org.apache.xmlbeans.XmlString timeZone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEZONE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIMEZONE$22);
            }
            target.set(timeZone);
        }
    }

    /**
     * Nils the "TimeZone" element
     */
    public void setNilTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEZONE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIMEZONE$22);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "TimeZone" element
     */
    public void unsetTimeZone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEZONE$22, 0);
        }
    }

    /**
     * Gets the "ZipCode" element
     */
    public String getZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ZipCode" element
     */
    public org.apache.xmlbeans.XmlString xgetZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$24, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ZipCode" element
     */
    public boolean isNilZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ZipCode" element
     */
    public boolean isSetZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ZIPCODE$24) != 0;
        }
    }

    /**
     * Sets the "ZipCode" element
     */
    public void setZipCode(String zipCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ZIPCODE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ZIPCODE$24);
            }
            target.setStringValue(zipCode);
        }
    }
    
    /**
     * Sets (as xml) the "ZipCode" element
     */
    public void xsetZipCode(org.apache.xmlbeans.XmlString zipCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPCODE$24);
            }
            target.set(zipCode);
        }
    }
    
    /**
     * Nils the "ZipCode" element
     */
    public void setNilZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ZIPCODE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ZIPCODE$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ZipCode" element
     */
    public void unsetZipCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ZIPCODE$24, 0);
        }
    }
}
