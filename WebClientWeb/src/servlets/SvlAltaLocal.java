package servlets;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import pojo.Local;

/**
 * Servlet implementation class SvlLocal
 */
@WebServlet("/SvlLocal")
public class SvlAltaLocal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlAltaLocal() {
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
		
		session.setAttribute("eAccesible.codiLocal", codiLocal);
		session.setAttribute("eAccessible.codiTipoLocal", codiTipoLocal);
		session.setAttribute("eAccessible.codiCarrer", codiCarrer);
		session.setAttribute("eAccessible.nomCarrer", nomCarrer);
		session.setAttribute("eAccessible.nomVia", nomVia);
		session.setAttribute("eAccessible.numero", numero);
		session.setAttribute("eAccessible.nomLocal", nomLocal);
		session.setAttribute("eAccessible.observacions", observacions);
		session.setAttribute("eAccessible.verificat", verificat);
		
		// TODO
		// Crida al webservice
		
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
