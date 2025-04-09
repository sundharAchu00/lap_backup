package groomingSunday;

import java.util.Scanner;

public class P4 {
	static Scanner s = new Scanner(System.in);
	static int limit = 18;

	public static void main(String[] args) {
		System.out.println("Enter your Age :");
		int age = s.nextInt();	//22

		try {
			limitAge(age);
		} catch (P4E e) {
			System.out.println(e);
		}

	}

	public static void limitAge(int a) throws P4E {
		if (a >= limit) {

			throw new P4E("eligible");
		} else {
			System.out.println("Your Not Eliigible to Vote....!!!");
		}
	}
}
