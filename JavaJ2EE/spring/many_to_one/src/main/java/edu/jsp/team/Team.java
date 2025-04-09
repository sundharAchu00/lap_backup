package edu.jsp.team;

import java.util.Map;

public class Team {
	
	private String name;
	private int noOfPlayers;
	
	private Map<Integer, Players> map;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public Map<Integer, Players> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Players> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", noOfPlayers=" + noOfPlayers + ", map=" + map + "]";
	}
	
	
}
