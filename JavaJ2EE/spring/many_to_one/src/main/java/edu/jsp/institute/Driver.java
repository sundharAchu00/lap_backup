package edu.jsp.institute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("institute.xml");
		
		Institute i = (Institute) context.getBean("i1");
		
		System.out.println(i);
	}
}
