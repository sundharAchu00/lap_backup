package edu.jsp.OneToOnemapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = new Person();
		p.setName("sundhar");
		p.setAge(22);
		p.setGender("male");
		
		AadharCard a = new AadharCard();
		a.setAadharno(251204009667l);
		a.setAddress("Chennai");
		a.setDob("11-11-2000");
		a.setMob(7871356090l);
		
		p.setAadhar(a);
		
		et.begin();
		em.persist(p);
		et.commit();
	}
}
