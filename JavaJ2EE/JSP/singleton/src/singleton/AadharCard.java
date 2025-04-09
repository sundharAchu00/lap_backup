package singleton;

public class AadharCard {

	int aid = 1234689;

	private AadharCard() {

	}
	
	private static AadharCard a;
	
	static {
		a = new AadharCard();
	}
	
	public static AadharCard getInstance() {
		
		return a;
		
	}
}
