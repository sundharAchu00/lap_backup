package edu.jsp.product.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	@Qualifier("acc")
	public List<String> names;
	
	@Autowired
	@Qualifier("acc")
	public List<String> product;
	
	
}
