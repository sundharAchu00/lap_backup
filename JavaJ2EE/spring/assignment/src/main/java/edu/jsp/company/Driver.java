package edu.jsp.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(Config.class);
		
		Company c  = context.getBean("company",Company.class);
		
		
		System.out.println(c);
	}
}
