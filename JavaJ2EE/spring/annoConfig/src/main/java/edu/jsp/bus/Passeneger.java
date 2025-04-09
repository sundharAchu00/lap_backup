package edu.jsp.bus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Passeneger {
	
	private String name;
	private int age;
	private String gender;
	private String from;
	private String to;
	
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	@Override
	public String toString() {
		return "Passeneger [name=" + name + ", age=" + age + ", gender=" + gender + ", from=" + from + ", to=" + to
				+ "]";
	}
	
	
	

}
