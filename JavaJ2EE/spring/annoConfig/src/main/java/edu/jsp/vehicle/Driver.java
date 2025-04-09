package edu.jsp.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

		public static void main(String[] args) {
			
			ApplicationContext context =  new AnnotationConfigApplicationContext(Config.class);
			
			Vehicle v = context.getBean("vehicle",Vehicle.class);
			
			System.out.println(v);
		}
}
