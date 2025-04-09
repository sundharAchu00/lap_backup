package edu.jsp.person;

public class Address {

	private int id;
	private String street;
	private String city;
	private String state;

	public Address(int id, String street, String city, String state) {
		
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
