/**
 * WebServiceLocalServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public class WebServiceLocalServiceLocator extends org.apache.axis.client.Service implements webservice.WebServiceLocalService {

    public WebServiceLocalServiceLocator() {
    }


    public WebServiceLocalServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServiceLocalServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServiceLocalPort
    private java.lang.String WebServiceLocalPort_address = "http://localhost:8080/WebServerWeb/WebServiceLocal";

    public java.lang.String getWebServiceLocalPortAddress() {
        return WebServiceLocalPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServiceLocalPortWSDDServiceName = "WebServiceLocalPort";

    public java.lang.String getWebServiceLocalPortWSDDServiceName() {
        return WebServiceLocalPortWSDDServiceName;
    }

    public void setWebServiceLocalPortWSDDServiceName(java.lang.String name) {
        WebServiceLocalPortWSDDServiceName = name;
    }

    public webservice.WebServiceLocal getWebServiceLocalPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServiceLocalPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServiceLocalPort(endpoint);
    }

    public webservice.WebServiceLocal getWebServiceLocalPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservice.WebServiceLocalServiceSoapBindingStub _stub = new webservice.WebServiceLocalServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWebServiceLocalPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServiceLocalPortEndpointAddress(java.lang.String address) {
        WebServiceLocalPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservice.WebServiceLocal.class.isAssignableFrom(serviceEndpointInterface)) {
                webservice.WebServiceLocalServiceSoapBindingStub _stub = new webservice.WebServiceLocalServiceSoapBindingStub(new java.net.URL(WebServiceLocalPort_address), this);
                _stub.setPortName(getWebServiceLocalPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebServiceLocalPort".equals(inputPortName)) {
            return getWebServiceLocalPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice/", "WebServiceLocalService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice/", "WebServiceLocalPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServiceLocalPort".equals(portName)) {
            setWebServiceLocalPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
