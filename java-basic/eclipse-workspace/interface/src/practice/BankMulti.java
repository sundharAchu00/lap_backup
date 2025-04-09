package practice;
interface Bank{
	String loc="Bnglore";
	void deposit(double a);
	void withdraw(double b);
}
class ICICI implements Bank{
	String acc_name;
	long acc_no;
	double bal;
	ICICI(){}
	ICICI(String nam,long no){
		acc_no=no;
		acc_name=nam;
	}
	@Override
	public void deposit(double a) {
		bal+=a;
		System.out.println("Deposited succesfully......."+a);
		System.out.println("available  balance : "+bal);
		System.out.println("**************************");
	}
	@Override
	public void withdraw(double w) {
		if(bal>=w) {
			bal-=w;
			System.out.println("withdraw successfully......");
			System.out.println("available  balance : "+bal);
		System.out.println("**************************");}
		else {
			System.out.println("insufficient balance.... ");
			System.out.println("available  balance : "+bal);
			System.out.println("**************************");}
	}
	public void depOfAcc() {
		System.out.println("Name :"+acc_name);
		System.out.println("Account Number :"+acc_no);
		System.out.println("Account Balance :"+bal);
		System.out.println("Locattion :"+loc);
		System.out.println("**************************");
	}
}

public class BankMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank ref=new ICICI("sundhar",787887870968l);
		ICICI ref1=(ICICI)ref;
		ref1.depOfAcc();
		ref.deposit(500);
		ref.withdraw(5000);

	}

}
