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

/**
 * Servlet implementation class SvlBeforeCreate
 */
@WebServlet("/SvlBeforeCreate")
public class SvlBeforeCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlBeforeCreate() {
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
        System.out.println("\nDins del servlet");
        HttpSession sessio;

        String codiTipoLocal = request.getParameter("codiTipoLocal");

        sessio = request.getSession(true);

        webservice.CaracteristicaTipoLocal[] caracteristicaTipoLocal = null;


        try{
            webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
            webservice.WebServiceLocal port = service.getWebServiceLocalPort();
            caracteristicaTipoLocal = port.caracteristiquesTipoLocal(Integer.parseInt(codiTipoLocal));
        }
        catch (Exception e) { e.printStackTrace();}

        webservice.Caracteristica[] caracteristiques = new webservice.Caracteristica[caracteristicaTipoLocal.length];
        for(int i = 0; i<caracteristicaTipoLocal.length; i++) {
            try{
                webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
                webservice.WebServiceLocal port = service.getWebServiceLocalPort();
                caracteristiques[i] = port.infoCaracteristica(caracteristicaTipoLocal[i].getCodicaracteristica());
            }catch (Exception e) { e.printStackTrace();}
        }

        sessio.setAttribute("caracteristiques", caracteristiques);
        sessio.setAttribute("codiTipoLocal", codiTipoLocal);
        
        try {
            ServletContext context = getServletContext();
            RequestDispatcher rd = context.getRequestDispatcher("/CreateLocal.jsp");
            rd.forward(request, response);
        }
        catch ( Exception e ) {e.printStackTrace();}

    }

}
