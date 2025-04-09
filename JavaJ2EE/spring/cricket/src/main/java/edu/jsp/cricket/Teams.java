package edu.jsp.cricket;

import java.util.List;

public class Teams {
	
	private int id;
	private String name;
	private String owner;
	private String color;
	private int no_of_players;
	
	private List<String> player_names;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNo_of_players() {
		return no_of_players;
	}

	public void setNo_of_players(int no_of_players) {
		this.no_of_players = no_of_players;
	}

	public List<String> getPlayer_names() {
		return player_names;
	}

	public void setPlayer_names(List<String> player_names) {
		this.player_names = player_names;
	}

	@Override
	public String toString() {
		return "Teams [id=" + id + ", name=" + name + ", owner=" + owner + ", color=" + color + ", no_of_players="
				+ no_of_players + ", player_names=" + player_names + "]";
	}
	
	
	
}
