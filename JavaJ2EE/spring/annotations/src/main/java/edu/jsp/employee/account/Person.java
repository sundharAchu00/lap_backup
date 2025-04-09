package edu.jsp.employee.account;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	@Qualifier("ib")
	public Account account1;
	@Autowired
	@Qualifier("sbi")
	public Account account2;
}
