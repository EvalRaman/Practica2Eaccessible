package controller;

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

/**
 * Servlet implementation class SvlCaracteristicaTipoLocal
 */
@WebServlet("/SvlCaracteristicaTipoLocal")
public class SvlCaracteristicaTipoLocal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlCaracteristicaTipoLocal() {
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
		
		String codicaracteristicatipolocal = request.getParameter("codicaracteristicatipolocal");
		String codicaracteristica = request.getParameter("codicaracteristica");
		String coditipolocal = request.getParameter("coditipolocal");
				
		HttpSession session = request.getSession(true);
					
		session.setAttribute("eAccessible.codicaracteristicatipolocal", codicaracteristicatipolocal);
		session.setAttribute("eAccessible.codicaracteristica", codicaracteristica);
		session.setAttribute("eAccessible.coditipolocal", coditipolocal);
			
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
					stm.executeUpdate("insert into eAccessible.CaracteristicaTipoLocal (codicaracteristicatipolocal, codicaracteristica, coditipolocal) values('"+codicaracteristicatipolocal+"','"+codicaracteristica+"','"+coditipolocal+"')");
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
			RequestDispatcher rd = context.getRequestDispatcher("/JSPCaracteristicaTipoLocal");
			rd.forward(request, response);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
