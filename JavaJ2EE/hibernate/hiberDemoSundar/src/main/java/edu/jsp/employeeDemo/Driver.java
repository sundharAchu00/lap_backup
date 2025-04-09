package edu.jsp.employeeDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee e = new Employee();
		
		e.setName("Hema");
		e.setSal(56000.000);
		
		et.begin();
		em.persist(e);
		et.commit();
	}
}
