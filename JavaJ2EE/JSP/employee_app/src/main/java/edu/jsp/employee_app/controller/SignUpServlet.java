package edu.jsp.employee_app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jsp.employee_app.dao.EmployeeDAO;
import edu.jsp.employee_app.dto.Employee;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String name = req.getParameter("name");
			String cname = req.getParameter("cname");
			String job = req.getParameter("job");
			double sal = Double.parseDouble(req.getParameter("sal"));
			String mail = req.getParameter("mail");
			String pass = req.getParameter("pass");
			long pno = Long.parseLong(req.getParameter("pno"));
			
			Employee employee = new Employee();
			employee.setName(name);
			employee.setCname(cname);
			employee.setJob(job);
			employee.setSal(sal);
			employee.setEmail(mail);
			employee.setPassword(pass);
			employee.setPhone_number(pno);
			
			EmployeeDAO dao = new EmployeeDAO();
			dao.saveEmployee(employee);
			
			req.getRequestDispatcher("signin.jsp").include(req, resp);
//			resp.getWriter().print("<h1>Data Inserted Successfully...!</h1>");
		} catch (Exception e) {
			resp.getWriter().print("<h1>Input field Cannot  Be Null...!</h1>");
			req.getRequestDispatcher("signup.jsp").include(req, resp);
			
		}
	}

}
