package edu.jsp.relationship;

public class Person {
	
	private String name;
	private String gender;
	private int age;
	
	private Address a1;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getA1() {
		return a1;
	}

	public void setA1(Address a1) {
		this.a1 = a1;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", a1=" + a1 + "]";
	}
	
	
	
}
