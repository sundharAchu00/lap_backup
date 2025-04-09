package edu.jsp.composition;

public class Car {

	String name;
	String color;
	double price;

	Engine e;

	public Car(String name, String color, double price, Engine e) {

		this.name = name;
		this.color = color;
		this.price = price;
		this.e = e;
		
		System.out.println("I'm Car");
	}

}
