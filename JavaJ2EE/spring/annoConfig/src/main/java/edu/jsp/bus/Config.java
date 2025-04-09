package edu.jsp.bus;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = {"edu.jsp.bus"})
public class Config {
	
	@Bean
	public List<Passeneger> passenegers() {
		
		Passeneger p = new Passeneger();
		p.setName("sundhar");
		p.setGender("male");
		p.setAge(22);
		p.setFrom("chennai");
		p.setTo("Virudhunagar");
		
		Passeneger p1 = new Passeneger();
		p1.setName("Srinivas");
		p1.setGender("male");
		p1.setAge(22);
		p1.setFrom("Erode");
		p1.setTo("Virudhunagar");
		
		ArrayList< Passeneger> pass =  new ArrayList<Passeneger>();
		pass.add(p);
		pass.add(p1);
		
		return pass;
		
	} 
}
