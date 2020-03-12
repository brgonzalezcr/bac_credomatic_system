/*
 * XML Type:  ThreeDSecureDetails
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.ThreeDSecureDetails
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data;


/**
 * An XML ThreeDSecureDetails(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public interface ThreeDSecureDetails extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ThreeDSecureDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9CAC302D2199EADE2090FC77680865A4").resolveHandle("threedsecuredetails4bc8type");
    
    /**
     * Gets the "AuthenticationResult" element
     */
    String getAuthenticationResult();

    /**
     * Gets (as xml) the "AuthenticationResult" element
     */
    org.apache.xmlbeans.XmlString xgetAuthenticationResult();

    /**
     * Tests for nil "AuthenticationResult" element
     */
    boolean isNilAuthenticationResult();

    /**
     * True if has "AuthenticationResult" element
     */
    boolean isSetAuthenticationResult();

    /**
     * Sets the "AuthenticationResult" element
     */
    void setAuthenticationResult(String authenticationResult);

    /**
     * Sets (as xml) the "AuthenticationResult" element
     */
    void xsetAuthenticationResult(org.apache.xmlbeans.XmlString authenticationResult);

    /**
     * Nils the "AuthenticationResult" element
     */
    void setNilAuthenticationResult();

    /**
     * Unsets the "AuthenticationResult" element
     */
    void unsetAuthenticationResult();

    /**
     * Gets the "CAVV" element
     */
    String getCAVV();

    /**
     * Gets (as xml) the "CAVV" element
     */
    org.apache.xmlbeans.XmlString xgetCAVV();

    /**
     * Tests for nil "CAVV" element
     */
    boolean isNilCAVV();

    /**
     * True if has "CAVV" element
     */
    boolean isSetCAVV();

    /**
     * Sets the "CAVV" element
     */
    void setCAVV(String cavv);

    /**
     * Sets (as xml) the "CAVV" element
     */
    void xsetCAVV(org.apache.xmlbeans.XmlString cavv);

    /**
     * Nils the "CAVV" element
     */
    void setNilCAVV();

    /**
     * Unsets the "CAVV" element
     */
    void unsetCAVV();

    /**
     * Gets the "ECIIndicator" element
     */
    String getECIIndicator();

    /**
     * Gets (as xml) the "ECIIndicator" element
     */
    org.apache.xmlbeans.XmlString xgetECIIndicator();

    /**
     * Tests for nil "ECIIndicator" element
     */
    boolean isNilECIIndicator();

    /**
     * True if has "ECIIndicator" element
     */
    boolean isSetECIIndicator();

    /**
     * Sets the "ECIIndicator" element
     */
    void setECIIndicator(String eciIndicator);

    /**
     * Sets (as xml) the "ECIIndicator" element
     */
    void xsetECIIndicator(org.apache.xmlbeans.XmlString eciIndicator);

    /**
     * Nils the "ECIIndicator" element
     */
    void setNilECIIndicator();

    /**
     * Unsets the "ECIIndicator" element
     */
    void unsetECIIndicator();

    /**
     * Gets the "TransactionStain" element
     */
    String getTransactionStain();

    /**
     * Gets (as xml) the "TransactionStain" element
     */
    org.apache.xmlbeans.XmlString xgetTransactionStain();

    /**
     * Tests for nil "TransactionStain" element
     */
    boolean isNilTransactionStain();

    /**
     * True if has "TransactionStain" element
     */
    boolean isSetTransactionStain();

    /**
     * Sets the "TransactionStain" element
     */
    void setTransactionStain(String transactionStain);

    /**
     * Sets (as xml) the "TransactionStain" element
     */
    void xsetTransactionStain(org.apache.xmlbeans.XmlString transactionStain);

    /**
     * Nils the "TransactionStain" element
     */
    void setNilTransactionStain();

    /**
     * Unsets the "TransactionStain" element
     */
    void unsetTransactionStain();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static ThreeDSecureDetails newInstance() {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static ThreeDSecureDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static ThreeDSecureDetails parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static ThreeDSecureDetails parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ThreeDSecureDetails parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ThreeDSecureDetails parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ThreeDSecureDetails parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ThreeDSecureDetails parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ThreeDSecureDetails parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ThreeDSecureDetails parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ThreeDSecureDetails parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ThreeDSecureDetails parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ThreeDSecureDetails parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ThreeDSecureDetails parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ThreeDSecureDetails parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ThreeDSecureDetails parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ThreeDSecureDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ThreeDSecureDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ThreeDSecureDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
