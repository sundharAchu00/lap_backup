package collectionInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A15 {
	public static void main(String[] args) {
		List ls=new ArrayList();
		ls.add(13.26);
		ls.add("jagan");
		ls.add(true);
		ls.add(78);
		ListIterator i=ls.listIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("*****************");
		while (i.hasPrevious()) {
			System.out.println(i.previous());
			
		}
	}
}
