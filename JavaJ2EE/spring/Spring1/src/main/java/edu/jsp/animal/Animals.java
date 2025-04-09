package edu.jsp.animal;

public class Animals {
	
	private String name;
	private String gender;
	private String color;
	private String sound;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	@Override
	public String toString() {
		return "Animals [name=" + name + ", gender=" + gender + ", color=" + color + ", sound=" + sound + "]";
	}

	
	
}
