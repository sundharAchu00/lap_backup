package edu.jsp.springLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		SpringLC s1 = (SpringLC) context.getBean("s1");
		SpringLC s2 = (SpringLC) context.getBean("s1");
		
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
