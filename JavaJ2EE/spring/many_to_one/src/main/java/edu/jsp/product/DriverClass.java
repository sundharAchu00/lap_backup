package edu.jsp.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("productConfig.xml");
		
		Product p = (Product) context.getBean("p1");
		
		Product p1 = (Product) context.getBean("p2");
		
		System.out.println(p);
		System.out.println("------------------------------");
		
		System.out.println(p1);
	}
}
