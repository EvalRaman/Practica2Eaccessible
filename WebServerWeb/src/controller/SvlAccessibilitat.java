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
 * Servlet implementation class SvlAccessibilitat
 */
@WebServlet("/SvlAccessibilitat")
public class SvlAccessibilitat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlAccessibilitat() {
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
		
		String codiAccessibilitat = request.getParameter("codiAccessibilitat");
		String codiLocal = request.getParameter("codiLocal");
		String codiCaracteristica = request.getParameter("codiCaracteristica");
		String valor = request.getParameter("valor");
		String verificat = request.getParameter("verificat");
						
		HttpSession session = request.getSession(true);
					
		session.setAttribute("eAccessible.codiAccessibilitat", codiAccessibilitat);
		session.setAttribute("eAccessible.codiLocal", codiLocal);
		session.setAttribute("eAccessible.codiCaracteristica", codiCaracteristica);
		session.setAttribute("eAccessible.valor", valor);
		session.setAttribute("eAccessible.verificat", verificat);
	
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
					stm.executeUpdate("insert into eAccessible.Accessibilitat (codiAccessibilitat, codiLocal, codiCaracteristica, valor, verificat) values('"+codiAccessibilitat+"','"+codiLocal+"','"+codiCaracteristica+"','"+valor+"','"+verificat+"')");
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
			RequestDispatcher rd = context.getRequestDispatcher("/JSPAccessibilitat");
			rd.forward(request, response);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
