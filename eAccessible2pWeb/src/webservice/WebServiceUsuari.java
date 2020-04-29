package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import pojo.Usuari;


@WebService
public class WebServiceUsuari {
    
	@WebMethod
	public String method1 (Usuari usuari) {
		
		return("Usuari " + usuari.getNom() + " creat");
	}
}