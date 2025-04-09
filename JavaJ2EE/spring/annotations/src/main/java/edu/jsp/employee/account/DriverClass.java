package edu.jsp.employee.account;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Person person = context.getBean("person",Person.class);
		
		person.account1.deposit();
		person.account1.withdraw();
		System.out.println("----------------------------------");
		person.account2.deposit();
		person.account2.withdraw();
	}
}
