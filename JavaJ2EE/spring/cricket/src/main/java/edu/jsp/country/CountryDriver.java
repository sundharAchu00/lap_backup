package edu.jsp.country;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("countryConfig.xml");
		
		CountryMap c1 = (CountryMap) context.getBean("c1");
		
		System.out.println(c1);
	}
}
