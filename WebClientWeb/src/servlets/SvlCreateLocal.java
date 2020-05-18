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

import webservice.Accessibilitat;
import webservice.Local;

import webservice.Local;
import webservice.WebServiceLocal;

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
		int codiLocal = Integer.parseInt(request.getParameter("codiLocal"));
		int codiTipoLocal = Integer.parseInt(request.getParameter("codiTipoLocal"));
		int codiCarrer = Integer.parseInt(request.getParameter("codiCarrer"));
		String nomCarrer = request.getParameter("nomCarrer");
		String nomVia = request.getParameter("nomVia");
		int numero = Integer.parseInt(request.getParameter("numero"));
		String nomLocal = request.getParameter("nomLocal");
		String observacions = request.getParameter("observacions");
		int caracteristiquesLength = Integer.parseInt(request.getParameter("caracteristiquesLength"));				
		
		String caracteristicaValor[][] = new String[caracteristiquesLength][2];
		
		for(int i = 0; i < caracteristiquesLength; i++){
			caracteristicaValor[i][0] = request.getParameter("codiCaracteristica"+i);
			caracteristicaValor[i][1] = request.getParameter("valor"+i);
		}
		
		HttpSession session = request.getSession(true);
		
		int codiLocalLliure = 0;
		int codiAccessibilitatLliure = 0;
		
		try{
			webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
			webservice.WebServiceLocal port = service.getWebServiceLocalPort();
			codiLocalLliure = port.codiLocalLliure();
			System.out.println("codilocallliure: "+ codiLocalLliure);
			codiAccessibilitatLliure = port.codiAccessibilitatLliure();
			
		}
		catch (Exception e) { e.printStackTrace();}
				
		Local local = new webservice.Local();
		Accessibilitat[] accessibilitats = new webservice.Accessibilitat[caracteristiquesLength];
		
		local.setCodiLocal(codiLocalLliure);
		local.setCodiTipoLocal(codiTipoLocal);
		local.setCodiCarrer(codiCarrer);
		local.setNomCarrer(nomCarrer);
		local.setNomVia(nomVia);
		local.setNumero(numero);
		local.setNomLocal(nomLocal);
		local.setObservacions(observacions);
		local.setVerificat("N");
		
		System.out.println(local.getCodiLocal());
		System.out.println(local.getCodiTipoLocal());
		System.out.println(local.getCodiCarrer());
		System.out.println(local.getNomCarrer());
		System.out.println(local.getNomVia());
		System.out.println(local.getNumero());
		System.out.println(local.getNomLocal());
		System.out.println(local.getObservacions());
		
		for(int i = 0; i < caracteristiquesLength; i++) {
			accessibilitats[i] = new webservice.Accessibilitat();
			
			accessibilitats[i].setCodiLocal(codiLocalLliure);
			accessibilitats[i].setCodiAccessibilitat(codiAccessibilitatLliure);
			accessibilitats[i].setCodiCaracteristica(Integer.parseInt(caracteristicaValor[i][0]));
			accessibilitats[i].setValor(Integer.parseInt(caracteristicaValor[i][1]));
			accessibilitats[i].setVerificat("N");

			codiAccessibilitatLliure = codiAccessibilitatLliure + 1;
		}
		
		try {
			webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
			webservice.WebServiceLocal port = service.getWebServiceLocalPort();
			port.crearLocal(local, accessibilitats);
		}
		catch (Exception e) { e.printStackTrace();}
		
		session.setAttribute("nomLocal", nomLocal);
	
		try {
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/JSPLocal");
			rd.forward(request, response);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
