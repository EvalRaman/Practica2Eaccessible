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
  
  public webservice.Caracteristica[] caracteristiquesPerCodiLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.caracteristiquesPerCodiLocal(arg0);
  }
  
  public int codiLocalLliure() throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.codiLocalLliure();
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
  
  public webservice.Local[] localsPerTipoLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.localsPerTipoLocal(arg0);
  }
  
  public webservice.Local[] localsNoVerificats() throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.localsNoVerificats();
  }
  
  public void crearLocal(webservice.Local arg0, webservice.Accessibilitat[] arg1) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    webServiceLocal.crearLocal(arg0, arg1);
  }
  
  public void eliminarLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    webServiceLocal.eliminarLocal(arg0);
  }
  
  public webservice.Local localPerCodiLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.localPerCodiLocal(arg0);
  }
  
  public void verificarLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    webServiceLocal.verificarLocal(arg0);
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
  
  public webservice.CaracteristicaTipoLocal[] caracteristiquesTipoLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.caracteristiquesTipoLocal(arg0);
  }
  
  public webservice.Local[] localsPerNomLocal(java.lang.String arg0) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.localsPerNomLocal(arg0);
  }
  
  public webservice.Local[] localsPerNomLocalICodiTipoLocal(java.lang.String arg0, int arg1) throws java.rmi.RemoteException, webservice.ErrorException{
    if (webServiceLocal == null)
      _initWebServiceLocalProxy();
    return webServiceLocal.localsPerNomLocalICodiTipoLocal(arg0, arg1);
  }
  
  
}