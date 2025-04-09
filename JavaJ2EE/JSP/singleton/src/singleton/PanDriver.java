package singleton;

public class PanDriver {
	
	public static void main(String[] args) {
		
		//creating multiple but it will return only the same object for multiple times
		//we are using singleton design pattern for memory management,creating only one instance of a class
		PanCard p = PanCard.getInstance();
		System.out.println(p);
		PanCard p1 = PanCard.getInstance();
		System.out.println(p1);
		PanCard p2 = PanCard.getInstance();
		System.out.println(p2);
	}
}
