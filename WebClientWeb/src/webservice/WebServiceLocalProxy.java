package webservice;

public class WebServiceLocalProxy implements webservice.WebServiceLocal {
  private String _endpoint = null;
  private webservice.WebServiceLocal webServiceLocal = null;
  
  public WebServiceLocalProxy() {
    _initWebServiceLocalProxy();
  }
  
  public WebServiceLocalProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServiceLocalProxy();
  }
  
  private void _initWebServiceLocalProxy() {
    try {
      webServiceLocal = (new webservice.WebServiceLocalServiceLocator()).getWebServiceLocalPort();
      if (webServiceLocal != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServiceLocal)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServiceLocal)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServiceLocal != null)
      ((javax.xml.rpc.Stub)webServiceLocal)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservice.WebServiceLocal getWebServiceLocal() {
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal;
  }
  
  public int codiLocalLliure() throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.codiLocalLliure();
  }
  
  public webservice.CaracteristicaTipoLocal[] infoCaracteristicaTipoLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.infoCaracteristicaTipoLocal(arg0);
  }
  
  public webservice.Local[] localsAccessibles(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.localsAccessibles(arg0);
  }
  
  public webservice.Caracteristica infoCaracteristica(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.infoCaracteristica(arg0);
  }
  
  public void validaLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    webServiceLocal.validaLocal(arg0);
  }
  
  public webservice.Local[] infoLocalPerNomLocal(java.lang.String arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.infoLocalPerNomLocal(arg0);
  }
  
  public webservice.Local[] localnoVerificat() throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.localnoVerificat();
  }
  
  public void altaLocal(webservice.Local arg0, webservice.Accessibilitat[] arg1) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    webServiceLocal.altaLocal(arg0, arg1);
  }
  
  public webservice.Local[] infoLocalPerNomLocalICodiTipoLocal(java.lang.String arg0, int arg1) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.infoLocalPerNomLocalICodiTipoLocal(arg0, arg1);
  }
  
  public webservice.Local[] infoLocalPerTipoLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.infoLocalPerTipoLocal(arg0);
  }
  
  public void baixaLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    webServiceLocal.baixaLocal(arg0);
  }
  
  public webservice.Caracteristica[] infoCaracteristicaLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.infoCaracteristicaLocal(arg0);
  }
  
  public int codiAccessibilitatLliure() throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.codiAccessibilitatLliure();
  }
  
  public webservice.TipoLocal[] cercaTipoLocal() throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.cercaTipoLocal();
  }
  
  public webservice.Local infoLocalPerCodiLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.infoLocalPerCodiLocal(arg0);
  }
  
  
}