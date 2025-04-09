package edu.jsp.employee_app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jsp.employee_app.dao.EmployeeDAO;
import edu.jsp.employee_app.dto.Employee;

@WebServlet("/delete")
public class RemoveEmployeeById extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		EmployeeDAO dao = new EmployeeDAO();
		
		resp.getWriter().print("<h1>"+dao.deleteEmployeeById(id)+"</h1>");
		
		
		
	}
}
