package edu.jsp.autoWiring;

public class Bike {

	private String name;
	private String model;
	
	private Engine engine1;
	private Engine engine2;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine1() {
		return engine1;
	}
	public void setEngine1(Engine engine1) {
		this.engine1 = engine1;
	}
	public Engine getEngine2() {
		return engine2;
	}
	public void setEngine2(Engine engine2) {
		this.engine2 = engine2;
	}
	@Override
	public String toString() {
		return "Bike [name=" + name + ", model=" + model + ", engine1=" + engine1 + ", engine2=" + engine2 + "]";
	}

	
	
	
	
	
}
