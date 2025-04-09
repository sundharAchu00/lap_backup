package edu.jsp.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Animals a1 =  (Animals) context.getBean("a1");
		
		System.out.println(a1);
	}

}