package edu.jsp.serDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class validationServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String mail =  req.getParameter("mail");
		String pass =  req.getParameter("passwd");
		
		PrintWriter out = res.getWriter();
		if (pass.length()>=8) {
			if (mail.contains("@")) {
				out.print("<h1>Registered Successfully....!</h1>");
			}
		}else {
			out.print("<h1>Password length is to short....!</h1>");
		}
	}

}
