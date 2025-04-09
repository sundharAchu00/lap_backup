package edu.jsp.Directors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieDriver {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("movieConfig.xml");
		
		Director director = (Director) context.getBean("dir");
		
		System.out.println(director);
		System.out.println("---------------------------------------------------------------");
		System.out.println(director.getMovies());
	}

}
