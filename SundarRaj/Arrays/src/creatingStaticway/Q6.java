package creatingStaticway;

import java.util.Arrays;

public class Q6 {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		
		int b[]=new int[a.length];
		System.out.println(Arrays.toString(b));
		
		for (int index = a.length-1,m=0; index>=0; index--) {
			b[m]=a[index];
			m++;
		}
		System.out.println(Arrays.toString(b));
	}
}
