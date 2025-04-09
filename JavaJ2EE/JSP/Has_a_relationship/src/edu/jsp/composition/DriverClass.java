package edu.jsp.composition;

public class DriverClass {
	public static void main(String[] args) {
		
		Car c = new Car("AUDI", "Black", 4000000, new Engine("1500cc", "AUD98844101")); 
		
	}
}
