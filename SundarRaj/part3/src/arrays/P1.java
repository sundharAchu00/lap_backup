package arrays;

//import java.util.Arrays;
import java.util.Scanner;

public class P1 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size");
		int n=s.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter "+ (i+1 )+" value ");
			arr[i]=s.nextInt();
		}
//		System.out.println(Arrays.toString(arr));
		System.out.println("The Stored Elements are");
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
