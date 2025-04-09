package edu.jsp.employee_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jsp.employee_app.dao.EmployeeDAO;
import edu.jsp.employee_app.dto.Employee;

@WebServlet("/get")
public class GetServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		EmployeeDAO dao = new EmployeeDAO();
		
		Employee employee = dao.getById(id);
		req.setAttribute("emp", employee);
		
		req.getRequestDispatcher("update.jsp").forward(req, resp);;

	}
}
