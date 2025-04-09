package polymorphism;

class Bank{
	int rofintrest;
	Bank(){}
	public int RateOfIntrest() {
		return 13;
	}
}
class SBI extends Bank{
	SBI(){}
	public int RateOfIntrest() {
		return 7;
	}
}
class ICICI extends Bank{
	ICICI(){}
	public int RateOfIntrest() {
		return 12;
	}
}
class CityBank extends Bank{
	CityBank(){}
	public int RateOfIntrest() {
		return 15;
	}
}
public class BankDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Bank b1=new SBI();
		System.out.println("SBI "+b1.RateOfIntrest());
		System.out.println("***************");
		Bank b2=new ICICI();
		System.out.println("ICICI "+b2.RateOfIntrest());
		System.out.println("***************");
		Bank b3=new CityBank();
		System.out.println("CityBank "+b3.RateOfIntrest());
		System.out.println("***************");
	}
}
