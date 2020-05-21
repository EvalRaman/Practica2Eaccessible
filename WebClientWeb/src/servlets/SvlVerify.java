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
 * Servlet implementation class SvlDisplay
 */
@WebServlet("/SvlVerify")
public class SvlVerify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlVerify() {
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
		
		HttpSession session;
		
		String codiLocal = request.getParameter("codiLocal");
		String nomLocal = request.getParameter("nomLocal");
		
		System.out.println(codiLocal);
		
		session = request.getSession(true);
		
		if(!codiLocal.isEmpty()) {
			try{
				webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
				webservice.WebServiceLocal port = service.getWebServiceLocalPort();
				port.verificarLocal(Integer.parseInt(codiLocal));
			}
			catch (Exception e) { 
				e.printStackTrace();
			}
		}
		else {
			System.out.println("NO ENTREM AL IF");
		}
		
		session.setAttribute("nomLocal", nomLocal);
		
		try {
			ServletContext context = getServletContext();
			RequestDispatcher rd = context.getRequestDispatcher("/ConfirmatedVerify");
			rd.forward(request, response);
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}
	}
}

