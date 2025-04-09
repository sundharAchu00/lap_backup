package edu.jsp.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.jsp.product.bike.Bike;

@Configuration
@ComponentScan(basePackages = {"edu.jsp.product","edu.jsp.product.person","edu.jsp.product.bike","edu.jsp.product.interfac"})
public class Config {
	
	@Bean
	public List<String> names() {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Sundhar");
		a.add("Surya");
		a.add("jerald");
		a.add("aarti");
		a.add("Indhura");
		return a;
	}
	
	@Bean
	public Bike bike() {
		return new Bike();
		
	}
}
