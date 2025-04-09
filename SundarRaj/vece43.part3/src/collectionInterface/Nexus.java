package collectionInterface;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Iterator;
import java.util.List;

public class Nexus {
	public static void main(String[] args) {
		List items=new ArrayList();
		items.add(new Product("Orange",125,001));
		items.add(new Product("Shoes",800,002));
		items.add(new Product("T-shirt",400,004));
		items.add(new Product("Knife",2000,003));
		for (Object o : items) {    
			Product p=(Product)o;
			if (p.price >= 500) {
				System.out.println(p);
			}
		}
	}
}
