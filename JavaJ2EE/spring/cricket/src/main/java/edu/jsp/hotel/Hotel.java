package edu.jsp.hotel;

import java.util.Set;

public class Hotel {

	private String hotel_name;
	private String loc;
	private double rating;
	private String type;
	
	private Set<String> dishes;

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<String> getDishes() {
		return dishes;
	}

	public void setDishes(Set<String> dishes) {
		this.dishes = dishes;
	}

	@Override
	public String toString() {
		return "Hotel [hotel_name=" + hotel_name + ", loc=" + loc + ", rating=" + rating + ", type=" + type
				+ ", dishes=" + dishes + "]";
	}
	
	
	
}
