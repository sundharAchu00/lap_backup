package relavantzGrooming;

import java.util.Arrays;

public class A3 {
	public static void main(String[] args) {
		int a[]= {5,7,8,10,11,65,78,4};
		int largest=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]>a[j+1]) {
					largest=a[j];
					a[j]=a[j+1];
					a[j+1]=largest;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
