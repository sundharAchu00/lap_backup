package interfaceclass;

interface Card {
	void CreditCard();
	void DebitCard();
}
class SBI implements Card{
	double roi;
	SBI(double roi){
		this.roi=roi;
	}
	
	@Override
	public void CreditCard() {
		System.out.println("this is SBI Credit Card rate of intrest"+roi);
		
	}

	@Override
	public void DebitCard() {
		System.out.println("this is SBI Debit Card");
	}
	
}

class ICICI implements Card{
	
	double roi;
	ICICI(double roi){
		this.roi=roi;
	}
	
	@Override
	public void CreditCard() {
		System.out.println("this is ICICI Credit Card rate of intrest"+roi);
		
	}

	@Override
	public void DebitCard() {
		System.out.println("this is ICICI Debit Card");
	}
	
}
