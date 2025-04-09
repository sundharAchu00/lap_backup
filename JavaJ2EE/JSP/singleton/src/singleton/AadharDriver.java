package singleton;

public class AadharDriver {
	public static void main(String[] args) {
		
		
		AadharCard a = AadharCard.getInstance();
		System.out.println(a);
		System.out.println(a.aid);
		System.out.println("==========================");
		AadharCard a1 = AadharCard.getInstance();
		System.out.println(a1);
		System.out.println(a1.aid);
		System.out.println("==========================");
		
		AadharCard a2 = AadharCard.getInstance();
		System.out.println(a2);
		System.out.println(a2.aid);
		System.out.println("==========================");
	}
}
