package edu.jsp.vehicle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"edu.jsp.vehicle"})
public class Config {

	@Bean
	public Map<String, String> owner(){
		Map<String, String> owners = new HashMap<String, String>();
		owners.put("TN 12 AF 8173", "SUNDHAR RAJ S");
		owners.put("TN 13 AF 4498", "SATHISH KUMAR E");
		
		return owners;
		
	}
}
