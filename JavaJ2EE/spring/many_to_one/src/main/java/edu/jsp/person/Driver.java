package edu.jsp.person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("personConfig.xml");
		
		Person p = (Person) context.getBean("p1");
		
		System.out.println(p);
	}
}
