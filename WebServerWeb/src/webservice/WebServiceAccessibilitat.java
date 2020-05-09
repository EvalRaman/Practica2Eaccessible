package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import pojo.Accessibilitat;

@WebService
public class WebServiceAccessibilitat {
	@WebMethod
	public String method1 (Accessibilitat accessibilitat) {
		
		return("Accessibilitat " + accessibilitat.getCodiAccessibilitat() + " creada");
	}

}

    
