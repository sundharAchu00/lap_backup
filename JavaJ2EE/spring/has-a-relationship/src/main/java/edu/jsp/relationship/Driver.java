package edu.jsp.relationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		
	    Person p = (Person) context.getBean("p1");
	    
	    Address a = p.getA1();
	    System.out.println(a);
	}
}
