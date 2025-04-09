package edu.jsp.product.bike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Owner {

	@Value("Sundhar Raj")
	private String name;
	@Value("22")
	private int age;
	@Value("Chennai")
	private String city;

	@Autowired
	private Bike bike;

	@Override
	public String toString() {
		return "Owner [name=" + name + ", age=" + age + ", city=" + city + ", bike=" + bike + "]";
	}
	
	

}
