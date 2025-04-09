package edu.jsp.employee;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import edu.jsp.employee.entity.Employee;

public class EmployeeServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String cname = req.getParameter("cname");
		String job = req.getParameter("job");
		double sal = Double.parseDouble(req.getParameter("sal"));
		String mail = req.getParameter("mail");
		String pass = req.getParameter("pass");
		long ph = Long.parseLong(req.getParameter("num"));

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Employee e = new Employee();

		e.setName(name);
		e.setCname(cname);
		e.setJob(job);
		e.setSal(sal);
		e.setMail(mail);
		e.setPassword(pass);
		e.setPhone(ph);
		
		et.begin();
		em.persist(e);
		et.commit();

		res.getWriter().print("<h1>Employee data SuccessFully Added to the Database !!!</h1>");
	}

}
