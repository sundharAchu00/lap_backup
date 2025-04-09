package edu.jsp.studentAddress;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//one-to-one BiDirectional
public class FetchDrop {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		boolean b = true;
		
		do {
		System.out.println("\t\t\tSelect Options...");
		System.out.println("1.Fetch Details");
		System.out.println("2.Delete Details");
		System.out.println("3.Exit");
		switch (sc.nextInt()) {
		case 1:{
			
			Student s = em.find(Student.class, 1);
			System.out.println(s);
			System.out.println("---------------------");
			Address a = em.find(Address.class, 1);
			System.out.println(a);
			System.out.println("---------------------");
			break;}
		case 2:{
			Student s = em.find(Student.class, 1);
			Address a = em.find(Address.class, 1);
			if (s != null || a!=null) {
				et.begin();
				em.remove(s);
				em.remove(a);
				et.commit();
				System.out.println("deleted Successfully...");
			} else {
				System.out.println("Data not Found");
			}
			
			break;}

		case 3:{
			b=false;
			System.out.println("\t\t\tThank You..");
			break;}
		default:
			System.out.println("invalid input..");
			break;
		}
		} while (b);
		
	}
}
