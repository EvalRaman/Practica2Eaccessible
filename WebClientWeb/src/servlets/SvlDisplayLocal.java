package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classes.*;

/**
 * Servlet implementation class SvlDisplay
 */
@WebServlet("/SvlDisplayLocal")
public class SvlDisplayLocal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlDisplayLocal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doFer(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void doFer(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		HttpSession session;
		
		String codiLocal = request.getParameter("codiLocal");
		
		session = request.getSession(true);
				
		webservice.Local local = null;
		webservice.TipoLocal[] tipoLocals = null;
		webservice.Caracteristica[] caracteristicaLocal = null;
		
		if(!codiLocal.isEmpty()) {
			try{
				webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
				webservice.WebServiceLocal port = service.getWebServiceLocalPort();
				local = port.localPerCodiLocal(Integer.parseInt(codiLocal));
			    caracteristicaLocal = port.caracteristiquesPerCodiLocal(Integer.parseInt(codiLocal));
			}
			catch (Exception e) { 
				e.printStackTrace();
			}
		}
		
		if(local != null) {
			try{
				webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
				webservice.WebServiceLocal port = service.getWebServiceLocalPort();
				tipoLocals = port.cercaTipoLocal();
				
			}
			catch (Exception e) { 
				e.printStackTrace();
			}

			InfoLocal infoLocal = new InfoLocal();
				
			infoLocal.setCodiLocal(local.getCodiLocal());
			infoLocal.setCodiTipoLocal(local.getCodiTipoLocal());
			infoLocal.setCodiCarrer(local.getCodiCarrer());
			infoLocal.setNomCarrer(local.getNomCarrer());
			infoLocal.setNomVia(local.getNomVia());
			infoLocal.setNumero(local.getNumero());
			infoLocal.setNomLocal(local.getNomLocal());
			infoLocal.setObservacions(local.getObservacions());
			infoLocal.setVerificat(local.getVerificat());
				
			for(int j = 0; j < tipoLocals.length; j++) {
				if(local.getCodiTipoLocal() == tipoLocals[j].getCodiTipoLocal()) {
					infoLocal.setNomTipoLocalCA(tipoLocals[j].getNomTipoLocalCA());
					infoLocal.setNomTipoLocalES(tipoLocals[j].getNomTipoLocalES());
					infoLocal.setNomTipoLocalEN(tipoLocals[j].getNomTipoLocalEN());
				}
			}
			session.setAttribute("Local", infoLocal);
			
			InfoCaracteristica[] infoCaracteristiques = new InfoCaracteristica[caracteristicaLocal.length];
			for(int i = 0; i < caracteristicaLocal.length; i++) {
				InfoCaracteristica infoCaracteristica = new InfoCaracteristica();
				infoCaracteristica.setCodiCaracteristica(caracteristicaLocal[i].getCodiCaracteristica());
				infoCaracteristica.setNomCaracteristicaCA(caracteristicaLocal[i].getNomCaracteristicaCA());
				infoCaracteristica.setNomCaracteristicaES(caracteristicaLocal[i].getNomCaracteristicaES());
				infoCaracteristica.setNomCaracteristicaEN(caracteristicaLocal[i].getNomCaracteristicaEN());
				infoCaracteristica.setTipo(caracteristicaLocal[i].getTipo());
				infoCaracteristica.setCodiNivell(caracteristicaLocal[i].getCodiNivell());
				
				infoCaracteristiques[i] = infoCaracteristica;
			}
			session.setAttribute("caracteristiques", infoCaracteristiques);		
		}
		else {
			session.setAttribute("Local", null);
		}
		
		try {
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/DetailLocal");
			rd.forward(request, response);
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}
	}
}

