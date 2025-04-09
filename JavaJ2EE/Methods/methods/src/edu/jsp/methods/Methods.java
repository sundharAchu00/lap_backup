package edu.jsp.methods;

public class Methods {
	
	void m1() {
		System.out.println("Hi i'm m1 method ");
	}
	int m2() {
		return 2;
	}
	
	String m3() {
		return "Dinesh";
	}
	Object m4() {
		Methods m=new Methods();
		return m;
	}
	Methods m5() {
		return new Methods();
	}
}
