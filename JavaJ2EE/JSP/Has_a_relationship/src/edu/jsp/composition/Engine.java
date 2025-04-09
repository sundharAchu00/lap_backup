package edu.jsp.composition;

public class Engine {

	String cc;
	String engine_number;

	public Engine(String cc, String engine_number) {

		this.cc = cc;
		this.engine_number = engine_number;
		System.out.println("I'm engine");
	}

}
