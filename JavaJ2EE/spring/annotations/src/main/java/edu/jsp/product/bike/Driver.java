package edu.jsp.product.bike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.product.Config;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(Config.class);
		
		Owner owner = context.getBean("owner",Owner.class);
		
		System.out.println(owner);
	}

}
