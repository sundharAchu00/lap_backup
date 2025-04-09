package edu.jsp.test;

public class Number {

	private int id;
	private Long number;
	private String network;

	public Number(int id, Long number, String network) {
		
		this.id = id;
		this.number = number;
		this.network = network;
	}

	@Override
	public String toString() {
		return "Number [id=" + id + ", number=" + number + ", network=" + network + "]";
	}
	
	

}
