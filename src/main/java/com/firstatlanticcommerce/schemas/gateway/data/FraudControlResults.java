/*
 * XML Type:  FraudControlResults
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.FraudControlResults
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data;


/**
 * An XML FraudControlResults(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public interface FraudControlResults extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FraudControlResults.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9CAC302D2199EADE2090FC77680865A4").resolveHandle("fraudcontrolresults8b20type");
    
    /**
     * Gets the "FraudControlId" element
     */
    String getFraudControlId();

    /**
     * Gets (as xml) the "FraudControlId" element
     */
    org.apache.xmlbeans.XmlString xgetFraudControlId();

    /**
     * Tests for nil "FraudControlId" element
     */
    boolean isNilFraudControlId();

    /**
     * True if has "FraudControlId" element
     */
    boolean isSetFraudControlId();

    /**
     * Sets the "FraudControlId" element
     */
    void setFraudControlId(String fraudControlId);

    /**
     * Sets (as xml) the "FraudControlId" element
     */
    void xsetFraudControlId(org.apache.xmlbeans.XmlString fraudControlId);

    /**
     * Nils the "FraudControlId" element
     */
    void setNilFraudControlId();

    /**
     * Unsets the "FraudControlId" element
     */
    void unsetFraudControlId();

    /**
     * Gets the "FraudResponseCode" element
     */
    String getFraudResponseCode();

    /**
     * Gets (as xml) the "FraudResponseCode" element
     */
    org.apache.xmlbeans.XmlString xgetFraudResponseCode();

    /**
     * Tests for nil "FraudResponseCode" element
     */
    boolean isNilFraudResponseCode();

    /**
     * True if has "FraudResponseCode" element
     */
    boolean isSetFraudResponseCode();

    /**
     * Sets the "FraudResponseCode" element
     */
    void setFraudResponseCode(String fraudResponseCode);

    /**
     * Sets (as xml) the "FraudResponseCode" element
     */
    void xsetFraudResponseCode(org.apache.xmlbeans.XmlString fraudResponseCode);

    /**
     * Nils the "FraudResponseCode" element
     */
    void setNilFraudResponseCode();

    /**
     * Unsets the "FraudResponseCode" element
     */
    void unsetFraudResponseCode();

    /**
     * Gets the "ReasonCode" element
     */
    String getReasonCode();

    /**
     * Gets (as xml) the "ReasonCode" element
     */
    org.apache.xmlbeans.XmlString xgetReasonCode();

    /**
     * Tests for nil "ReasonCode" element
     */
    boolean isNilReasonCode();

    /**
     * True if has "ReasonCode" element
     */
    boolean isSetReasonCode();

    /**
     * Sets the "ReasonCode" element
     */
    void setReasonCode(String reasonCode);

    /**
     * Sets (as xml) the "ReasonCode" element
     */
    void xsetReasonCode(org.apache.xmlbeans.XmlString reasonCode);

    /**
     * Nils the "ReasonCode" element
     */
    void setNilReasonCode();

    /**
     * Unsets the "ReasonCode" element
     */
    void unsetReasonCode();

    /**
     * Gets the "ReasonCodeDesc" element
     */
    String getReasonCodeDesc();

    /**
     * Gets (as xml) the "ReasonCodeDesc" element
     */
    org.apache.xmlbeans.XmlString xgetReasonCodeDesc();

    /**
     * Tests for nil "ReasonCodeDesc" element
     */
    boolean isNilReasonCodeDesc();

    /**
     * True if has "ReasonCodeDesc" element
     */
    boolean isSetReasonCodeDesc();

    /**
     * Sets the "ReasonCodeDesc" element
     */
    void setReasonCodeDesc(String reasonCodeDesc);

    /**
     * Sets (as xml) the "ReasonCodeDesc" element
     */
    void xsetReasonCodeDesc(org.apache.xmlbeans.XmlString reasonCodeDesc);

    /**
     * Nils the "ReasonCodeDesc" element
     */
    void setNilReasonCodeDesc();

    /**
     * Unsets the "ReasonCodeDesc" element
     */
    void unsetReasonCodeDesc();

    /**
     * Gets the "ResponseCode" element
     */
    String getResponseCode();

    /**
     * Gets (as xml) the "ResponseCode" element
     */
    org.apache.xmlbeans.XmlString xgetResponseCode();

    /**
     * Tests for nil "ResponseCode" element
     */
    boolean isNilResponseCode();

    /**
     * True if has "ResponseCode" element
     */
    boolean isSetResponseCode();

    /**
     * Sets the "ResponseCode" element
     */
    void setResponseCode(String responseCode);

    /**
     * Sets (as xml) the "ResponseCode" element
     */
    void xsetResponseCode(org.apache.xmlbeans.XmlString responseCode);

    /**
     * Nils the "ResponseCode" element
     */
    void setNilResponseCode();

    /**
     * Unsets the "ResponseCode" element
     */
    void unsetResponseCode();

    /**
     * Gets the "Score" element
     */
    String getScore();

    /**
     * Gets (as xml) the "Score" element
     */
    org.apache.xmlbeans.XmlString xgetScore();

    /**
     * Tests for nil "Score" element
     */
    boolean isNilScore();

    /**
     * True if has "Score" element
     */
    boolean isSetScore();

    /**
     * Sets the "Score" element
     */
    void setScore(String score);

    /**
     * Sets (as xml) the "Score" element
     */
    void xsetScore(org.apache.xmlbeans.XmlString score);

    /**
     * Nils the "Score" element
     */
    void setNilScore();

    /**
     * Unsets the "Score" element
     */
    void unsetScore();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static FraudControlResults newInstance() {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static FraudControlResults newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static FraudControlResults parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static FraudControlResults parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static FraudControlResults parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static FraudControlResults parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static FraudControlResults parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static FraudControlResults parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static FraudControlResults parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static FraudControlResults parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static FraudControlResults parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static FraudControlResults parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static FraudControlResults parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static FraudControlResults parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static FraudControlResults parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static FraudControlResults parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static FraudControlResults parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static FraudControlResults parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (FraudControlResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
