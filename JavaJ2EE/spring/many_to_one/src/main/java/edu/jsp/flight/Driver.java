package edu.jsp.flight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
		
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("flightConfig.xml");
		
		Passenger p1 = (Passenger) context.getBean("p1");
    	Passenger p2 = (Passenger) context.getBean("p2");
		Passenger p3 = (Passenger) context.getBean("p3");
		Flight f = (Flight) context.getBean("f1");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(f);
	}
}
