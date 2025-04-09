package edu.jsp.autoWiring.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("stateConfig.xml");
		
		State state = (State) context.getBean("s1");
		
		System.out.println(state);
	}
}
