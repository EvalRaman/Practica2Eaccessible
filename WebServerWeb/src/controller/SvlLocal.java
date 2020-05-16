package controller;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

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

import exceptions.ErrorException;
import pojo.Accessibilitat;
import pojo.Local;
import webservice.WebServiceLocal;

/**
 * Servlet implementation class SvlLocal
 */
@WebServlet("/SvlLocal")
public class SvlLocal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlLocal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			doFer(request, response);
		} catch (ErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void doFer(HttpServletRequest request, HttpServletResponse response) throws ErrorException {
		
		String method;
		
		String codiLocal = request.getParameter("codiLocal");
		String codiTipoLocal = request.getParameter("codiTipoLocal");
		String codiCarrer = request.getParameter("codiCarrer");
		String nomCarrer = request.getParameter("nomCarrer");
		String nomVia = request.getParameter("nomVia");
		String numero = request.getParameter("numero");
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
		
		/*		
		Local local = new Local(Integer.parseInt(codiLocal), Integer.parseInt(codiTipoLocal), Integer.parseInt(codiCarrer), nomCarrer, nomVia, Integer.parseInt(numero), nomLocal, observacions, verificat);
		List<Accessibilitat> accessibilitats = null;
		WebServiceLocal wsLocal = new WebServiceLocal();
		wsLocal.altaLocal(local, accessibilitats);
		*/
		
		String strStatus = new String("Insert done");
		InitialContext cxt;
		
		if(method.equals("insert") || method.equals("update")) {
			
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
		}
		else {
			try {
				cxt = new InitialContext();

				if ( cxt != null ) {
					DataSource ds = (DataSource) cxt.lookup("java:jboss/PostgreSQL/eAccessible");
							
					if ( ds == null ) strStatus = "Error creating the datasource";
					else {	
						Connection connection = ds.getConnection();
						Statement stm = connection.createStatement();
						stm.executeQuery("\"delete from eAccessible.local where codilocal=" + codiLocal+")");
						connection.close();
						stm.close();
					}
				}   
			}
			catch (NamingException e1) { e1.printStackTrace(); } 
			catch (SQLException e) { e.printStackTrace(); }
		}
		
		session.setAttribute("eAccessible.Status", strStatus);
				
		try	{
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/JSPLocal");
			rd.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
