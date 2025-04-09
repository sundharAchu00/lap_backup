package vaishu.wrapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Wrapper {
	
	public static void main(String[] args) {
		
//		int a = 5; //primitive data type
//		Integer b = (Integer)a;
//		int d = (int)b;
//		String t = "v";
//		int val1 = Integer.parseInt(t);
//		System.out.println(val1);
//		int d = ;
//		System.out.println(d);
//		Float C = 10.89F;
//		System.out.println();
		
		
//		int a[] = {1,2,3,4,5}; //way - 1
//		int b[] = new int[5]; //way - 2
//		int c[] = new int[]{1,2,3,4,5};// way - 3
		
		
		List vaishu = new ArrayList<>();
		
		vaishu.add("vaishu");
		vaishu.add(5);
//		System.out.println(vaishu.get(1));
		
//		for (int i = 0; i < vaishu.size(); i++) {
//			System.out.println(vaishu.get(i));
//		}
//		
		
//		for (Object o : vaishu) {
//			System.out.println(o);
//		}
		
		 Iterator i = vaishu.listIterator();
		 
		 while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
