package numbersPrograms;

import java.util.Scanner;

public class PrimeOrNot {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		int num = s.nextInt();
		int count = 0;
		if (num == 0 || num == 1) {
			System.out.println("Neither Prime nor Composite");
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}
			if (count == 1) {
				System.out.println("The Given Number is not a Prime Number");
			} else {
				System.out.println("The Given Number is Prime Number");
			}
		}
	}
}
