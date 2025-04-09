package interfaceclass;

public class RemoteDriver {

	public static void main(String[] args) {
		
		Remote ref=new Sony(99.45);
//		Sony sony=(Sony)ref;
		ref.powerOff();
		System.out.println(ref.price);
	}

}
