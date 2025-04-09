package edu.jsp.Directors;

import java.util.List;

public class Director {
	
	private String name;
	private int age;
	private String gender;
	
	private int no_of_movies;
	
	private List<Movies> movies;
	
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNo_of_movies() {
		return no_of_movies;
	}

	public void setNo_of_movies(int no_of_movies) {
		this.no_of_movies = no_of_movies;
	}

	public List<Movies> getMovies() {
		return movies;
	}

	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Director [name=" + name + ", age=" + age + ", gender=" + gender + ", no_of_movies=" + no_of_movies
				+ ", movies=" + movies + "]";
	}

	
	

}
