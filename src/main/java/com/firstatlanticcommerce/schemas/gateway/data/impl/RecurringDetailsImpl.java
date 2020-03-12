/*
 * XML Type:  RecurringDetails
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.RecurringDetails
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data.impl;

import com.firstatlanticcommerce.schemas.gateway.data.RecurringDetails;

/**
 * An XML RecurringDetails(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public class RecurringDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements RecurringDetails
{
    private static final long serialVersionUID = 1L;
    
    public RecurringDetailsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXECUTIONDATE$0 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "ExecutionDate");
    private static final javax.xml.namespace.QName FREQUENCY$2 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "Frequency");
    private static final javax.xml.namespace.QName ISRECURRING$4 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "IsRecurring");
    private static final javax.xml.namespace.QName NUMBEROFRECURRENCES$6 = 
        new javax.xml.namespace.QName("http://schemas.firstatlanticcommerce.com/gateway/data", "NumberOfRecurrences");
    
    
    /**
     * Gets the "ExecutionDate" element
     */
    public String getExecutionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECUTIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "ExecutionDate" element
     */
    public org.apache.xmlbeans.XmlString xgetExecutionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXECUTIONDATE$0, 0);
            return target;
        }
    }

    /**
     * Tests for nil "ExecutionDate" element
     */
    public boolean isNilExecutionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXECUTIONDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "ExecutionDate" element
     */
    public boolean isSetExecutionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXECUTIONDATE$0) != 0;
        }
    }

    /**
     * Sets the "ExecutionDate" element
     */
    public void setExecutionDate(String executionDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECUTIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXECUTIONDATE$0);
            }
            target.setStringValue(executionDate);
        }
    }

    /**
     * Sets (as xml) the "ExecutionDate" element
     */
    public void xsetExecutionDate(org.apache.xmlbeans.XmlString executionDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXECUTIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXECUTIONDATE$0);
            }
            target.set(executionDate);
        }
    }

    /**
     * Nils the "ExecutionDate" element
     */
    public void setNilExecutionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXECUTIONDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXECUTIONDATE$0);
            }
            target.setNil();
        }
    }

    /**
     * Unsets the "ExecutionDate" element
     */
    public void unsetExecutionDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXECUTIONDATE$0, 0);
        }
    }

    /**
     * Gets the "Frequency" element
     */
    public String getFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREQUENCY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }

    /**
     * Gets (as xml) the "Frequency" element
     */
    public org.apache.xmlbeans.XmlString xgetFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREQUENCY$2, 0);
            return target;
        }
    }

    /**
     * Tests for nil "Frequency" element
     */
    public boolean isNilFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREQUENCY$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }

    /**
     * True if has "Frequency" element
     */
    public boolean isSetFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREQUENCY$2) != 0;
        }
    }

    /**
     * Sets the "Frequency" element
     */
    public void setFrequency(String frequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREQUENCY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREQUENCY$2);
            }
            target.setStringValue(frequency);
        }
    }
    
    /**
     * Sets (as xml) the "Frequency" element
     */
    public void xsetFrequency(org.apache.xmlbeans.XmlString frequency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREQUENCY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FREQUENCY$2);
            }
            target.set(frequency);
        }
    }
    
    /**
     * Nils the "Frequency" element
     */
    public void setNilFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREQUENCY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FREQUENCY$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "Frequency" element
     */
    public void unsetFrequency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREQUENCY$2, 0);
        }
    }
    
    /**
     * Gets the "IsRecurring" element
     */
    public boolean getIsRecurring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRECURRING$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsRecurring" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsRecurring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRECURRING$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsRecurring" element
     */
    public boolean isSetIsRecurring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISRECURRING$4) != 0;
        }
    }
    
    /**
     * Sets the "IsRecurring" element
     */
    public void setIsRecurring(boolean isRecurring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRECURRING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISRECURRING$4);
            }
            target.setBooleanValue(isRecurring);
        }
    }
    
    /**
     * Sets (as xml) the "IsRecurring" element
     */
    public void xsetIsRecurring(org.apache.xmlbeans.XmlBoolean isRecurring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRECURRING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISRECURRING$4);
            }
            target.set(isRecurring);
        }
    }
    
    /**
     * Unsets the "IsRecurring" element
     */
    public void unsetIsRecurring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISRECURRING$4, 0);
        }
    }
    
    /**
     * Gets the "NumberOfRecurrences" element
     */
    public int getNumberOfRecurrences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFRECURRENCES$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfRecurrences" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumberOfRecurrences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFRECURRENCES$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfRecurrences" element
     */
    public boolean isSetNumberOfRecurrences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFRECURRENCES$6) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfRecurrences" element
     */
    public void setNumberOfRecurrences(int numberOfRecurrences)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFRECURRENCES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFRECURRENCES$6);
            }
            target.setIntValue(numberOfRecurrences);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfRecurrences" element
     */
    public void xsetNumberOfRecurrences(org.apache.xmlbeans.XmlInt numberOfRecurrences)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFRECURRENCES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFRECURRENCES$6);
            }
            target.set(numberOfRecurrences);
        }
    }
    
    /**
     * Unsets the "NumberOfRecurrences" element
     */
    public void unsetNumberOfRecurrences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFRECURRENCES$6, 0);
        }
    }
}
