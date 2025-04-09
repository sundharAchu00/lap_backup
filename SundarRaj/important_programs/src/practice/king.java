package practice;
interface Queen{
	int a=19;
	static void m2() {
		System.out.println("hello im m2 method");
	}
	void m1();
}
public class king implements Queen{
	int a=10;
	
	public void m1() {
		System.out.println("hello im service provider");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queen ref=new king();
		System.out.println(ref.a);//accessing using reference variable
		System.out.println(Queen.a);
		ref.m1();
		Queen.m2();                                                                        
	}
}
