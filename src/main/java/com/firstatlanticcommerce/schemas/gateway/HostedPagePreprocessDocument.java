/*
 * An XML document type.
 * Localname: HostedPagePreprocess
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway
 * Java type: com.firstatlanticcommerce.schemas.gateway.HostedPagePreprocessDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway;


import com.firstatlanticcommerce.schemas.gateway.data.HostedPagePreprocessRequest;

/**
 * A document containing one HostedPagePreprocess(@http://schemas.firstatlanticcommerce.com/gateway) element.
 *
 * This is a complex type.
 */
public interface HostedPagePreprocessDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HostedPagePreprocessDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9CAC302D2199EADE2090FC77680865A4").resolveHandle("hostedpagepreprocessd152doctype");
    
    /**
     * Gets the "HostedPagePreprocess" element
     */
    HostedPagePreprocessDocument.HostedPagePreprocess getHostedPagePreprocess();
    
    /**
     * Sets the "HostedPagePreprocess" element
     */
    void setHostedPagePreprocess(HostedPagePreprocessDocument.HostedPagePreprocess hostedPagePreprocess);
    
    /**
     * Appends and returns a new empty "HostedPagePreprocess" element
     */
    HostedPagePreprocessDocument.HostedPagePreprocess addNewHostedPagePreprocess();
    
    /**
     * An XML HostedPagePreprocess(@http://schemas.firstatlanticcommerce.com/gateway).
     *
     * This is a complex type.
     */
    public interface HostedPagePreprocess extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HostedPagePreprocess.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9CAC302D2199EADE2090FC77680865A4").resolveHandle("hostedpagepreprocess9690elemtype");
        
        /**
         * Gets the "Request" element
         */
        HostedPagePreprocessRequest getRequest();
        
        /**
         * Tests for nil "Request" element
         */
        boolean isNilRequest();
        
        /**
         * True if has "Request" element
         */
        boolean isSetRequest();
        
        /**
         * Sets the "Request" element
         */
        void setRequest(HostedPagePreprocessRequest request);
        
        /**
         * Appends and returns a new empty "Request" element
         */
        HostedPagePreprocessRequest addNewRequest();
        
        /**
         * Nils the "Request" element
         */
        void setNilRequest();
        
        /**
         * Unsets the "Request" element
         */
        void unsetRequest();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static HostedPagePreprocessDocument.HostedPagePreprocess newInstance() {
              return (HostedPagePreprocessDocument.HostedPagePreprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static HostedPagePreprocessDocument.HostedPagePreprocess newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (HostedPagePreprocessDocument.HostedPagePreprocess) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static HostedPagePreprocessDocument newInstance() {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static HostedPagePreprocessDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static HostedPagePreprocessDocument parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static HostedPagePreprocessDocument parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static HostedPagePreprocessDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static HostedPagePreprocessDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static HostedPagePreprocessDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static HostedPagePreprocessDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static HostedPagePreprocessDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static HostedPagePreprocessDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static HostedPagePreprocessDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static HostedPagePreprocessDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static HostedPagePreprocessDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static HostedPagePreprocessDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static HostedPagePreprocessDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static HostedPagePreprocessDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static HostedPagePreprocessDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static HostedPagePreprocessDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (HostedPagePreprocessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
