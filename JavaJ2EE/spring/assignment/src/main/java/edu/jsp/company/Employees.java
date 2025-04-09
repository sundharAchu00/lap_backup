package edu.jsp.company;

import org.springframework.stereotype.Component;

@Component
public class Employees {

	private int id;
	private String name;
	private String job;
	private double sal;

	

	public Employees(int id, String name, String job, double sal) {
		this.id = id;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}



	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", job=" + job + ", sal=" + sal + "]";
	}

}
