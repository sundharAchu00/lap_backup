package collectionInterface;

import java.util.ArrayList;

public class P1 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add("hello"); 
		ls.add(23456);
		ls.add(null);
		ls.add(12.89);
		ls.add("jagan");
		System.out.println(ls);
		ls.set(4, "vetri maran");
//		System.out.println(ls);
//		ls.remove(0);
//		ls.remove(null);
//		System.out.println(ls);
//		ls.clear();
//		System.out.println(ls);
//		System.out.println(ls.size());
//		for (int i = 0; i < ls.size(); i++) {
//			System.out.println(ls.get(i));
//		}
		
		for (Object i : ls) {
			System.out.println(i);
		}
		
	}
}
