package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DynamicServlet extends GenericServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		
		Date d = new Date();
		  
		String html = "<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset=\"ISO-8859-1\">"
				+ "<title>Generic Servlet</title>"
				+ "</head>"
				+ "<body>"
				+ "	<h1 style=\"color: red\">Current Date And Time Is : "+d+"</h1>"
				+ "</body>\r\n"
				+ "</html>";
		out.print(html);
	}
}
