package edu.jsp.student_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
		
		Student student = (Student) context.getBean("student");
		
		student.m1();
	}
}
