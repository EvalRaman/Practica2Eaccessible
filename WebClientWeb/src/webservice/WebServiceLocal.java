/**
 * WebServiceLocal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface WebServiceLocal extends java.rmi.Remote {
    public int codiLocalLliure() throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.CaracteristicaTipoLocal[] infoCaracteristicaTipoLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Local[] localsAccessibles(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Caracteristica infoCaracteristica(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public void validaLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Local[] infoLocalPerNomLocal(java.lang.String arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Local[] localnoVerificat() throws java.rmi.RemoteException, webservice.ErrorException;
    public void altaLocal(webservice.Local arg0, webservice.Accessibilitat[] arg1) throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Local[] infoLocalPerNomLocalICodiTipoLocal(java.lang.String arg0, int arg1) throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Local[] infoLocalPerTipoLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public void baixaLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Caracteristica[] infoCaracteristicaLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public int codiAccessibilitatLliure() throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.TipoLocal[] cercaTipoLocal() throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Local infoLocalPerCodiLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
}
