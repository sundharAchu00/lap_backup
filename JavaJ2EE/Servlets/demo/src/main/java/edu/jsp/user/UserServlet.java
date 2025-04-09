package edu.jsp.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String mail = req.getParameter("mail");
		String passwd = req.getParameter("pass");
		
		res.getWriter().println("<h1>name : "+name+"</h1>");
		res.getWriter().println("<h1>age : "+age+"</h1>");
		res.getWriter().println("<h1>mail : "+mail+"</h1>");
		res.getWriter().println("<h1>password : "+passwd+"</h1>");

	}

}
