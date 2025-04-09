package arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int b[]=new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i]=a[i];
		}
		System.out.println("The elements a[] = "+Arrays.toString(a));
		System.out.println("The elements b[] = "+Arrays.toString(b));
	}

}
