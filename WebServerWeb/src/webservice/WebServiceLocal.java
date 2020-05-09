package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import pojo.Local;


@WebService
public class WebServiceLocal {
    
	@WebMethod
	public String method1 (Local local) {
		
		return("Local " + local.getNomLocal() + " creat");
	}
}