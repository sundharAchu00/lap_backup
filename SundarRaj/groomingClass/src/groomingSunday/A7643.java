package groomingSunday;

import java.util.Arrays;
//import java.util.Iterator;

public class A7643 {
	public static void main(String[] args) {
		int a[]= {1,9,4,2,8};
		int temp = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("sorted array" +Arrays.toString(a));
	}
}
