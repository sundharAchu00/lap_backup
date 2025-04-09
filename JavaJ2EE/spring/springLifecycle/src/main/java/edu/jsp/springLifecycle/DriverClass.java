package edu.jsp.springLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		SpringLC s1 = context.getBean("springLC",SpringLC.class);
		
		s1.m1();
	}
}
