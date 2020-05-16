package servlets;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import webservice.Accessibilitat;
import webservice.Local;
import webservice.WebServiceLocal;
import webservice.WebServiceLocalServiceLocator;

/**
 * Servlet implementation class SvlCreateLocal
 */
@WebServlet("/SvlCreateLocal")
public class SvlCreateLocal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlCreateLocal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doFer(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void doFer(HttpServletRequest request, HttpServletResponse response) {
		
		Local local = new webservice.Local();
		Accessibilitat[] accessibilitats = null;
		
		int codiLocal = Integer.parseInt(request.getParameter("codiLocal"));
		int codiTipoLocal = Integer.parseInt(request.getParameter("codiTipoLocal"));
		int codiCarrer = Integer.parseInt(request.getParameter("codiCarrer"));
		String nomCarrer = request.getParameter("nomCarrer");
		String nomVia = request.getParameter("nomVia");
		int numero = Integer.parseInt(request.getParameter("numero"));
		String nomLocal = request.getParameter("nomLocal");
		String observacions = request.getParameter("observacions");
		String verificat = request.getParameter("verificat");
				
		HttpSession session = request.getSession(true);
		
		/*
		local.setCodiLocal(codiLocal);
		local.setCodiTipoLocal(codiTipoLocal);
		local.setCodiCarrer(codiCarrer);
		local.setNomCarrer(nomCarrer);
		local.setNomVia(nomVia);
		local.setNumero(numero);
		local.setNomLocal(nomLocal);
		local.setObservacions(observacions);
		local.setVerificat(verificat);
		*/
		
		session.setAttribute("eAccesible.codiLocal", codiLocal);
		session.setAttribute("eAccessible.codiTipoLocal", codiTipoLocal);
		session.setAttribute("eAccessible.codiCarrer", codiCarrer);
		session.setAttribute("eAccessible.nomCarrer", nomCarrer);
		session.setAttribute("eAccessible.nomVia", nomVia);
		session.setAttribute("eAccessible.numero", numero);
		session.setAttribute("eAccessible.nomLocal", nomLocal);
		session.setAttribute("eAccessible.observacions", observacions);
		session.setAttribute("eAccessible.verificat", verificat);
		
		try {
			WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
			WebServiceLocal port = service.getWebServiceLocalPort();
			port.altaLocal(local, accessibilitats);
		}
		catch(RemoteException | ServiceException e) {
			e.printStackTrace();
		}
		
		try
		{
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/JSPLocal");
			rd.forward(request, response);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
