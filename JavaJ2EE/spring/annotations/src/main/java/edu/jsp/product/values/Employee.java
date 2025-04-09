package edu.jsp.product.values;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("1")
	private int id;
	@Value("Sundhar Raj")
	private String name;
	@Value("Developer")
	private String job;
	@Value("Chennai")
	private String loc;
	@Value("35000")
	private String sal;

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", loc=" + loc + ", sal=" + sal + "]";
	}


}
