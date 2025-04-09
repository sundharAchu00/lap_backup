package comparable;

import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		
		TreeSet<Product> p = new TreeSet<Product>();
		
		Product p1 = new Product("apple", 95000.00, 16);
		Product p2 = new Product("samsung", 75000.00, 8);
		Product p3 = new Product("vivo", 55000.00, 10);
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		System.out.println(p);
	}
}
