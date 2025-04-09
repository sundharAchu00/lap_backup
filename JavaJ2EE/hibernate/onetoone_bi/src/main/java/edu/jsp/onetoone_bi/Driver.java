package edu.jsp.onetoone_bi;

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
		p.setName("Sundhar Raj");
		p.setGender("male");
		p.setBloodgroup("O+");
		p.setAge(22);
		PanCard pc = new PanCard();
		pc.setAddress("chennai");
		pc.setDob("11/11/2000");
		pc.setMobile_no(7871356090l);
		pc.setPan_no("MTAPS6964C");
		pc.setP(p);
		p.setP(pc);
		
		et.begin();
		em.persist(pc);
		em.persist(p);
		et.commit();
		System.out.println("Data Inserted Successfully...");
	}
}
