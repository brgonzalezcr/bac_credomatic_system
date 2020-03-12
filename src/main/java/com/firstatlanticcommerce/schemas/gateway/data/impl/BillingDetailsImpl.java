/*
 * XML Type:  BillingDetails
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.BillingDetails
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.BillingDetails;

/**
 * An XML BillingDetails(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class BillingDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements BillingDetails
{
    private static final long serialVersionUID = 1L;
    
    public BillingDetailsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BILLTOADDRESS$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillToAddress");
    private static final javax.xml.namespace.QName BILLTOADDRESS2$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillToAddress2");
    private static final javax.xml.namespace.QName BILLTOCITY$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillToCity");
    private static final javax.xml.namespace.QName BILLTOCOUNTRY$6 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillToCountry");
    private static final javax.xml.namespace.QName BILLTOEMAIL$8 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillToEmail");
    private static final javax.xml.namespace.QName BILLTOFIRSTNAME$10 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillToFirstName");
    private static final javax.xml.namespace.QName BILLTOLASTNAME$12 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillToLastName");
    private static final javax.xml.namespace.QName BILLTOSTATE$14 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillToState");
    private static final javax.xml.namespace.QName BILLTOTELEPHONE$16 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillToTelephone");
    private static final javax.xml.namespace.QName BILLTOZIPPOSTCODE$18 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillToZipPostCode");
    private static final javax.xml.namespace.QName BILLTOCOUNTY$20 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillToCounty");
    private static final javax.xml.namespace.QName BILLTOMOBILE$22 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "BillToMobile");
    
    
    /**
     * Gets the "BillToAddress" element
     */
    public String getBillToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BillToAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetBillToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOADDRESS$0, 0);
            return target;
        }
    }

    /**
     * Tests for nil "BillToAddress" element
     */
    public boolean isNilBillToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOADDRESS$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BillToAddress" element
     */
    public boolean isSetBillToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOADDRESS$0) != 0;
        }
    }

    /**
     * Sets the "BillToAddress" element
     */
    public void setBillToAddress(String billToAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOADDRESS$0);
            }
            target.setStringValue(billToAddress);
        }
    }

    /**
     * Sets (as xml) the "BillToAddress" element
     */
    public void xsetBillToAddress(org.apache.xmlbeans.XmlString billToAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOADDRESS$0);
            }
            target.set(billToAddress);
        }
    }

    /**
     * Nils the "BillToAddress" element
     */
    public void setNilBillToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOADDRESS$0);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "BillToAddress" element
     */
    public void unsetBillToAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOADDRESS$0, 0);
        }
    }

    /**
     * Gets the "BillToAddress2" element
     */
    public String getBillToAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOADDRESS2$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BillToAddress2" element
     */
    public org.apache.xmlbeans.XmlString xgetBillToAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOADDRESS2$2, 0);
            return target;
        }
    }

    /**
     * Tests for nil "BillToAddress2" element
     */
    public boolean isNilBillToAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOADDRESS2$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BillToAddress2" element
     */
    public boolean isSetBillToAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOADDRESS2$2) != 0;
        }
    }

    /**
     * Sets the "BillToAddress2" element
     */
    public void setBillToAddress2(String billToAddress2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOADDRESS2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOADDRESS2$2);
            }
            target.setStringValue(billToAddress2);
        }
    }

    /**
     * Sets (as xml) the "BillToAddress2" element
     */
    public void xsetBillToAddress2(org.apache.xmlbeans.XmlString billToAddress2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOADDRESS2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOADDRESS2$2);
            }
            target.set(billToAddress2);
        }
    }

    /**
     * Nils the "BillToAddress2" element
     */
    public void setNilBillToAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOADDRESS2$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOADDRESS2$2);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "BillToAddress2" element
     */
    public void unsetBillToAddress2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOADDRESS2$2, 0);
        }
    }

    /**
     * Gets the "BillToCity" element
     */
    public String getBillToCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOCITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BillToCity" element
     */
    public org.apache.xmlbeans.XmlString xgetBillToCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCITY$4, 0);
            return target;
        }
    }

    /**
     * Tests for nil "BillToCity" element
     */
    public boolean isNilBillToCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCITY$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BillToCity" element
     */
    public boolean isSetBillToCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOCITY$4) != 0;
        }
    }

    /**
     * Sets the "BillToCity" element
     */
    public void setBillToCity(String billToCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOCITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOCITY$4);
            }
            target.setStringValue(billToCity);
        }
    }

    /**
     * Sets (as xml) the "BillToCity" element
     */
    public void xsetBillToCity(org.apache.xmlbeans.XmlString billToCity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOCITY$4);
            }
            target.set(billToCity);
        }
    }

    /**
     * Nils the "BillToCity" element
     */
    public void setNilBillToCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOCITY$4);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "BillToCity" element
     */
    public void unsetBillToCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOCITY$4, 0);
        }
    }

    /**
     * Gets the "BillToCountry" element
     */
    public String getBillToCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOCOUNTRY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BillToCountry" element
     */
    public org.apache.xmlbeans.XmlString xgetBillToCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCOUNTRY$6, 0);
            return target;
        }
    }

    /**
     * Tests for nil "BillToCountry" element
     */
    public boolean isNilBillToCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCOUNTRY$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BillToCountry" element
     */
    public boolean isSetBillToCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOCOUNTRY$6) != 0;
        }
    }

    /**
     * Sets the "BillToCountry" element
     */
    public void setBillToCountry(String billToCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOCOUNTRY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOCOUNTRY$6);
            }
            target.setStringValue(billToCountry);
        }
    }

    /**
     * Sets (as xml) the "BillToCountry" element
     */
    public void xsetBillToCountry(org.apache.xmlbeans.XmlString billToCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCOUNTRY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOCOUNTRY$6);
            }
            target.set(billToCountry);
        }
    }

    /**
     * Nils the "BillToCountry" element
     */
    public void setNilBillToCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCOUNTRY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOCOUNTRY$6);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "BillToCountry" element
     */
    public void unsetBillToCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOCOUNTRY$6, 0);
        }
    }

    /**
     * Gets the "BillToEmail" element
     */
    public String getBillToEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOEMAIL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BillToEmail" element
     */
    public org.apache.xmlbeans.XmlString xgetBillToEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOEMAIL$8, 0);
            return target;
        }
    }

    /**
     * Tests for nil "BillToEmail" element
     */
    public boolean isNilBillToEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOEMAIL$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BillToEmail" element
     */
    public boolean isSetBillToEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOEMAIL$8) != 0;
        }
    }

    /**
     * Sets the "BillToEmail" element
     */
    public void setBillToEmail(String billToEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOEMAIL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOEMAIL$8);
            }
            target.setStringValue(billToEmail);
        }
    }

    /**
     * Sets (as xml) the "BillToEmail" element
     */
    public void xsetBillToEmail(org.apache.xmlbeans.XmlString billToEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOEMAIL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOEMAIL$8);
            }
            target.set(billToEmail);
        }
    }

    /**
     * Nils the "BillToEmail" element
     */
    public void setNilBillToEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOEMAIL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOEMAIL$8);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "BillToEmail" element
     */
    public void unsetBillToEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOEMAIL$8, 0);
        }
    }

    /**
     * Gets the "BillToFirstName" element
     */
    public String getBillToFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOFIRSTNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BillToFirstName" element
     */
    public org.apache.xmlbeans.XmlString xgetBillToFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOFIRSTNAME$10, 0);
            return target;
        }
    }

    /**
     * Tests for nil "BillToFirstName" element
     */
    public boolean isNilBillToFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOFIRSTNAME$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BillToFirstName" element
     */
    public boolean isSetBillToFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOFIRSTNAME$10) != 0;
        }
    }

    /**
     * Sets the "BillToFirstName" element
     */
    public void setBillToFirstName(String billToFirstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOFIRSTNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOFIRSTNAME$10);
            }
            target.setStringValue(billToFirstName);
        }
    }

    /**
     * Sets (as xml) the "BillToFirstName" element
     */
    public void xsetBillToFirstName(org.apache.xmlbeans.XmlString billToFirstName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOFIRSTNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOFIRSTNAME$10);
            }
            target.set(billToFirstName);
        }
    }

    /**
     * Nils the "BillToFirstName" element
     */
    public void setNilBillToFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOFIRSTNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOFIRSTNAME$10);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "BillToFirstName" element
     */
    public void unsetBillToFirstName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOFIRSTNAME$10, 0);
        }
    }

    /**
     * Gets the "BillToLastName" element
     */
    public String getBillToLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOLASTNAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BillToLastName" element
     */
    public org.apache.xmlbeans.XmlString xgetBillToLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOLASTNAME$12, 0);
            return target;
        }
    }

    /**
     * Tests for nil "BillToLastName" element
     */
    public boolean isNilBillToLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOLASTNAME$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BillToLastName" element
     */
    public boolean isSetBillToLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOLASTNAME$12) != 0;
        }
    }

    /**
     * Sets the "BillToLastName" element
     */
    public void setBillToLastName(String billToLastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOLASTNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOLASTNAME$12);
            }
            target.setStringValue(billToLastName);
        }
    }

    /**
     * Sets (as xml) the "BillToLastName" element
     */
    public void xsetBillToLastName(org.apache.xmlbeans.XmlString billToLastName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOLASTNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOLASTNAME$12);
            }
            target.set(billToLastName);
        }
    }

    /**
     * Nils the "BillToLastName" element
     */
    public void setNilBillToLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOLASTNAME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOLASTNAME$12);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "BillToLastName" element
     */
    public void unsetBillToLastName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOLASTNAME$12, 0);
        }
    }

    /**
     * Gets the "BillToState" element
     */
    public String getBillToState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOSTATE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BillToState" element
     */
    public org.apache.xmlbeans.XmlString xgetBillToState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOSTATE$14, 0);
            return target;
        }
    }

    /**
     * Tests for nil "BillToState" element
     */
    public boolean isNilBillToState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOSTATE$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BillToState" element
     */
    public boolean isSetBillToState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOSTATE$14) != 0;
        }
    }

    /**
     * Sets the "BillToState" element
     */
    public void setBillToState(String billToState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOSTATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOSTATE$14);
            }
            target.setStringValue(billToState);
        }
    }

    /**
     * Sets (as xml) the "BillToState" element
     */
    public void xsetBillToState(org.apache.xmlbeans.XmlString billToState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOSTATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOSTATE$14);
            }
            target.set(billToState);
        }
    }

    /**
     * Nils the "BillToState" element
     */
    public void setNilBillToState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOSTATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOSTATE$14);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "BillToState" element
     */
    public void unsetBillToState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOSTATE$14, 0);
        }
    }

    /**
     * Gets the "BillToTelephone" element
     */
    public String getBillToTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOTELEPHONE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BillToTelephone" element
     */
    public org.apache.xmlbeans.XmlString xgetBillToTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOTELEPHONE$16, 0);
            return target;
        }
    }

    /**
     * Tests for nil "BillToTelephone" element
     */
    public boolean isNilBillToTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOTELEPHONE$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BillToTelephone" element
     */
    public boolean isSetBillToTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOTELEPHONE$16) != 0;
        }
    }

    /**
     * Sets the "BillToTelephone" element
     */
    public void setBillToTelephone(String billToTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOTELEPHONE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOTELEPHONE$16);
            }
            target.setStringValue(billToTelephone);
        }
    }

    /**
     * Sets (as xml) the "BillToTelephone" element
     */
    public void xsetBillToTelephone(org.apache.xmlbeans.XmlString billToTelephone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOTELEPHONE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOTELEPHONE$16);
            }
            target.set(billToTelephone);
        }
    }

    /**
     * Nils the "BillToTelephone" element
     */
    public void setNilBillToTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOTELEPHONE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOTELEPHONE$16);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "BillToTelephone" element
     */
    public void unsetBillToTelephone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOTELEPHONE$16, 0);
        }
    }

    /**
     * Gets the "BillToZipPostCode" element
     */
    public String getBillToZipPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOZIPPOSTCODE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BillToZipPostCode" element
     */
    public org.apache.xmlbeans.XmlString xgetBillToZipPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOZIPPOSTCODE$18, 0);
            return target;
        }
    }

    /**
     * Tests for nil "BillToZipPostCode" element
     */
    public boolean isNilBillToZipPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOZIPPOSTCODE$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BillToZipPostCode" element
     */
    public boolean isSetBillToZipPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOZIPPOSTCODE$18) != 0;
        }
    }

    /**
     * Sets the "BillToZipPostCode" element
     */
    public void setBillToZipPostCode(String billToZipPostCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOZIPPOSTCODE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOZIPPOSTCODE$18);
            }
            target.setStringValue(billToZipPostCode);
        }
    }

    /**
     * Sets (as xml) the "BillToZipPostCode" element
     */
    public void xsetBillToZipPostCode(org.apache.xmlbeans.XmlString billToZipPostCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOZIPPOSTCODE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOZIPPOSTCODE$18);
            }
            target.set(billToZipPostCode);
        }
    }

    /**
     * Nils the "BillToZipPostCode" element
     */
    public void setNilBillToZipPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOZIPPOSTCODE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOZIPPOSTCODE$18);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "BillToZipPostCode" element
     */
    public void unsetBillToZipPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOZIPPOSTCODE$18, 0);
        }
    }

    /**
     * Gets the "BillToCounty" element
     */
    public String getBillToCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOCOUNTY$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BillToCounty" element
     */
    public org.apache.xmlbeans.XmlString xgetBillToCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCOUNTY$20, 0);
            return target;
        }
    }

    /**
     * Tests for nil "BillToCounty" element
     */
    public boolean isNilBillToCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCOUNTY$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BillToCounty" element
     */
    public boolean isSetBillToCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOCOUNTY$20) != 0;
        }
    }

    /**
     * Sets the "BillToCounty" element
     */
    public void setBillToCounty(String billToCounty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOCOUNTY$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOCOUNTY$20);
            }
            target.setStringValue(billToCounty);
        }
    }

    /**
     * Sets (as xml) the "BillToCounty" element
     */
    public void xsetBillToCounty(org.apache.xmlbeans.XmlString billToCounty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCOUNTY$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOCOUNTY$20);
            }
            target.set(billToCounty);
        }
    }

    /**
     * Nils the "BillToCounty" element
     */
    public void setNilBillToCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOCOUNTY$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOCOUNTY$20);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "BillToCounty" element
     */
    public void unsetBillToCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOCOUNTY$20, 0);
        }
    }

    /**
     * Gets the "BillToMobile" element
     */
    public String getBillToMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOMOBILE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "BillToMobile" element
     */
    public org.apache.xmlbeans.XmlString xgetBillToMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOMOBILE$22, 0);
            return target;
        }
    }

    /**
     * Tests for nil "BillToMobile" element
     */
    public boolean isNilBillToMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOMOBILE$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "BillToMobile" element
     */
    public boolean isSetBillToMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BILLTOMOBILE$22) != 0;
        }
    }

    /**
     * Sets the "BillToMobile" element
     */
    public void setBillToMobile(String billToMobile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLTOMOBILE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLTOMOBILE$22);
            }
            target.setStringValue(billToMobile);
        }
    }
    
    /**
     * Sets (as xml) the "BillToMobile" element
     */
    public void xsetBillToMobile(org.apache.xmlbeans.XmlString billToMobile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOMOBILE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOMOBILE$22);
            }
            target.set(billToMobile);
        }
    }
    
    /**
     * Nils the "BillToMobile" element
     */
    public void setNilBillToMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLTOMOBILE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLTOMOBILE$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BillToMobile" element
     */
    public void unsetBillToMobile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BILLTOMOBILE$22, 0);
        }
    }
}
