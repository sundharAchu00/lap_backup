package edu.jsp.hotel;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "edu.jsp.hotel" })
public class Config {
	@Bean
	public Set<String> m1() {

		Set<String> dishes = new HashSet<String>();
		dishes.add("kari dosai");
		dishes.add("Chicken Biriyani");
		dishes.add("mutton sukka");

		return dishes;

	}
}
