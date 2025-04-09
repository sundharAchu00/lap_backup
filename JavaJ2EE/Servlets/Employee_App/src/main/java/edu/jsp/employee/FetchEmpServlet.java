package edu.jsp.employee;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import edu.jsp.employee.entity.Employee;

public class FetchEmpServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int no = Integer.parseInt(req.getParameter("eno"));
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Employee e = em.find(Employee.class, no);
		
		if (e != null) {
			res.getWriter().print("<h1>"+e+"</h1>");	
		} else {
			res.getWriter().print("<h1>Data Not Found In The Record...!</h1>");
		}
		
	}

}
