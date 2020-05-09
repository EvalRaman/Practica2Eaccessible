package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import pojo.Nivell;


@WebService
public class WebServiceNivell {
    
	@WebMethod
	public String method1 (Nivell nivell) {
		
		return("Nivell " + nivell.getCodiNivell() + " creat");
	}
}