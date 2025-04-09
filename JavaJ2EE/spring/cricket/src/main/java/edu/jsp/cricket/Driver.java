package edu.jsp.cricket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Teams t =  (Teams) context.getBean("team");
		
		System.out.println(t);
	}
}
