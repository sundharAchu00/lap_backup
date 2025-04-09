package edu.jsp.working;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	@Autowired
	@Qualifier("emp1") 
	public Employees e1;
	
	@Autowired
	@Qualifier("emp2")
	public Employees e2;

}
