package edu.jsp.httpDemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String mail =  req.getParameter("mail");
		String pass = req.getParameter("pass");
		if (mail.equals("tom@gmail.com") && pass.equals("12345")) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("home.html");
			dispatcher.forward(req, resp);
		} else {
			resp.getWriter().print("<h1>Invalid User Crediantials</h1>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.html");
			dispatcher.include(req, resp);
		}
		
	
	
	}
	
}
