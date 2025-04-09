package edu.jsp.flight;

public class Passenger {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	
	private Flight flight;

	public Passenger(int id, String name, int age, String gender, Flight flight) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", flight=" + flight
				+ "]";
	}
	
	
	
	
}
