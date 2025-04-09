package collectionInterface;

import java.util.ArrayList;
import java.util.Collections;

public class SortCollectionObject {
	public static void main(String[] args) {
		
		ArrayList<Laptop> lap = new ArrayList<Laptop>();
		
		lap.add(new Laptop("acer",27000,001));
		lap.add(new Laptop("HP",35000,002));
		lap.add(new Laptop("Microsoft",90000,003));
		lap.add(new Laptop("Dell",29000,004));
		
		System.out.println(lap);
		Collections.sort(lap);
		System.out.println(lap);
	}
}
