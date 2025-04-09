package edu.jsp.vehicleDetails;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		UserDetails u = new UserDetails();
		u.setName("Sundhar Raj");
		VeicleDetails v = new VeicleDetails();
		v.setDriving_liecense_no(12345);
		v.setColor("Aqua Blue");
		v.setPrice(89000);
		v.setvName("MT-15");
		v.setU(u);
		u.setV(v);
		
		et.begin();
		em.persist(v);
		em.persist(u);
		et.commit();
	}
}
