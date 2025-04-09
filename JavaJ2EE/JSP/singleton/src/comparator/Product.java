package comparator;

public class Product {
	
	String name;
	Double price;
	int quantity;
	
	

	public Product(String name, Double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
