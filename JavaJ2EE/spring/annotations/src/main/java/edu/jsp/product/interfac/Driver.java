package edu.jsp.product.interfac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.product.Config;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Zoo zoo = context.getBean("zoo",Zoo.class);
		zoo.animals.sound();
	}

}
