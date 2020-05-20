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
 * Servlet implementation class SvlDelete
 */
@WebServlet("/SvlDelete")
public class SvlDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlDelete() {
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
        // TODO Auto-generated method stub
        
		HttpSession session;

        String codiLocal = request.getParameter("deleteCode");
        String nomLocal = request.getParameter("deleteName");
       
        session = request.getSession(true);

        try{
            webservice.WebServiceLocalServiceLocator service = new webservice.WebServiceLocalServiceLocator();
            webservice.WebServiceLocal port = service.getWebServiceLocalPort();
            port.eliminarLocal(Integer.parseInt(codiLocal));
        }
        catch (Exception e) { e.printStackTrace();}

        session.setAttribute("nomLocal", nomLocal);
                
        try {
            ServletContext context = getServletContext();
            RequestDispatcher rd = context.getRequestDispatcher("/JSPDeleteLocal");
            rd.forward(request, response);
        }
        catch ( Exception e ) {e.printStackTrace();}

    }

}
