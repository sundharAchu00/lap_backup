package edu.jsp.task;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonDriver {

	static Scanner sc = new Scanner(System.in);

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();

	public static void main(String[] args) {
		boolean b = true;
		System.out.println("\t\t\tWelcome to person database");
		// getting input from the user
		do {
			System.out.println("1.add person \n2.remove person \n3.view all employee \n4.remove all employee \n5.Exit ");
			PersonDriver p = new PersonDriver();
			switch (sc.nextInt()) {
			case 1:
				System.out.println(p.addPerson());
				break;

			case 2:
				System.out.println(p.removePerson());;
				break;

			case 3:
				p.viewAll();
				break;

			case 4:
				System.out.println(p.removeAll());
				break;
			case 5:
				b = false;
				System.out.println("Thank You...");
				break;

			default:
				System.out.println("Input MissMatch...");
				break;
			}
		} while (b);

	}
	
	public String addPerson() {
		Person person = new Person(); 
		et.begin();
		sc.nextLine();
		System.out.println("enter your name");
		person.setName(sc.nextLine());
		System.out.println("enter your age");
		person.setAge(sc.nextInt());
		System.out.println("enter your city ");
		person.setCity(sc.next());
		em.persist(person);
		et.commit();
		
		return "Person details added sucessfully..!";
	}
	
	public String removePerson() {
		System.out.println("enter employee ID");
		Person p = em.find(Person.class, sc.nextInt());
		if (p != null) {
			System.out.println(p);
			et.begin();
			em.remove(p);
			et.commit();
			return "Removed Successfully...";
		} else {
			return "data not found";
		}
	}
	
	public void viewAll() {
		Query q = em.createQuery("select p from Person p");
		List<Person> p1 = q.getResultList();
		if (p1 != null) 
			System.out.println(p1);
		 else 
			System.out.println("No data found Empty table...");
	} 
	
	public String removeAll() {
		et.begin();
		Query q = em.createQuery("delete from Person");
		q.executeUpdate();
		et.commit();
		return "database cleared successfully...";
	} 

}
