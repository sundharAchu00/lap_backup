package edu.jsp.person;

import java.util.Map;

public class Person {

	private int id;
	private String name;
	private Map<Integer, Address> map;

	public Person(int id, String name, Map<Integer, Address> map) {
		
		this.id = id;
		this.name = name;
		this.map = map;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", map=" + map + "]";
	}
	
	

}
