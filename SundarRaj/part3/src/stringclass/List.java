package stringclass;
import java.util.ArrayList;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;
import java.util.*;
public class List {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList();
		obj.add("dhoni");
		obj.add("ishant");
		obj.add("Virat");
		obj.add("Raina");
		
		Iterator i1=obj.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println(i1.hasNext());
	}

}
