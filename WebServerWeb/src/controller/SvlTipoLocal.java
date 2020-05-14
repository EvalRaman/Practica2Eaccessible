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
 * Servlet implementation class SvlTipoLocal
 */
@WebServlet("/SvlTipoLocal")
public class SvlTipoLocal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlTipoLocal() {
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
		
		String codiTipoLocal = request.getParameter("codiTipoLocal");
		String nomTipoLocalCA = request.getParameter("nomTipoLocalCA");
		String nomTipoLocalES = request.getParameter("nomTipoLocalES");
		String nomTipoLocalEN = request.getParameter("nomTipoLocalEN");
				
		HttpSession session = request.getSession(true);
					
		session.setAttribute("eAccessible.codiTipoLocal", codiTipoLocal);
		session.setAttribute("eAccessible.nomTipoLocalCA", nomTipoLocalCA);
		session.setAttribute("eAccessible.nomTipoLocalES", nomTipoLocalES);
		session.setAttribute("eAccessible.nomTipoLocalEN", nomTipoLocalEN);
	
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
					stm.executeUpdate("insert into eAccessible.Nivell (codiTipoLocal, nomTipoLocalCA, nomTipoLocalES, nomTipoLocalEN) values('"+codiTipoLocal+"','"+nomTipoLocalCA+"','"+nomTipoLocalES+"','"+nomTipoLocalEN+"')");
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
			RequestDispatcher rd = context.getRequestDispatcher("/JSPTipoLocal");
			rd.forward(request, response);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
