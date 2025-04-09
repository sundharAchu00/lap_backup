package edu.jsp.working;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Company c1 = context.getBean("company", Company.class);

		c1.e1.designation();
		c1.e1.salary();

		System.out.println("-----------------------------");

		c1.e2.designation();
		c1.e2.salary();
	}
}
