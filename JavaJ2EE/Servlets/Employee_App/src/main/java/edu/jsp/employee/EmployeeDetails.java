package edu.jsp.employee;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import edu.jsp.employee.entity.Employee;

public class EmployeeDetails extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select e from Employee e");
		
		List<Employee> e = q.getResultList();
		
		String html ="<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Employee Details</title>\r\n"
				+ "    <style>\r\n"
				+ "        table,th,td{\r\n"
				+ "            border: 1px solid;\r\n"
				+ "            border-collapse: collapse;\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <table>\r\n"
				+ "        <tr>\r\n"
				+ "            <th>Emp.name</th>\r\n"
				+ "            <th>Emp.Company</th>\r\n"
				+ "            <th>Emp.job</th>\r\n"
				+ "            <th>Emp.sal</th>\r\n"
				+ "            <th>Emp.mail_id</th>\r\n"
				+ "        </tr>\r\n" ;
		
		
		for (Employee ed : e) {
			
			html = html+ "        <tr>\r\n"
					+ "            <td>"+ed.getName()+"</td>\r\n"
					+ "            <td>"+ed.getCname()+"</td>\r\n"
					+ "            <td>"+ed.getJob()+"</td>\r\n"
					+ "            <td>"+ed.getSal()+"</td>\r\n"
					+ "            <td>"+ed.getMail()+"</td>\r\n"
					+ "        </tr>\r\n";
		}
		
		html += "    </table>\r\n"
				+ "</body>\r\n"
				+ "</html>" ;
		
		res.getWriter().print(html);
	}

}
