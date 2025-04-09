package com.user_sb.model;

public class User {

	private int user_id;
	private String name;
	private String email;
	private int age;
	private String location;
	private boolean isActive;

	public User() {
	}

	public User(int user_id, String name, String email, int age, String location, boolean isActive) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.location = location;
		this.isActive = isActive;
	}

	public int getUserId() {
		return user_id;
	}

	public void setUserId(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", email=" + email + ", age=" + age + ", location="
				+ location + ", isActive=" + isActive + "]";
	}

}
