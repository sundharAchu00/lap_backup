package edu.jsp.company;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Value("Spiders")
	private String name;
	@Value("150")
	private int no_of_emp;
	@Autowired
	private Set<Jobs> jobs;
	@Autowired
	private List<Vehicles> vehicles;
	@Autowired
	private Map<Integer, Employees> employees;

	@Override
	public String toString() {
		return "Company [name=" + name + ", no_of_emp=" + no_of_emp + ", jobs=" + jobs + ", vehicles=" + vehicles
				+ ", employees=" + employees + "]";
	}

}
