package arrays;

import java.util.Arrays;
import java.util.Scanner;

//wajp to rotate the array right and left
public class Q14 {
	static Scanner s= new Scanner(System.in);

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Given Array is " + Arrays.toString(a));
		System.out.println("Enter the N value");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			int first = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
//				System.out.println("hello");
			}
			a[a.length - 1] = first;
		}
		System.out.println("The Result is :"+Arrays.toString(a));
	}

}
