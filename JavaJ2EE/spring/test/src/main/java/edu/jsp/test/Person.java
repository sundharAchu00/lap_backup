package edu.jsp.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

	private int id;
	private String name;
	private int age;

	private Map<String, BankAcc> bankAccs;
	private Set<Number> numbers;
	private List<Vehicle> vehicles;

	public Person(int id, String name, int age, Map<String, BankAcc> bankAccs, Set<Number> numbers,
			List<Vehicle> vehicles) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.bankAccs = bankAccs;
		this.numbers = numbers;
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", bankAccs=" + bankAccs + ", numbers="
				+ numbers + ", vehicles=" + vehicles + "]";
	}
	
	

}
