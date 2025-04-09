package comparator;

import java.util.Comparator;

public class SortDescBasedOnQuantity implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o2.quantity-o1.quantity;
	}

}
