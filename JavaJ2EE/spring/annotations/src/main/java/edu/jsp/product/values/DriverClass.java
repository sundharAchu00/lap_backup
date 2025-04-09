package edu.jsp.product.values;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.product.Config;

public class DriverClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
//		Employee employee = (Employee) context.getBean("employee");
		
		Employee employee  = context.getBean("employee",Employee.class);
		
		System.out.println(employee);
	}
}
