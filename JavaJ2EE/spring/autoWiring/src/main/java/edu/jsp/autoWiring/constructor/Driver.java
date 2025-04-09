package edu.jsp.autoWiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("heartConfig.xml");
		
		Human human = (Human) context.getBean("h1");
		
		System.out.println(human);
		human.m1();
		
	}
}
