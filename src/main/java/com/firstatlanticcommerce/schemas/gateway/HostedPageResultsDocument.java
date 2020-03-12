/*
 * An XML document type.
 * Localname: HostedPageResults
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway
 * Java type: com.firstatlanticcommerce.schemas.gateway.HostedPageResultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway;


/**
 * A document containing one HostedPageResults(@http://schemas.firstatlanticcommerce.com/gateway) element.
 *
 * This is a complex type.
 */
public interface HostedPageResultsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HostedPageResultsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9CAC302D2199EADE2090FC77680865A4").resolveHandle("hostedpageresultsfb46doctype");
    
    /**
     * Gets the "HostedPageResults" element
     */
    HostedPageResultsDocument.HostedPageResults getHostedPageResults();
    
    /**
     * Sets the "HostedPageResults" element
     */
    void setHostedPageResults(HostedPageResultsDocument.HostedPageResults hostedPageResults);
    
    /**
     * Appends and returns a new empty "HostedPageResults" element
     */
    HostedPageResultsDocument.HostedPageResults addNewHostedPageResults();
    
    /**
     * An XML HostedPageResults(@http://schemas.firstatlanticcommerce.com/gateway).
     *
     * This is a complex type.
     */
    public interface HostedPageResults extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HostedPageResults.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9CAC302D2199EADE2090FC77680865A4").resolveHandle("hostedpageresultsa4daelemtype");
        
        /**
         * Gets the "key" element
         */
        String getKey();

        /**
         * Gets (as xml) the "key" element
         */
        org.apache.xmlbeans.XmlString xgetKey();

        /**
         * Tests for nil "key" element
         */
        boolean isNilKey();

        /**
         * True if has "key" element
         */
        boolean isSetKey();

        /**
         * Sets the "key" element
         */
        void setKey(String key);

        /**
         * Sets (as xml) the "key" element
         */
        void xsetKey(org.apache.xmlbeans.XmlString key);

        /**
         * Nils the "key" element
         */
        void setNilKey();

        /**
         * Unsets the "key" element
         */
        void unsetKey();

        /**
         * A factory class with static methods for creating instances
         * of this type.
         */

        public static final class Factory
        {
            public static HostedPageResultsDocument.HostedPageResults newInstance() {
              return (HostedPageResultsDocument.HostedPageResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

            public static HostedPageResultsDocument.HostedPageResults newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (HostedPageResultsDocument.HostedPageResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

            private Factory() { } // No instance of this class allowed
        }
    }

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static HostedPageResultsDocument newInstance() {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static HostedPageResultsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static HostedPageResultsDocument parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static HostedPageResultsDocument parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static HostedPageResultsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static HostedPageResultsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static HostedPageResultsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static HostedPageResultsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static HostedPageResultsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static HostedPageResultsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static HostedPageResultsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static HostedPageResultsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static HostedPageResultsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static HostedPageResultsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static HostedPageResultsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static HostedPageResultsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static HostedPageResultsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static HostedPageResultsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (HostedPageResultsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
