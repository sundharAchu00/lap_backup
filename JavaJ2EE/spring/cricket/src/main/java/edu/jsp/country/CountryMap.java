package edu.jsp.country;

import java.util.Map;

public class CountryMap {
	private String name;
	private String language;
	private String president;
	private String population;
	
	private Map<Integer,String> cities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public Map<Integer, String> getCities() {
		return cities;
	}

	public void setCities(Map<Integer, String> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "CountryMap [name=" + name + ", language=" + language + ", president=" + president + ", population="
				+ population + ", cities=" + cities + "]";
	}

	
	
	
	
	

}
