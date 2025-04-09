package edu.jsp.vehicleDetails;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



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
		System.out.println("3.exit");
		
		switch (sc.nextInt()) {
		case 1:{
			UserDetails u = em.find(UserDetails.class, 1);
			
			System.out.println(u);
			System.out.println("------------------------");
			System.out.println(u.getV());
			
			break;}
		case 2:{
			UserDetails u = em.find(UserDetails.class, 1);
			if (u != null) {
				et.begin(); 
				em.remove(u);
				em.remove(u.v);
				et.commit();
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
