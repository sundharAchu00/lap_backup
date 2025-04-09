package edu.jsp.hotel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("hotelConfig.xml");
		
		Hotel h = (Hotel) context.getBean("h1");
		
		System.out.println(h);
	}
}
