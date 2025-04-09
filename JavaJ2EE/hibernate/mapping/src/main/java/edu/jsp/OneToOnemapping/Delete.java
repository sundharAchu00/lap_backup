package edu.jsp.OneToOnemapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		AadharCard a  = em.find(AadharCard.class, 251204009667l)
		Person p = em.find(Person.class, 2);
		
		if (p != null) {
			et.begin();
			em.remove(p);
			et.commit();
			System.out.println("Data Deleted Successfully...");
		} else {
			System.err.println("Incorrect Input...");
		}
	}
}
