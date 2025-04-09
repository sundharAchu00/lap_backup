//WAJP to copy one elements into Another element  
package creatingStaticway;

import java.util.Arrays;
import java.util.Iterator;

public class Q3 {
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int b[] =new int[a.length];
		System.out.println("a->"+Arrays.toString(a));
		System.out.println("b->"+Arrays.toString(b));
		
		for (int index = 0; index < a.length; index++) {
			b[index]=a[index];
		}
		System.out.println("a->"+Arrays.toString(a));
		System.out.println("b->"+Arrays.toString(b));
		
	}
}
