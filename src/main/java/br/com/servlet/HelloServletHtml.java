package br.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServletHtml extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
			
			response.setContentType("text/html;charset=UTF-8");
			
			PrintWriter out = response.getWriter();
		    out.println("<html>");
		    out.println("<head>");
		    out.println("<title>Primeira Servlet</title>");
		    out.println("</head>");
		    out.println("<body>");
		    out.println("<h1 style='font-size:10px;'>Oi mundo Servlet!</h1>");
		    out.println("</body>");
		    out.println("</html>");
	}
	
}
