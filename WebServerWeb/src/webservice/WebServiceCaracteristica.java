package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import pojo.Caracteristica;

@WebService
public class WebServiceCaracteristica {
    
	@WebMethod
	public String method1 (Caracteristica caracteristica) {
		
		return("Caracteristica " + caracteristica.getCodiCaracteristica() + " creada");
	}
}