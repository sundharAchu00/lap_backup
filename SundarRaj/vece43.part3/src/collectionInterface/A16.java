package collectionInterface;

import java.util.ArrayList;
import java.util.Collections;

public class A16 {
	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList();
		ls.add(80);
		ls.add(32);
		ls.add(6);
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
		
	}
}
