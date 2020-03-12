/*
 * XML Type:  HostedPageResultsResponse
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.HostedPageResultsResponse
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data;


/**
 * An XML HostedPageResultsResponse(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public interface HostedPageResultsResponse extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HostedPageResultsResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9CAC302D2199EADE2090FC77680865A4").resolveHandle("hostedpageresultsresponseaf84type");
    
    /**
     * Gets the "AuthResponse" element
     */
    AuthorizeResponse getAuthResponse();
    
    /**
     * Tests for nil "AuthResponse" element
     */
    boolean isNilAuthResponse();
    
    /**
     * True if has "AuthResponse" element
     */
    boolean isSetAuthResponse();
    
    /**
     * Sets the "AuthResponse" element
     */
    void setAuthResponse(AuthorizeResponse authResponse);
    
    /**
     * Appends and returns a new empty "AuthResponse" element
     */
    AuthorizeResponse addNewAuthResponse();
    
    /**
     * Nils the "AuthResponse" element
     */
    void setNilAuthResponse();
    
    /**
     * Unsets the "AuthResponse" element
     */
    void unsetAuthResponse();
    
    /**
     * Gets the "ThreeDSResponse" element
     */
    ThreeDSecureDetails getThreeDSResponse();
    
    /**
     * Tests for nil "ThreeDSResponse" element
     */
    boolean isNilThreeDSResponse();
    
    /**
     * True if has "ThreeDSResponse" element
     */
    boolean isSetThreeDSResponse();
    
    /**
     * Sets the "ThreeDSResponse" element
     */
    void setThreeDSResponse(ThreeDSecureDetails threeDSResponse);
    
    /**
     * Appends and returns a new empty "ThreeDSResponse" element
     */
    ThreeDSecureDetails addNewThreeDSResponse();
    
    /**
     * Nils the "ThreeDSResponse" element
     */
    void setNilThreeDSResponse();
    
    /**
     * Unsets the "ThreeDSResponse" element
     */
    void unsetThreeDSResponse();
    
    /**
     * Gets the "PurchaseAmount" element
     */
    String getPurchaseAmount();

    /**
     * Gets (as xml) the "PurchaseAmount" element
     */
    org.apache.xmlbeans.XmlString xgetPurchaseAmount();

    /**
     * Tests for nil "PurchaseAmount" element
     */
    boolean isNilPurchaseAmount();

    /**
     * True if has "PurchaseAmount" element
     */
    boolean isSetPurchaseAmount();

    /**
     * Sets the "PurchaseAmount" element
     */
    void setPurchaseAmount(String purchaseAmount);

    /**
     * Sets (as xml) the "PurchaseAmount" element
     */
    void xsetPurchaseAmount(org.apache.xmlbeans.XmlString purchaseAmount);

    /**
     * Nils the "PurchaseAmount" element
     */
    void setNilPurchaseAmount();

    /**
     * Unsets the "PurchaseAmount" element
     */
    void unsetPurchaseAmount();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static HostedPageResultsResponse newInstance() {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static HostedPageResultsResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static HostedPageResultsResponse parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static HostedPageResultsResponse parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static HostedPageResultsResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static HostedPageResultsResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static HostedPageResultsResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static HostedPageResultsResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static HostedPageResultsResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static HostedPageResultsResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static HostedPageResultsResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static HostedPageResultsResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static HostedPageResultsResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static HostedPageResultsResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static HostedPageResultsResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static HostedPageResultsResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static HostedPageResultsResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static HostedPageResultsResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (HostedPageResultsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
