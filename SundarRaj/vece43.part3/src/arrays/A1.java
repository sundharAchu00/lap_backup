package arrays;

import java.util.Arrays;

public class A1 {

	public static void main(String[] args) {
		int a[]=new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(Arrays.toString(a));
		a[0]=10;
		a[1]=20;
		a[2]=25;
		a[3]=18;
		System.out.println(a[0]);
		System.out.println(a[3]);
		System.out.println(a[2]);
		System.out.println(a[1]);
		System.out.println(a[0]);
		System.out.println(Arrays.toString(a));
	}

}
