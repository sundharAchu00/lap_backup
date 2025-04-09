package edu.jsp.product;

public class Product {
	
	private String name;
	private double price;
	private double rating;
	private int quantity;
	
	private Brand brand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", rating=" + rating + ", quantity=" + quantity
				+ ", brand=" + brand + "]";
	}
	
	
	
}
