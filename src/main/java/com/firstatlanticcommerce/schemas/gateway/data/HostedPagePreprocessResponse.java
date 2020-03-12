/*
 * XML Type:  HostedPagePreprocessResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessResponse
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data;


/**
 * An XML HostedPagePreprocessResponse(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public interface HostedPagePreprocessResponse extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HostedPagePreprocessResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9CAC302D2199EADE2090FC77680865A4").resolveHandle("hostedpagepreprocessresponse92d8type");
    
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
     * Gets the "ResponseCodeDescription" element
     */
    String getResponseCodeDescription();

    /**
     * Gets (as xml) the "ResponseCodeDescription" element
     */
    org.apache.xmlbeans.XmlString xgetResponseCodeDescription();

    /**
     * Tests for nil "ResponseCodeDescription" element
     */
    boolean isNilResponseCodeDescription();

    /**
     * True if has "ResponseCodeDescription" element
     */
    boolean isSetResponseCodeDescription();

    /**
     * Sets the "ResponseCodeDescription" element
     */
    void setResponseCodeDescription(String responseCodeDescription);

    /**
     * Sets (as xml) the "ResponseCodeDescription" element
     */
    void xsetResponseCodeDescription(org.apache.xmlbeans.XmlString responseCodeDescription);

    /**
     * Nils the "ResponseCodeDescription" element
     */
    void setNilResponseCodeDescription();

    /**
     * Unsets the "ResponseCodeDescription" element
     */
    void unsetResponseCodeDescription();

    /**
     * Gets the "SecurityToken" element
     */
    String getSecurityToken();

    /**
     * Gets (as xml) the "SecurityToken" element
     */
    org.apache.xmlbeans.XmlString xgetSecurityToken();

    /**
     * Tests for nil "SecurityToken" element
     */
    boolean isNilSecurityToken();

    /**
     * True if has "SecurityToken" element
     */
    boolean isSetSecurityToken();

    /**
     * Sets the "SecurityToken" element
     */
    void setSecurityToken(String securityToken);

    /**
     * Sets (as xml) the "SecurityToken" element
     */
    void xsetSecurityToken(org.apache.xmlbeans.XmlString securityToken);

    /**
     * Nils the "SecurityToken" element
     */
    void setNilSecurityToken();

    /**
     * Unsets the "SecurityToken" element
     */
    void unsetSecurityToken();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static HostedPagePreprocessResponse newInstance() {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static HostedPagePreprocessResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static HostedPagePreprocessResponse parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static HostedPagePreprocessResponse parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static HostedPagePreprocessResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static HostedPagePreprocessResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static HostedPagePreprocessResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static HostedPagePreprocessResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static HostedPagePreprocessResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static HostedPagePreprocessResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static HostedPagePreprocessResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static HostedPagePreprocessResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static HostedPagePreprocessResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static HostedPagePreprocessResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static HostedPagePreprocessResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static HostedPagePreprocessResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static HostedPagePreprocessResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static HostedPagePreprocessResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (HostedPagePreprocessResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
