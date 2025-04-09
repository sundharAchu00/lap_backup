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

@WebServlet("/details")
public class GetEmpServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	EmployeeDAO dao = new EmployeeDAO();
	
	List<Employee> employee = dao.getEmployees();
	
	req.setAttribute("list", employee);
	req.getRequestDispatcher("getAll.jsp").forward(req, resp);
	}
}
