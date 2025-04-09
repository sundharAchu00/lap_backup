package edu.jsp.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDriver {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("EmpConfig.xml");

		Employee e1 = (Employee) context.getBean("employee1");

		System.out.println("ID : " + e1.getId());
		System.out.println("NAME : " + e1.getName());
		System.out.println("COMPANY : " + e1.getCom_name());
		System.out.println("SALARY : " + e1.getSalary());

		System.out.println("-----------------------------");

		Employee e2 = (Employee) context.getBean("employee2");

		System.out.println("ID : " + e2.getId());
		System.out.println("NAME : " + e2.getName());
		System.out.println("COMPANY : " + e2.getCom_name());
		System.out.println("SALARY : " + e2.getSalary());
	}
}
