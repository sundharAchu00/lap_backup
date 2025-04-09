package edu.jsp.team;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	 public static void main(String[] args) {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("TeamConfig.xml");
		 
		 Team team = (Team) context.getBean("t1");
		 
		 System.out.println(team);
		 
		 System.out.println(team.getMap());
	}
}
