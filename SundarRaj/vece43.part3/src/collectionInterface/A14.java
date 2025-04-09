package collectionInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A14 {
	public static void main(String[] args) {
		List ls=new ArrayList();
		ls.add(10);
		ls.add(12.39);
		ls.add("sundhar");
		ls.add(true);
		Iterator i=ls.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.hasNext());
	}
}
