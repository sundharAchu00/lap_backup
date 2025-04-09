package arrays;

public class LaptopForArray {
	String name;
	double price;
	LaptopForArray(){}
	public LaptopForArray(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "\nLaptopForArray [name=" + name + ", price=" + price + "]";
	}
	
}
