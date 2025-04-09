package edu.jsp.Directors;

public class Movies {
	
	private String movie_name;
	private String hero_name;
	private String heroine;
	
	
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getHero_name() {
		return hero_name;
	}
	public void setHero_name(String hero_name) {
		this.hero_name = hero_name;
	}
	public String getHeroine() {
		return heroine;
	}
	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}
	@Override
	public String toString() {
		return "Movies [Movie_name=" + movie_name + ", hero_name=" + hero_name + ", heroine=" + heroine + "]";
	}
	
	
	

}
