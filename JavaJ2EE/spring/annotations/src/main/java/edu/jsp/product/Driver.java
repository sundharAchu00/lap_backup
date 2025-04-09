package edu.jsp.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.product.person.Person;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Product p = (Product) context.getBean("product");
		
//		p.addCard();
		
		Person person = context.getBean("person",Person.class);
		
		System.out.println(person);
	}
}
