/*
 * XML Type:  BinCheckResults
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.BinCheckResults
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data;


/**
 * An XML BinCheckResults(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public interface BinCheckResults extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BinCheckResults.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9CAC302D2199EADE2090FC77680865A4").resolveHandle("bincheckresultscdb8type");
    
    /**
     * Gets the "BIN" element
     */
    String getBIN();

    /**
     * Gets (as xml) the "BIN" element
     */
    org.apache.xmlbeans.XmlString xgetBIN();

    /**
     * Tests for nil "BIN" element
     */
    boolean isNilBIN();

    /**
     * True if has "BIN" element
     */
    boolean isSetBIN();

    /**
     * Sets the "BIN" element
     */
    void setBIN(String bin);

    /**
     * Sets (as xml) the "BIN" element
     */
    void xsetBIN(org.apache.xmlbeans.XmlString bin);

    /**
     * Nils the "BIN" element
     */
    void setNilBIN();

    /**
     * Unsets the "BIN" element
     */
    void unsetBIN();

    /**
     * Gets the "Brand" element
     */
    String getBrand();

    /**
     * Gets (as xml) the "Brand" element
     */
    org.apache.xmlbeans.XmlString xgetBrand();

    /**
     * Tests for nil "Brand" element
     */
    boolean isNilBrand();

    /**
     * True if has "Brand" element
     */
    boolean isSetBrand();

    /**
     * Sets the "Brand" element
     */
    void setBrand(String brand);

    /**
     * Sets (as xml) the "Brand" element
     */
    void xsetBrand(org.apache.xmlbeans.XmlString brand);

    /**
     * Nils the "Brand" element
     */
    void setNilBrand();

    /**
     * Unsets the "Brand" element
     */
    void unsetBrand();

    /**
     * Gets the "Country" element
     */
    String getCountry();

    /**
     * Gets (as xml) the "Country" element
     */
    org.apache.xmlbeans.XmlString xgetCountry();

    /**
     * Tests for nil "Country" element
     */
    boolean isNilCountry();

    /**
     * True if has "Country" element
     */
    boolean isSetCountry();

    /**
     * Sets the "Country" element
     */
    void setCountry(String country);

    /**
     * Sets (as xml) the "Country" element
     */
    void xsetCountry(org.apache.xmlbeans.XmlString country);

    /**
     * Nils the "Country" element
     */
    void setNilCountry();

    /**
     * Unsets the "Country" element
     */
    void unsetCountry();

    /**
     * Gets the "Issuer" element
     */
    String getIssuer();

    /**
     * Gets (as xml) the "Issuer" element
     */
    org.apache.xmlbeans.XmlString xgetIssuer();

    /**
     * Tests for nil "Issuer" element
     */
    boolean isNilIssuer();

    /**
     * True if has "Issuer" element
     */
    boolean isSetIssuer();

    /**
     * Sets the "Issuer" element
     */
    void setIssuer(String issuer);

    /**
     * Sets (as xml) the "Issuer" element
     */
    void xsetIssuer(org.apache.xmlbeans.XmlString issuer);

    /**
     * Nils the "Issuer" element
     */
    void setNilIssuer();

    /**
     * Unsets the "Issuer" element
     */
    void unsetIssuer();

    /**
     * Gets the "Subtype" element
     */
    String getSubtype();

    /**
     * Gets (as xml) the "Subtype" element
     */
    org.apache.xmlbeans.XmlString xgetSubtype();

    /**
     * Tests for nil "Subtype" element
     */
    boolean isNilSubtype();

    /**
     * True if has "Subtype" element
     */
    boolean isSetSubtype();

    /**
     * Sets the "Subtype" element
     */
    void setSubtype(String subtype);

    /**
     * Sets (as xml) the "Subtype" element
     */
    void xsetSubtype(org.apache.xmlbeans.XmlString subtype);

    /**
     * Nils the "Subtype" element
     */
    void setNilSubtype();

    /**
     * Unsets the "Subtype" element
     */
    void unsetSubtype();

    /**
     * Gets the "Type" element
     */
    String getType();

    /**
     * Gets (as xml) the "Type" element
     */
    org.apache.xmlbeans.XmlString xgetType();

    /**
     * Tests for nil "Type" element
     */
    boolean isNilType();

    /**
     * True if has "Type" element
     */
    boolean isSetType();

    /**
     * Sets the "Type" element
     */
    void setType(String type);

    /**
     * Sets (as xml) the "Type" element
     */
    void xsetType(org.apache.xmlbeans.XmlString type);

    /**
     * Nils the "Type" element
     */
    void setNilType();

    /**
     * Unsets the "Type" element
     */
    void unsetType();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static BinCheckResults newInstance() {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static BinCheckResults newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static BinCheckResults parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static BinCheckResults parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static BinCheckResults parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static BinCheckResults parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static BinCheckResults parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static BinCheckResults parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static BinCheckResults parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static BinCheckResults parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static BinCheckResults parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static BinCheckResults parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static BinCheckResults parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static BinCheckResults parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static BinCheckResults parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static BinCheckResults parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static BinCheckResults parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static BinCheckResults parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (BinCheckResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
