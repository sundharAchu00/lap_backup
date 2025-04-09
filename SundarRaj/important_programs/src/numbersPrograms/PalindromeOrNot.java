package numbersPrograms;

import java.util.Scanner;

class PalindromeOrNot {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int num = s.nextInt(),rev=0,temp=num;
		while(num > 0) {
			rev=rev*10+(num%10);
			num/=10;
		}
		if (temp==rev) {
			System.out.println("The Number Is Palindrome");
		} else {
			System.out.println("The Number Is Not a Palindrome");
		}
	}
}