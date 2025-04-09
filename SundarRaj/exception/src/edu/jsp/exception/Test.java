package edu.jsp.exception;

public class Test {
	public static void main(String[] args) {
		
		try {
			int i=10/0;
			System.out.println(i);
		} catch (Exception e) {
//			System.out.println("you can't divide the number by Zero");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		System.out.println("hello");
	}
}
