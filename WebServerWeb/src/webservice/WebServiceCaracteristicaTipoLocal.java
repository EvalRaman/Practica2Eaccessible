package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import pojo.CaracteristicaTipoLocal;

@WebService
public class WebServiceCaracteristicaTipoLocal {
	@WebMethod
	public String method1 (CaracteristicaTipoLocal caracteristicaTipoLocal) {
		
		return("CaracteristicaTipoLocal " + caracteristicaTipoLocal.getCodicaracteristicatipolocal() + " creada");
	}	
}