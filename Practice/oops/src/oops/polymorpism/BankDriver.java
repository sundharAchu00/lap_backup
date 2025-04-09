package oops.polymorpism;

class Bank1{
	
	/* this is the small example method overloading having same name but differ in formal argument*/
	static void homeLoanROI(int roi) {
		System.out.println("the rate of intrest for home loan is : "+roi);
	}
	
	static void homeLoanROI(double roi) {
		System.out.println("the rate of intrest for home loan is : "+roi);
	}
	
	void ifscCode() {
		System.out.println("Bank1 ifsc : "+(int)(Math.random()*9999));
	}
}
class Bank2 extends Bank1{
	
	void ifscCode() {
		System.out.println("Bank2 ifsc : "+(int)(Math.random()*9999));
	}
}

public class BankDriver {
	
	public static void main(String[] args) {
		
		Bank1 b1 = new Bank1();
		b1.homeLoanROI(7);
		b1.ifscCode();
	}

}
