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
 * Servlet implementation class SvlEAccessible
 */
@WebServlet("/SvlEAccessible")
public class SvlEAccessible extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlEAccessible() {
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
	
	private void doFer(HttpServletRequest request, HttpServletResponse response) {
		
		String codiTipoLocal = request.getParameter("codiTipoLocal");
		String codiCarrer = request.getParameter("codiCarrer");
		String nomCarrer = request.getParameter("nomCarrer");
		String nomVia = request.getParameter("nomVia");
		String numero = request.getParameter("numero");
		String nomLocal = request.getParameter("nomLocal");
		String observacions = request.getParameter("observacions");
		String verificat = request.getParameter("verificat");
				
		HttpSession session = request.getSession(true);
					
		session.setAttribute("eAccessible.codiTipoLocal", codiTipoLocal);
		session.setAttribute("eAccessible.codiCarrer", codiCarrer);
		session.setAttribute("eAccessible.nomCarrer", nomCarrer);
		session.setAttribute("eAccessible.nomVia", nomVia);
		session.setAttribute("eAccessible.numero", numero);
		session.setAttribute("eAccessible.nomLocal", nomLocal);
		session.setAttribute("eAccessible.observacions", observacions);
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
					stm.executeUpdate("insert into eAccessible (codiTipoLocal, codiCarrer, nomCarrer, nomVia, numero, nomLocal, observacions, verificat) values('"+codiTipoLocal+"','"+codiCarrer+"','"+nomCarrer+"','"+nomVia+"','"+numero+"','"+nomLocal+"','"+observacions+"','"+verificat+"')");
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
			RequestDispatcher rd = context.getRequestDispatcher("/JSPLocal");
			rd.forward(request, response);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}