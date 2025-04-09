package edu.jsp.studentAddress;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	//one-to-one BiDirectional
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s = new Student();
		s.setName("sundhar");
		Address a = new Address();
		a.setCity("chennai");
		a.setState("TamilNadu");
		a.setZipcode(600028);
		a.setStreet("msd street");
		s.setA(a);
		
		et.begin();
		em.persist(a);
		em.persist(s);
		et.commit();
	}
}
