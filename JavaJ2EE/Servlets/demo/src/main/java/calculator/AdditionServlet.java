package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int num1 = Integer.parseInt( req.getParameter("num1"));
		int num2 = Integer.parseInt( req.getParameter("num2"));
		
		res.getWriter().print("<h1>The Sum Of Given Two Number Is : " + num1+num2 +"</h1>");;
	}

}
