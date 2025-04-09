package interfaceclass;

public class CreditBankDriver {

	public static void main(String[] args) {
		
		Card sb1=new SBI(14.5);
		Card ic1=new ICICI(19.3);
		sb1.CreditCard();
		sb1.DebitCard();
		ic1.CreditCard();
		ic1.DebitCard();
	}

}
