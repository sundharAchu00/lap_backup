package practice;

public class Q1 {
	int a=7;
	
	static void access() {
		Q1 ref=new Q1();
		System.out.println(ref.a);
	}
	public static void main(String[] args) {
		access();
	}
}
