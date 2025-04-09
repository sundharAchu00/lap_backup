package edu.jsp.scopeAnnEmployee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
		
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Employee e = context.getBean("employee",Employee.class);
		Employee e1 = context.getBean("employee",Employee.class);
		
		System.out.println(e);
		System.out.println(e1 );
	}
	
	
}
