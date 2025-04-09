package edu.jsp.flight;

public class Flight {

	private int id;
	private String name;
	private String from;
	private String to;
	private String pilot;


	public Flight(int id, String name, String from, String to, String pilot) {
		this.id = id;
		this.name = name;
		this.from = from;
		this.to = to;
		this.pilot = pilot;
	}



	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", from=" + from + ", to=" + to + ", pilot=" + pilot + "]";
	}

}
