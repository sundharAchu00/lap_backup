package edu.jsp.employee_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jsp.employee_app.dao.EmployeeDAO;
import edu.jsp.employee_app.dto.Employee;

@WebServlet("/signin")
public class SignInServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String mail = req.getParameter("mail");
		String pass = req.getParameter("pass");
		
		EmployeeDAO dao =new EmployeeDAO();
		
		Employee e = dao.fetchEmployeeByEmail(mail);
		
		if (e != null) {
			if (e.getPassword().equals(pass)) {
//				resp.getWriter().print("<h1>Welcome Your Successfully SignIn</h1><h3>"+ e +"</h3>");
				req.getRequestDispatcher("details").forward(req, resp);
			} else {
				resp.getWriter().print("<h1>Invalid Password...</h1>");
			}
			
		} else {
			resp.getWriter().print("<h1>Invalid UserCrediantials...</h1>");
		}
	}
}
