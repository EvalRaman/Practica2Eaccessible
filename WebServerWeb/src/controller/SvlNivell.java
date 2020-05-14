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
 * Servlet implementation class SvlNivell
 */
@WebServlet("/SvlNivell")
public class SvlNivell extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlNivell() {
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
			
		String codiNivell = request.getParameter("codiNivell");
		String nomNivellCA = request.getParameter("nomNivellCA");
		String nomNivellES = request.getParameter("nomNivellES");
		String nomNivellEN = request.getParameter("nomNivellEN");
				
		HttpSession session = request.getSession(true);
					
		session.setAttribute("eAccessible.codiNivell", codiNivell);
		session.setAttribute("eAccessible.nomNivellCA", nomNivellCA);
		session.setAttribute("eAccessible.nomNivellES", nomNivellES);
		session.setAttribute("eAccessible.nomNivellEN", nomNivellEN);
	
		String strStatus = new String("Insert done");
		InitialContext cxt;
	
		try {
			cxt = new InitialContext();

			if ( cxt != null ) {
				DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
						
				if ( ds == null ) strStatus = "Error creating the datasource";
				else {	
					Connection connection = ds.getConnection();
					Statement stm = connection.createStatement();
					stm.executeUpdate("insert into eAccessible.Nivell (codiNivell, nomNivellCA, nomNivellES, nomNivellEN) values('"+codiNivell+"','"+nomNivellCA+"','"+nomNivellES+"','"+nomNivellEN+"')");
					connection.close();
					stm.close();
				}
			}   
		}
		
		catch (NamingException e1) { e1.printStackTrace(); } 
		catch (SQLException e) { e.printStackTrace(); }
								
		session.setAttribute("eAccessible.Status", strStatus);
			
		try
		{
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/JSPNivell");
			rd.forward(request, response);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
