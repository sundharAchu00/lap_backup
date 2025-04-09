package edu.jsp.test;

public class Vehicle {

	private int id;
	private String name;
	private String color;
	private String number;

	public Vehicle(int id, String name, String color, String number) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", color=" + color + ", number=" + number + "]";
	}

	
	
}
