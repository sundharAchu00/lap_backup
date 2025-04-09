package polymorphism;

public class Test {
	public static void dinga() {
		System.out.println("hello Java");
	} 
public static void dinga(int a) {
	System.out.println("hello SQL");	
	} 
public static void dinga(String a,int b) {
	System.out.println("hello JDBC");
	
} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dinga();
		dinga(4);
		dinga("sundar",6);
	}

}
