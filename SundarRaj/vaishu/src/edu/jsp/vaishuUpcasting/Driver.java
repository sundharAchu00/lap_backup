package edu.jsp.vaishuUpcasting;

public class Driver {
	public static void main(String[] args) {
		Upcasting u1 = new Upcasting1();
		System.out.println(u1.name);
		Upcasting1 u2 = (Upcasting1) u1;
		System.out.println();
		
	}
}
