package edu.jsp.methods;

public class DriverABC {
	A m1() {
		return new A();
	}
	B m2() {
		return new B();
	}
	C m3() {
		return new C();
	}
	public static void main(String[] args) {
		DriverABC m = new DriverABC();
		System.out.println(m);
		System.out.println(m.m1());
		System.out.println(m.m2());
		System.out.println(m.m3());
		System.out.println(m.m4(m));
	}
	
	DriverABC m4(DriverABC a) {
		return a;
	}
}
