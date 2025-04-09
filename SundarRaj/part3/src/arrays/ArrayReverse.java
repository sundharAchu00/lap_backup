package arrays;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int rev[]=new int[arr.length];
		int j=0;
		for (int i = rev.length-1; i >= 0 ; i--) {
			rev[j]=arr[i];
			j++;
		}
		System.out.println(Arrays.toString(rev));
	}

} 