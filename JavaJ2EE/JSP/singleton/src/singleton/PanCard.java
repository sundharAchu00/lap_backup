package singleton;

public class PanCard {
	
	//declare private constructor
	private PanCard(){
		
	}
	
	//declare private static non primitive variable
	private static PanCard p;
	
	
	//create a public helper method to create Object for the class
	public static PanCard getInstance() {
		
		
		if (p == null) {
			p = new PanCard();
			return p;
		}
		
		return p;

	}

}
