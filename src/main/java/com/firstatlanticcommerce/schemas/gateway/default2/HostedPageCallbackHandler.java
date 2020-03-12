/**
 * HostedPageCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.firstatlanticcommerce.schemas.gateway.default2;


/**
 *  HostedPageCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class HostedPageCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public HostedPageCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public HostedPageCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for hostedPagePreprocess method
     * override this method for handling normal response from hostedPagePreprocess operation
     */
    public void receiveResulthostedPagePreprocess(
        com.firstatlanticcommerce.schemas.gateway.HostedPagePreprocessResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from hostedPagePreprocess operation
     */
    public void receiveErrorhostedPagePreprocess(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for hostedPageAuthorize method
     * override this method for handling normal response from hostedPageAuthorize operation
     */
    public void receiveResulthostedPageAuthorize(
        com.firstatlanticcommerce.schemas.gateway.HostedPageAuthorizeResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from hostedPageAuthorize operation
     */
    public void receiveErrorhostedPageAuthorize(Exception e) {
    }

    /**
     * auto generated Axis2 call back method for hostedPageResults method
     * override this method for handling normal response from hostedPageResults operation
     */
    public void receiveResulthostedPageResults(
        com.firstatlanticcommerce.schemas.gateway.HostedPageResultsResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from hostedPageResults operation
     */
    public void receiveErrorhostedPageResults(Exception e) {
    }
}
