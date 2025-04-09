package edu.jsp.bus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(Config.class);
		
		Bus b =  context.getBean("bus",Bus.class);
		
		System.out.println(b);
	}
}
