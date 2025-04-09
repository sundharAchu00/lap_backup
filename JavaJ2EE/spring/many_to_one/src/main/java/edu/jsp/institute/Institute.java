package edu.jsp.institute;

import java.util.List;

public class Institute {
	
	private int id;
	private String name;
	private String ceo;
	
	
	private List<Branches> branches;


	public Institute(int id, String name, String ceo, List<Branches> branches) {
		
		this.id = id;
		this.name = name;
		this.ceo = ceo;
		this.branches = branches;
	}


	@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", ceo=" + ceo + ", branches=" + branches + "]";
	}
	
	
	
}
