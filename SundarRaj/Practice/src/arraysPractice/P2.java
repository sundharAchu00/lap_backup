package arraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class P2 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {89,23,12,45,56,67,19,38};
		int b[]=new int [a.length];
		Arrays.sort(a);
		int j=0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i]!=a[i+1]) 
				b[j++]=a[i];
		}
		b[j++]=a[a.length-1];
		int result[]=new int[j];
		for (int i = 0; i < j; i++) {
			result[i]=b[i];
		}
//		System.out.println(Arrays.toString(result));
		System.out.println("Select the Input..");
		System.out.println("1.nth Largest\n2.Nth largest");
		int n=s.nextInt();
		switch (n) {
		case 1:{
			System.out.println("enter the n vlaue");
			int n1=s.nextInt();
			System.out.println(n+"th largest is "+result[result.length-n1]);
			break;}
		case 2:{
			System.out.println("enter the n vlaue");
			int n1=s.nextInt();
			System.out.println(n+"th Smallest is "+result[n1-1]);
			break;}

		default:{
			System.out.println("input not valid...");
			break;}
		}
	}
}
