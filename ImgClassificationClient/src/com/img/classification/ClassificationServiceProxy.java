package com.img.classification;

public class ClassificationServiceProxy implements com.img.classification.ClassificationService {
  private String _endpoint = null;
  private com.img.classification.ClassificationService classificationService = null;
  
  public ClassificationServiceProxy() {
    _initClassificationServiceProxy();
  }
  
  public ClassificationServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initClassificationServiceProxy();
  }
  
  private void _initClassificationServiceProxy() {
    try {
      classificationService = (new com.img.classification.ClassificationServiceServiceLocator()).getClassificationService();
      if (classificationService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)classificationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)classificationService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (classificationService != null)
      ((javax.xml.rpc.Stub)classificationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.img.classification.ClassificationService getClassificationService() {
    if (classificationService == null)
      _initClassificationServiceProxy();
    return classificationService;
  }
  
  public java.lang.String animalType(java.lang.String animal) throws java.rmi.RemoteException{
    if (classificationService == null)
      _initClassificationServiceProxy();
    return classificationService.animalType(animal);
  }
  
  
}