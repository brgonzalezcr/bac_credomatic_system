/*
 * XML Type:  RecurringDetails
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.RecurringDetails
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data;


/**
 * An XML RecurringDetails(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public interface RecurringDetails extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecurringDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9CAC302D2199EADE2090FC77680865A4").resolveHandle("recurringdetails429atype");
    
    /**
     * Gets the "ExecutionDate" element
     */
    String getExecutionDate();

    /**
     * Gets (as xml) the "ExecutionDate" element
     */
    org.apache.xmlbeans.XmlString xgetExecutionDate();

    /**
     * Tests for nil "ExecutionDate" element
     */
    boolean isNilExecutionDate();

    /**
     * True if has "ExecutionDate" element
     */
    boolean isSetExecutionDate();

    /**
     * Sets the "ExecutionDate" element
     */
    void setExecutionDate(String executionDate);

    /**
     * Sets (as xml) the "ExecutionDate" element
     */
    void xsetExecutionDate(org.apache.xmlbeans.XmlString executionDate);

    /**
     * Nils the "ExecutionDate" element
     */
    void setNilExecutionDate();

    /**
     * Unsets the "ExecutionDate" element
     */
    void unsetExecutionDate();

    /**
     * Gets the "Frequency" element
     */
    String getFrequency();

    /**
     * Gets (as xml) the "Frequency" element
     */
    org.apache.xmlbeans.XmlString xgetFrequency();

    /**
     * Tests for nil "Frequency" element
     */
    boolean isNilFrequency();

    /**
     * True if has "Frequency" element
     */
    boolean isSetFrequency();

    /**
     * Sets the "Frequency" element
     */
    void setFrequency(String frequency);

    /**
     * Sets (as xml) the "Frequency" element
     */
    void xsetFrequency(org.apache.xmlbeans.XmlString frequency);

    /**
     * Nils the "Frequency" element
     */
    void setNilFrequency();

    /**
     * Unsets the "Frequency" element
     */
    void unsetFrequency();

    /**
     * Gets the "IsRecurring" element
     */
    boolean getIsRecurring();

    /**
     * Gets (as xml) the "IsRecurring" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsRecurring();

    /**
     * True if has "IsRecurring" element
     */
    boolean isSetIsRecurring();

    /**
     * Sets the "IsRecurring" element
     */
    void setIsRecurring(boolean isRecurring);

    /**
     * Sets (as xml) the "IsRecurring" element
     */
    void xsetIsRecurring(org.apache.xmlbeans.XmlBoolean isRecurring);

    /**
     * Unsets the "IsRecurring" element
     */
    void unsetIsRecurring();

    /**
     * Gets the "NumberOfRecurrences" element
     */
    int getNumberOfRecurrences();

    /**
     * Gets (as xml) the "NumberOfRecurrences" element
     */
    org.apache.xmlbeans.XmlInt xgetNumberOfRecurrences();

    /**
     * True if has "NumberOfRecurrences" element
     */
    boolean isSetNumberOfRecurrences();

    /**
     * Sets the "NumberOfRecurrences" element
     */
    void setNumberOfRecurrences(int numberOfRecurrences);

    /**
     * Sets (as xml) the "NumberOfRecurrences" element
     */
    void xsetNumberOfRecurrences(org.apache.xmlbeans.XmlInt numberOfRecurrences);

    /**
     * Unsets the "NumberOfRecurrences" element
     */
    void unsetNumberOfRecurrences();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static RecurringDetails newInstance() {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static RecurringDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static RecurringDetails parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static RecurringDetails parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static RecurringDetails parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static RecurringDetails parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static RecurringDetails parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static RecurringDetails parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static RecurringDetails parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static RecurringDetails parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static RecurringDetails parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static RecurringDetails parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static RecurringDetails parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static RecurringDetails parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static RecurringDetails parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static RecurringDetails parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static RecurringDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static RecurringDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (RecurringDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
