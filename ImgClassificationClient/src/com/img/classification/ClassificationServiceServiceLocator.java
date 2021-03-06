/**
 * ClassificationServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.img.classification;

public class ClassificationServiceServiceLocator extends org.apache.axis.client.Service implements com.img.classification.ClassificationServiceService {

    public ClassificationServiceServiceLocator() {
    }


    public ClassificationServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClassificationServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ClassificationService
    private java.lang.String ClassificationService_address = "http://localhost:8080/ImgClassification/services/ClassificationService";

    public java.lang.String getClassificationServiceAddress() {
        return ClassificationService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClassificationServiceWSDDServiceName = "ClassificationService";

    public java.lang.String getClassificationServiceWSDDServiceName() {
        return ClassificationServiceWSDDServiceName;
    }

    public void setClassificationServiceWSDDServiceName(java.lang.String name) {
        ClassificationServiceWSDDServiceName = name;
    }

    public com.img.classification.ClassificationService getClassificationService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ClassificationService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClassificationService(endpoint);
    }

    public com.img.classification.ClassificationService getClassificationService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.img.classification.ClassificationServiceSoapBindingStub _stub = new com.img.classification.ClassificationServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getClassificationServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClassificationServiceEndpointAddress(java.lang.String address) {
        ClassificationService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.img.classification.ClassificationService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.img.classification.ClassificationServiceSoapBindingStub _stub = new com.img.classification.ClassificationServiceSoapBindingStub(new java.net.URL(ClassificationService_address), this);
                _stub.setPortName(getClassificationServiceWSDDServiceName());
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
        if ("ClassificationService".equals(inputPortName)) {
            return getClassificationService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://classification.img.com", "ClassificationServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://classification.img.com", "ClassificationService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ClassificationService".equals(portName)) {
            setClassificationServiceEndpointAddress(address);
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
