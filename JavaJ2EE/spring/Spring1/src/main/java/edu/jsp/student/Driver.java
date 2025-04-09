package edu.jsp.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Student s = (Student) context.getBean("s1");
		System.out.println(s);
//		
//		Object o = applicationContext.getBean("s2");
//		Student s1 = (Student) o;
//		System.out.println(s1);
		
//		Demo d = (Demo) context.getBean("d");
//		
//		d.m1();
		
		
		
	}
}
