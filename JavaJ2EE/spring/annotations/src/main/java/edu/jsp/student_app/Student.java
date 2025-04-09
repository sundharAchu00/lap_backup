package edu.jsp.student_app;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	public Student() {
		System.out.println("Object Created Successfully...");
	}
	
	public void m1() {
		System.out.println("Im from m1 method");
	}
}
