package relavantzGrooming;

public class A1 {
	public static void main(String[] args) {
		int a=40,b=50,c=60;
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		a=a+b+c;
		b=a-c-b;
		c=a-b-c;
		a=a-b-c;
		
		
//		b=a+b+c-(a+);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
