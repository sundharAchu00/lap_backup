package practice;
import java.util.*;
interface SBIBank{
	String ifsc_code="SBIN000275";
	void deposit(double dep);
	void withdraw(double wd);
}
class Transaction implements SBIBank{
	public void deposit(double dep) {
		System.out.println("Deposited Amount is is : "+dep);
	}
	public void withdraw(double wd) {
		System.out.println("Withdrawal Amount is is : "+wd);
	}
}
public class BankDriver {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method 
		boolean b=true;
		System.out.println("\t\tWelcome to SBI Bank");
		SBIBank b1=new Transaction();
		do {
		System.out.println("1.Deposit\n2.Withdraw\n3.Exit");
		int n=s.nextInt();
		switch (n) {
		case 1: {
			System.out.println("Enter the Amount");
			double amtdep=s.nextDouble();
			b1.deposit(amtdep);
			break;}
		case 2: {
			System.out.println("Enter the Amount");
			double amtwd=s.nextDouble();
			b1.withdraw(amtwd);
			break;}
		case 3:{
			b=false;
			break;}
		default:
			System.out.println("Input out of range");
		}
		}while(b);
	}

}
