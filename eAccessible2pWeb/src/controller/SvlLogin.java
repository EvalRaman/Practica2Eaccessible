package controller;

import java.io.IOException;
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

/**
 * Servlet implementation class SvlLogin
 */
@WebServlet("/SvlLogin")
public class SvlLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void doFer(HttpServletRequest request, HttpServletResponse response) {
		
		String dni = request.getParameter("dni");
		String nom = request.getParameter("nom");
		String cognoms = request.getParameter("cognoms");
		String telefon = request.getParameter("telefon");
		String codiCarrer = request.getParameter("codiCarrer");
		String nomCarrer = request.getParameter("nomCarrer");
		String nomVia = request.getParameter("nomVia");
		String numero = request.getParameter("numero");
				
		HttpSession session = request.getSession(true);
					
		session.setAttribute("incidencia.dni", dni);
		session.setAttribute("incidencia.nom", nom);
		session.setAttribute("incidencia.cognoms", cognoms);
		session.setAttribute("incidencia.telefon", telefon);
		session.setAttribute("incidencia.codiCarrer", codiCarrer);
		session.setAttribute("incidencia.nomCarrer", nomCarrer);
		session.setAttribute("incidencia.nomVia", nomVia);
		session.setAttribute("incidencia.numero", numero);
			
		String strStatus = new String("Insert done");
		InitialContext cxt;
	
		try {
			cxt = new InitialContext();

			if ( cxt != null ) {
				DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/incidencia");
						
				if ( ds == null ) strStatus = "Error creating the datasource";
				else {	
					Connection connection = ds.getConnection();
					Statement stm = connection.createStatement();
					stm.executeUpdate("insert into incidencia (codiTipoLocal, codiCarrer, nomCarrer, nomVia, numero, nomLocal, observacions, verificat) values('"+codiTipoLocal+"','"+codiCarrer+"','"+nomCarrer+"','"+nomVia+"','"+numero+"','"+nomLocal+"','"+observacions+"','"+verificat+"')");
					connection.close();
					stm.close();
				}
			}   
		}
		
		catch (NamingException e1) { e1.printStackTrace(); } 
		catch (SQLException e) { e.printStackTrace(); }
								
		session.setAttribute("incidencia.Status", strStatus);
			
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
