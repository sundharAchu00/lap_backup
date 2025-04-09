package edu.jsp.autoWiring;

public class Engine {
	
	private String cc;
	private String engineNumber;
	private String type;
	
	
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [cc=" + cc + ", engineNumber=" + engineNumber + ", type=" + type + "]";
	}
	
	
}
