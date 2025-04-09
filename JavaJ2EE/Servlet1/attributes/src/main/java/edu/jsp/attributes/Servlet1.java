package edu.jsp.attributes;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setAttr")
public class Servlet1 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Student s = new Student(11,"harish",21,86.09);
		
		ServletContext context =  getServletContext();
		
		context.setAttribute("Student", s);
		
//		req.getRequestDispatcher("/getAttr").forward(req, resp);
		
		resp.getWriter().print("<h1>Attribute Setted...!</h1>");
		
	
	}
}
