package arraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class P3 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,8,9};
		System.out.println(Arrays.toString(a));
		System.out.println("Enter How Many Rotations");
		int n=s.nextInt();
		for (int i = 0; i < n; i++) {
			int first=a[0];
			for (int j = 0; j < a.length-1; j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		System.out.println(Arrays.toString(a));
	}
}
