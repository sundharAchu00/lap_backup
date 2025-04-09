package arrays;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int rev[]=new int[a.length];
		for (int i = 0,m=a.length-1; i < rev.length; i++,m--) {
			rev[i]=a[m];
		}
		System.out.println("the reversed array is : "+Arrays.toString(rev));
	}

}
