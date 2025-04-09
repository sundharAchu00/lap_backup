package comparable;

public class Product implements Comparable<Product>{
	
	String name;
	Double price;
	int quantity;
	
	

	public Product(String name, Double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}



//	@Override
//	public int compareTo(Product o) {
//		return this.quantity-o.quantity;
//	}
	
	
//	@Override
//	public int compareTo(Product o) {
//		return this.name.compareTo(o.name);
//	}

	
	@Override
	public int compareTo(Product o) {
		
		return o.price.compareTo(this.price);
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
