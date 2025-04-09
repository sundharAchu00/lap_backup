package edu.jsp.appUser;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDriver {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		
//		
//		Users u = new Users();
//		u.setDob("10-11-2002");
//		u.setPassword("12345");
//		u.setUname("Hari");
//		
//		Users u1 = new Users();
//		u1.setDob("07-11-2001");
//		u1.setPassword("12345");
//		u1.setUname("Yadesh");
//		
//		Users u2 = new Users();
//		u2.setDob("11-11-2000");
//		u2.setPassword("12345");
//		u2.setUname("sundhar");
//		
//		ArrayList<Users> ul = new ArrayList<Users>();
//		ul.add(u);
//		ul.add(u1);
//		ul.add(u2);
//		
//		Application a = new Application();
//		a.setName("whatsApp");
//		a.setVersion(2.0);
//		a.setUsers(ul);
//		
//		et.begin();
//		em.persist(a);
//		et.commit();
//		System.out.println("Connection Successfull...");
		
		Application ap =  em.find(Application.class, 1);
		System.out.println(ap);
	}
}
