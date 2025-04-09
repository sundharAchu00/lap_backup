package edu.jsp.vehicle;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	@Value("TVS")
	private String compnay_name;
	@Value("tvs50")
	private String mode;
	@Value("green")
	private String color;
	@Value("50")
	private String cc;
	@Value("5000")
	private double price;

	@Autowired
	private Map<String, String> owner;

	@Override
	public String toString() {
		return "Vehicle [compnay_name=" + compnay_name + ", mode=" + mode + ", color=" + color + ", cc=" + cc
				+ ", price=" + price + ", owner=" + owner + "]";
	}

}
