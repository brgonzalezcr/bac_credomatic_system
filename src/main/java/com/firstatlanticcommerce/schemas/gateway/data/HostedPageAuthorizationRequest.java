/*
 * XML Type:  HostedPageAuthorizationRequest
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.HostedPageAuthorizationRequest
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data;


/**
 * An XML HostedPageAuthorizationRequest(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public interface HostedPageAuthorizationRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HostedPageAuthorizationRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9CAC302D2199EADE2090FC77680865A4").resolveHandle("hostedpageauthorizationrequest2b61type");
    
    /**
     * Gets the "CardHolderResponseURL" element
     */
    String getCardHolderResponseURL();

    /**
     * Gets (as xml) the "CardHolderResponseURL" element
     */
    org.apache.xmlbeans.XmlString xgetCardHolderResponseURL();

    /**
     * Tests for nil "CardHolderResponseURL" element
     */
    boolean isNilCardHolderResponseURL();

    /**
     * True if has "CardHolderResponseURL" element
     */
    boolean isSetCardHolderResponseURL();

    /**
     * Sets the "CardHolderResponseURL" element
     */
    void setCardHolderResponseURL(String cardHolderResponseURL);

    /**
     * Sets (as xml) the "CardHolderResponseURL" element
     */
    void xsetCardHolderResponseURL(org.apache.xmlbeans.XmlString cardHolderResponseURL);

    /**
     * Nils the "CardHolderResponseURL" element
     */
    void setNilCardHolderResponseURL();

    /**
     * Unsets the "CardHolderResponseURL" element
     */
    void unsetCardHolderResponseURL();

    /**
     * Gets the "MerRespURL" element
     */
    String getMerRespURL();

    /**
     * Gets (as xml) the "MerRespURL" element
     */
    org.apache.xmlbeans.XmlString xgetMerRespURL();

    /**
     * Tests for nil "MerRespURL" element
     */
    boolean isNilMerRespURL();

    /**
     * True if has "MerRespURL" element
     */
    boolean isSetMerRespURL();

    /**
     * Sets the "MerRespURL" element
     */
    void setMerRespURL(String merRespURL);

    /**
     * Sets (as xml) the "MerRespURL" element
     */
    void xsetMerRespURL(org.apache.xmlbeans.XmlString merRespURL);

    /**
     * Nils the "MerRespURL" element
     */
    void setNilMerRespURL();

    /**
     * Unsets the "MerRespURL" element
     */
    void unsetMerRespURL();

    /**
     * Gets the "RecurringDetails" element
     */
    RecurringDetails getRecurringDetails();

    /**
     * Tests for nil "RecurringDetails" element
     */
    boolean isNilRecurringDetails();

    /**
     * True if has "RecurringDetails" element
     */
    boolean isSetRecurringDetails();

    /**
     * Sets the "RecurringDetails" element
     */
    void setRecurringDetails(RecurringDetails recurringDetails);

    /**
     * Appends and returns a new empty "RecurringDetails" element
     */
    RecurringDetails addNewRecurringDetails();

    /**
     * Nils the "RecurringDetails" element
     */
    void setNilRecurringDetails();

    /**
     * Unsets the "RecurringDetails" element
     */
    void unsetRecurringDetails();

    /**
     * Gets the "ThreeDSecureDetails" element
     */
    ThreeDSecureDetails getThreeDSecureDetails();

    /**
     * Tests for nil "ThreeDSecureDetails" element
     */
    boolean isNilThreeDSecureDetails();

    /**
     * True if has "ThreeDSecureDetails" element
     */
    boolean isSetThreeDSecureDetails();

    /**
     * Sets the "ThreeDSecureDetails" element
     */
    void setThreeDSecureDetails(ThreeDSecureDetails threeDSecureDetails);

    /**
     * Appends and returns a new empty "ThreeDSecureDetails" element
     */
    ThreeDSecureDetails addNewThreeDSecureDetails();

    /**
     * Nils the "ThreeDSecureDetails" element
     */
    void setNilThreeDSecureDetails();

    /**
     * Unsets the "ThreeDSecureDetails" element
     */
    void unsetThreeDSecureDetails();

    /**
     * Gets the "TransactionDetails" element
     */
    TransactionDetails getTransactionDetails();

    /**
     * Tests for nil "TransactionDetails" element
     */
    boolean isNilTransactionDetails();

    /**
     * True if has "TransactionDetails" element
     */
    boolean isSetTransactionDetails();

    /**
     * Sets the "TransactionDetails" element
     */
    void setTransactionDetails(TransactionDetails transactionDetails);

    /**
     * Appends and returns a new empty "TransactionDetails" element
     */
    TransactionDetails addNewTransactionDetails();

    /**
     * Nils the "TransactionDetails" element
     */
    void setNilTransactionDetails();

    /**
     * Unsets the "TransactionDetails" element
     */
    void unsetTransactionDetails();

    /**
     * Gets the "SessionID" element
     */
    String getSessionID();

    /**
     * Gets (as xml) the "SessionID" element
     */
    org.apache.xmlbeans.XmlString xgetSessionID();

    /**
     * Tests for nil "SessionID" element
     */
    boolean isNilSessionID();

    /**
     * True if has "SessionID" element
     */
    boolean isSetSessionID();

    /**
     * Sets the "SessionID" element
     */
    void setSessionID(String sessionID);

    /**
     * Sets (as xml) the "SessionID" element
     */
    void xsetSessionID(org.apache.xmlbeans.XmlString sessionID);

    /**
     * Nils the "SessionID" element
     */
    void setNilSessionID();

    /**
     * Unsets the "SessionID" element
     */
    void unsetSessionID();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static HostedPageAuthorizationRequest newInstance() {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static HostedPageAuthorizationRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static HostedPageAuthorizationRequest parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static HostedPageAuthorizationRequest parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static HostedPageAuthorizationRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static HostedPageAuthorizationRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static HostedPageAuthorizationRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static HostedPageAuthorizationRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static HostedPageAuthorizationRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static HostedPageAuthorizationRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static HostedPageAuthorizationRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static HostedPageAuthorizationRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static HostedPageAuthorizationRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static HostedPageAuthorizationRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static HostedPageAuthorizationRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static HostedPageAuthorizationRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static HostedPageAuthorizationRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static HostedPageAuthorizationRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (HostedPageAuthorizationRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
