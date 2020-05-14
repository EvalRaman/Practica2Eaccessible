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
 * Servlet implementation class SvlCaracteristica
 */
@WebServlet("/SvlCaracteristica")
public class SvlCaracteristica extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlCaracteristica() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doFer(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void doFer(HttpServletRequest request, HttpServletResponse response) {
		
		String codiCaracteristica = request.getParameter("codiCaracteristica");
		String nomCaracteristicaCA = request.getParameter("nomCaracteristicaCA");
		String nomCaracteristicaES = request.getParameter("nomCaracteristicaES");
		String nomCaracteristicaEN = request.getParameter("nomCaracteristicaEN");
		String tipo = request.getParameter("tipo");
		String codiNivell = request.getParameter("codiNivell");
				
		HttpSession session = request.getSession(true);
					
		session.setAttribute("eAccessible.codiCaracteristica", codiCaracteristica);
		session.setAttribute("eAccessible.nomCaracteristicaCA", nomCaracteristicaCA);
		session.setAttribute("eAccessible.nomCaracteristicaES", nomCaracteristicaES);
		session.setAttribute("eAccessible.nomCaracteristicaEN", nomCaracteristicaEN);
		session.setAttribute("eAccessible.tipo", tipo);
		session.setAttribute("eAccessible.codiNivell", codiNivell);
			
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
					stm.executeUpdate("insert into eAccessible.Caracteristica (codiCaracteristica, nomCaracteristicaCA, nomCaracteristicaES, nomCaracteristicaEN, tipo, codiNivell) values('"+codiCaracteristica+"','"+nomCaracteristicaCA+"','"+nomCaracteristicaES+"','"+nomCaracteristicaEN+"','"+tipo+"','"+codiNivell+"')");
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
			RequestDispatcher rd = context.getRequestDispatcher("/JSPCaracteristica");
			rd.forward(request, response);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
