package edu.jsp.product.bike;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	
	@Value("RX-100)")
	private String name;
	@Value("Black")
	private String color;
	
	@Override
	public String toString() {
		return "Bike [name=" + name + ", color=" + color + "]";
	}
	
	

}
