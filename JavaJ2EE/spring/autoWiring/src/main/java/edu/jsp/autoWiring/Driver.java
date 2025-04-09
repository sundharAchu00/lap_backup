package edu.jsp.autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("configBike.xml");
		
		Bike bike = (Bike) context.getBean("b1");
		
		System.out.println(bike);
	}
}
