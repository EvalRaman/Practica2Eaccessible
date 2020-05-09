package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import pojo.TipoLocal;


@WebService
public class WebServiceTipoLocal {
    
	@WebMethod
	public String method1 (TipoLocal tipoLocal) {
		
		return("TipoLocal " + tipoLocal.getCodiTipoLocal() + " creat");
	}
}