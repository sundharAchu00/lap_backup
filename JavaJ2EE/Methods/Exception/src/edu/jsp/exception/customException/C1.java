package edu.jsp.exception.customException;

import java.util.*; 

public class C1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Your Age");
		int u_age=sc.nextInt();
		if (u_age > 18) {
			try {
			throw new InvalidException("Your Eligible to Vote");
			}catch (InvalidException e) {
				System.out.println(e.getMessage());
			}
		} else {
			try {
			throw new InvalidException("Your Not Eligible to Vote");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
