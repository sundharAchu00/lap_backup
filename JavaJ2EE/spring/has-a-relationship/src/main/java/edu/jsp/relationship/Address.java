package edu.jsp.relationship;

public class Address {
	
	private String street_name;
	private String city;
	private String state;
	
	private int pincode;

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [street_name=" + street_name + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ "]";
	}
	
	
}
