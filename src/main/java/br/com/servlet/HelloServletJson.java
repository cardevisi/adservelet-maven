package br.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServletJson extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
			
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			
			PrintWriter out = response.getWriter();
			
			String json = "{"
					+	"'config': {"
					+		"'movie': 'swf_ad1.swf',"
					+	"'flashvars': {"
					+		"'clickTag': 'http://www.cardevisi.com',"
					+		"'color': '#FFFFFF'"
					+	"},"
					+		"'quality': 'high',"
					+		"'allowScriptAccess': 'always',"
					+		"'allowFullScreen':'false',"
					+		"'wmode': 'transparent',"
					+		"'menu':'false',"
					+		"'play':'true'"
					+	"},"
					+	"'tracking': {"
					+		"'start': '1321321564',"
					+		"'first_quartle': '1321321564',"
					+		"'middle_quartle': '1321321564',"
					+		"'complete': '1321321564'"
					+	"}"
					+"};";
			
			out.println(json);
		    
	}
	
	
}
