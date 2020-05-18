/**
 * WebServiceLocal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservice;

public interface WebServiceLocal extends java.rmi.Remote {
    public webservice.Caracteristica[] caracteristiquesPerCodiLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public int codiLocalLliure() throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Local[] localsAccessibles(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Caracteristica infoCaracteristica(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Local[] localsPerTipoLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Local[] localsNoVerificats() throws java.rmi.RemoteException, webservice.ErrorException;
    public void crearLocal(webservice.Local arg0, webservice.Accessibilitat[] arg1) throws java.rmi.RemoteException, webservice.ErrorException;
    public void eliminarLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Local localPerCodiLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public void verificarLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public int codiAccessibilitatLliure() throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.TipoLocal[] cercaTipoLocal() throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.CaracteristicaTipoLocal[] caracteristiquesTipoLocal(int arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Local[] localsPerNomLocal(java.lang.String arg0) throws java.rmi.RemoteException, webservice.ErrorException;
    public webservice.Local[] localsPerNomLocalICodiTipoLocal(java.lang.String arg0, int arg1) throws java.rmi.RemoteException, webservice.ErrorException;
}
