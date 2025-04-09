package edu.jsp.staffStu;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Staff st = new Staff();
		st.setName("Mohan");
		st.setSub("WebTech");
		
		Student s = new Student();
		s.setId(1);
		s.setName("sundhar");
		s.setS(st);
		Student s1 = new Student();
		s1.setId(2);
		s1.setName("Jerald");
		s1.setS(st);
		Student s2 = new Student();
		s2.setId(3);
		s2.setName("Gokul");
		s2.setS(st);
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(s);
		slist.add(s1);
		slist.add(s2);
		
		st.setS(slist);
		System.out.println(slist);
		
		et.begin();
		em.persist(st);
		et.commit();
	}
}
