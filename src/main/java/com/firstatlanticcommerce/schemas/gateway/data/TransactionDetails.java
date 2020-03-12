/*
 * XML Type:  TransactionDetails
 * Namespace: http://schemas.firstatlanticcommerce.com/gateway/data
 * Java type: com.firstatlanticcommerce.schemas.gateway.data.TransactionDetails
 *
 * Automatically generated - do not modify.
 */
package com.firstatlanticcommerce.schemas.gateway.data;


/**
 * An XML TransactionDetails(@http://schemas.firstatlanticcommerce.com/gateway/data).
 *
 * This is a complex type.
 */
public interface TransactionDetails extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransactionDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9CAC302D2199EADE2090FC77680865A4").resolveHandle("transactiondetails7ff9type");
    
    /**
     * Gets the "AcquirerId" element
     */
    String getAcquirerId();

    /**
     * Gets (as xml) the "AcquirerId" element
     */
    org.apache.xmlbeans.XmlString xgetAcquirerId();

    /**
     * Tests for nil "AcquirerId" element
     */
    boolean isNilAcquirerId();

    /**
     * Sets the "AcquirerId" element
     */
    void setAcquirerId(String acquirerId);

    /**
     * Sets (as xml) the "AcquirerId" element
     */
    void xsetAcquirerId(org.apache.xmlbeans.XmlString acquirerId);

    /**
     * Nils the "AcquirerId" element
     */
    void setNilAcquirerId();

    /**
     * Gets the "Amount" element
     */
    String getAmount();

    /**
     * Gets (as xml) the "Amount" element
     */
    org.apache.xmlbeans.XmlString xgetAmount();

    /**
     * Tests for nil "Amount" element
     */
    boolean isNilAmount();

    /**
     * Sets the "Amount" element
     */
    void setAmount(String amount);

    /**
     * Sets (as xml) the "Amount" element
     */
    void xsetAmount(org.apache.xmlbeans.XmlString amount);

    /**
     * Nils the "Amount" element
     */
    void setNilAmount();

    /**
     * Gets the "Currency" element
     */
    String getCurrency();

    /**
     * Gets (as xml) the "Currency" element
     */
    org.apache.xmlbeans.XmlString xgetCurrency();

    /**
     * Tests for nil "Currency" element
     */
    boolean isNilCurrency();

    /**
     * Sets the "Currency" element
     */
    void setCurrency(String currency);

    /**
     * Sets (as xml) the "Currency" element
     */
    void xsetCurrency(org.apache.xmlbeans.XmlString currency);

    /**
     * Nils the "Currency" element
     */
    void setNilCurrency();

    /**
     * Gets the "CurrencyExponent" element
     */
    int getCurrencyExponent();

    /**
     * Gets (as xml) the "CurrencyExponent" element
     */
    org.apache.xmlbeans.XmlInt xgetCurrencyExponent();

    /**
     * Sets the "CurrencyExponent" element
     */
    void setCurrencyExponent(int currencyExponent);

    /**
     * Sets (as xml) the "CurrencyExponent" element
     */
    void xsetCurrencyExponent(org.apache.xmlbeans.XmlInt currencyExponent);

    /**
     * Gets the "CustomData" element
     */
    String getCustomData();

    /**
     * Gets (as xml) the "CustomData" element
     */
    org.apache.xmlbeans.XmlString xgetCustomData();

    /**
     * Tests for nil "CustomData" element
     */
    boolean isNilCustomData();

    /**
     * True if has "CustomData" element
     */
    boolean isSetCustomData();

    /**
     * Sets the "CustomData" element
     */
    void setCustomData(String customData);

    /**
     * Sets (as xml) the "CustomData" element
     */
    void xsetCustomData(org.apache.xmlbeans.XmlString customData);

    /**
     * Nils the "CustomData" element
     */
    void setNilCustomData();

    /**
     * Unsets the "CustomData" element
     */
    void unsetCustomData();

    /**
     * Gets the "IPAddress" element
     */
    String getIPAddress();

    /**
     * Gets (as xml) the "IPAddress" element
     */
    org.apache.xmlbeans.XmlString xgetIPAddress();

    /**
     * Tests for nil "IPAddress" element
     */
    boolean isNilIPAddress();

    /**
     * True if has "IPAddress" element
     */
    boolean isSetIPAddress();

    /**
     * Sets the "IPAddress" element
     */
    void setIPAddress(String ipAddress);

    /**
     * Sets (as xml) the "IPAddress" element
     */
    void xsetIPAddress(org.apache.xmlbeans.XmlString ipAddress);

    /**
     * Nils the "IPAddress" element
     */
    void setNilIPAddress();

    /**
     * Unsets the "IPAddress" element
     */
    void unsetIPAddress();

    /**
     * Gets the "MerchantId" element
     */
    String getMerchantId();

    /**
     * Gets (as xml) the "MerchantId" element
     */
    org.apache.xmlbeans.XmlString xgetMerchantId();

    /**
     * Tests for nil "MerchantId" element
     */
    boolean isNilMerchantId();

    /**
     * Sets the "MerchantId" element
     */
    void setMerchantId(String merchantId);

    /**
     * Sets (as xml) the "MerchantId" element
     */
    void xsetMerchantId(org.apache.xmlbeans.XmlString merchantId);

    /**
     * Nils the "MerchantId" element
     */
    void setNilMerchantId();

    /**
     * Gets the "OrderNumber" element
     */
    String getOrderNumber();

    /**
     * Gets (as xml) the "OrderNumber" element
     */
    org.apache.xmlbeans.XmlString xgetOrderNumber();

    /**
     * Tests for nil "OrderNumber" element
     */
    boolean isNilOrderNumber();

    /**
     * Sets the "OrderNumber" element
     */
    void setOrderNumber(String orderNumber);

    /**
     * Sets (as xml) the "OrderNumber" element
     */
    void xsetOrderNumber(org.apache.xmlbeans.XmlString orderNumber);

    /**
     * Nils the "OrderNumber" element
     */
    void setNilOrderNumber();

    /**
     * Gets the "Signature" element
     */
    String getSignature();

    /**
     * Gets (as xml) the "Signature" element
     */
    org.apache.xmlbeans.XmlString xgetSignature();

    /**
     * Tests for nil "Signature" element
     */
    boolean isNilSignature();

    /**
     * Sets the "Signature" element
     */
    void setSignature(String signature);

    /**
     * Sets (as xml) the "Signature" element
     */
    void xsetSignature(org.apache.xmlbeans.XmlString signature);

    /**
     * Nils the "Signature" element
     */
    void setNilSignature();

    /**
     * Gets the "SignatureMethod" element
     */
    String getSignatureMethod();

    /**
     * Gets (as xml) the "SignatureMethod" element
     */
    org.apache.xmlbeans.XmlString xgetSignatureMethod();

    /**
     * Tests for nil "SignatureMethod" element
     */
    boolean isNilSignatureMethod();

    /**
     * Sets the "SignatureMethod" element
     */
    void setSignatureMethod(String signatureMethod);

    /**
     * Sets (as xml) the "SignatureMethod" element
     */
    void xsetSignatureMethod(org.apache.xmlbeans.XmlString signatureMethod);

    /**
     * Nils the "SignatureMethod" element
     */
    void setNilSignatureMethod();

    /**
     * Gets the "TransactionCode" element
     */
    int getTransactionCode();

    /**
     * Gets (as xml) the "TransactionCode" element
     */
    org.apache.xmlbeans.XmlInt xgetTransactionCode();

    /**
     * Sets the "TransactionCode" element
     */
    void setTransactionCode(int transactionCode);

    /**
     * Sets (as xml) the "TransactionCode" element
     */
    void xsetTransactionCode(org.apache.xmlbeans.XmlInt transactionCode);

    /**
     * Gets the "CustomerReference" element
     */
    String getCustomerReference();

    /**
     * Gets (as xml) the "CustomerReference" element
     */
    org.apache.xmlbeans.XmlString xgetCustomerReference();

    /**
     * Tests for nil "CustomerReference" element
     */
    boolean isNilCustomerReference();

    /**
     * True if has "CustomerReference" element
     */
    boolean isSetCustomerReference();

    /**
     * Sets the "CustomerReference" element
     */
    void setCustomerReference(String customerReference);

    /**
     * Sets (as xml) the "CustomerReference" element
     */
    void xsetCustomerReference(org.apache.xmlbeans.XmlString customerReference);

    /**
     * Nils the "CustomerReference" element
     */
    void setNilCustomerReference();

    /**
     * Unsets the "CustomerReference" element
     */
    void unsetCustomerReference();

    /**
     * A factory class with static methods for creating instances
     * of this type.
     */

    public static final class Factory
    {
        public static TransactionDetails newInstance() {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }

        public static TransactionDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }

        /** @param xmlAsString the string value to parse */
        public static TransactionDetails parse(String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }

        public static TransactionDetails parse(String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static TransactionDetails parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static TransactionDetails parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static TransactionDetails parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static TransactionDetails parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static TransactionDetails parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static TransactionDetails parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static TransactionDetails parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static TransactionDetails parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static TransactionDetails parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static TransactionDetails parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static TransactionDetails parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static TransactionDetails parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static TransactionDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static TransactionDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (TransactionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
