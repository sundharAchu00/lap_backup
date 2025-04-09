package edu.jsp.employee_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import javax.persistence.Query;

import edu.jsp.employee_app.dto.Employee;

public class EmployeeDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

	public void saveEmployee(Employee e) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(e);
		et.commit();
	}

	public Employee getById(int id) {
		EntityManager em = emf.createEntityManager();
		
		return em.find(Employee.class, id);

	}
	
	public Employee fetchEmployeeByEmail(String mail) {

		try {
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select e from Employee e where e.Email=?1");
			q.setParameter(1, mail);
			Employee e = (Employee) q.getSingleResult();
			return e;
		} catch (Exception e) {
			return null;
		}
	}

	public List<Employee> getEmployees() {
		
		try {
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("select e from Employee e");
			
			List<Employee> list = (List<Employee>)q.getResultList();
			
			return list;
		} catch (Exception e) {
			return null;
		}

	}

	public String deleteEmployeeById(int id) {
		
		try {
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			Employee employee = em.find(Employee.class, id);
			
			if (employee != null) {
				et.begin();
				em.remove(employee);
				et.commit();
				return "success";
			} else {
				return "Employee Data Not Found..!";
			}
			
		} catch (Exception e2) {
			return null;
		}
	
	}
	
	public void updateEmployee(Employee e) {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.merge(e);
		et.commit();
		
	}

}
