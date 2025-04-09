package edu.jsp.product.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"edu.jsp.product.person"})
public class Config {
	
	@Bean
	@Qualifier("nam")
	public List<String> name(){
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("sundhar");
		al.add("Sathish");
		al.add("Ashok");
		
		return al;
		
	}
	@Bean
	@Qualifier("acc")
	public List<String> values(){
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Bike");
		al.add("Mobile");
		al.add("Earpones");
		
		return al;
		
	}
}
