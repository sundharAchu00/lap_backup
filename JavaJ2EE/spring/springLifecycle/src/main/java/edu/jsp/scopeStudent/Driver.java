package edu.jsp.scopeStudent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("scopeConfig.xml");
		
		Student s = (Student)context.getBean("s1");
		Student s1 = (Student)context.getBean("s1");
		
		System.out.println(s);
		System.out.println(s1);
	}
}
