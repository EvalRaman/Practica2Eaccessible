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

import classes.InfoLocal;

/**
 * Servlet implementation class SvlDisplay
 */
@WebServlet("/SvlDisplay")
public class SvlDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlDisplay() {
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
		
		String codiTipoLocal = request.getParameter("codiTipoLocal");
		String nomLocal = request.getParameter("nomLocal");	
		
		session = request.getSession(true);
				
		webservice.Local[] locals = null;
		webservice.TipoLocal[] tipoLocals = null;
		
		if(!nomLocal.isEmpty() && !codiTipoLocal.isEmpty()) {
			try{
				webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
				webservice.WebServiceLocal port = service.getWebServiceLocalPort();
				locals = port.localsPerNomLocalICodiTipoLocal(nomLocal, Integer.parseInt(codiTipoLocal));
			}
			catch (Exception e) { 
				e.printStackTrace();
			}
		}
		
		else if(!nomLocal.isEmpty()) {
			try{
				webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
				webservice.WebServiceLocal port = service.getWebServiceLocalPort();
				locals = port.localsPerNomLocal(nomLocal);
			}
			catch (Exception e) { 
				e.printStackTrace();
			}
		}
		
		else if(!codiTipoLocal.isEmpty()) {
			try{
				webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
				webservice.WebServiceLocal port = service.getWebServiceLocalPort();
				locals = port.localsPerTipoLocal(Integer.parseInt(codiTipoLocal));
			}
			catch (Exception e) { 
				e.printStackTrace();
			}
		}	
		
		if(locals != null) {
			try{
				webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
				webservice.WebServiceLocal port = service.getWebServiceLocalPort();
				tipoLocals = port.cercaTipoLocal();
				
			}
			catch (Exception e) { 
				e.printStackTrace();
			}
			
			InfoLocal[] infoLocals = new InfoLocal[locals.length];
			for(int i = 0; i < locals.length; i++) {
				
				InfoLocal infoLocal = new InfoLocal();
				
				infoLocal.setCodiLocal(locals[i].getCodiLocal());
				infoLocal.setCodiTipoLocal(locals[i].getCodiTipoLocal());
				infoLocal.setCodiCarrer(locals[i].getCodiCarrer());
				infoLocal.setNomCarrer(locals[i].getNomCarrer());
				infoLocal.setNomVia(locals[i].getNomVia());
				infoLocal.setNumero(locals[i].getNumero());
				infoLocal.setNomLocal(locals[i].getNomLocal());
				infoLocal.setObservacions(locals[i].getObservacions());
				infoLocal.setVerificat(locals[i].getVerificat());
				
				for(int j = 0; j < tipoLocals.length; j++)
					if(locals[i].getCodiTipoLocal() == tipoLocals[j].getCodiTipoLocal()) {
						infoLocal.setNomTipoLocalCA(tipoLocals[j].getNomTipoLocalCA());
						infoLocal.setNomTipoLocalES(tipoLocals[j].getNomTipoLocalES());
						infoLocal.setNomTipoLocalEN(tipoLocals[j].getNomTipoLocalEN());
					}
				
				infoLocals[i] = infoLocal;
			}

			session.setAttribute("Locals", infoLocals);
			
		}
		else {
			session.setAttribute("Locals", null);
		}
		
		try {
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/index");
			rd.forward(request, response);
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}
	}
}
