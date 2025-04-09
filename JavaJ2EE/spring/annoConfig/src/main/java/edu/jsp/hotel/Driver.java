package edu.jsp.hotel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Hotel h = context.getBean("hotel",Hotel.class);
		
		System.out.println(h);
	}
}
