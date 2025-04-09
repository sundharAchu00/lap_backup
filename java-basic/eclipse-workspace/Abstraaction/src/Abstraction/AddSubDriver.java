package Abstraction;
abstract class CalciSupport{
	abstract int add(int a,int b);
	abstract int sub(int a,int b);
}
class Shambu extends CalciSupport{
	public int add(int a,int b) {
		return a+b;	
	}
	public int sub(int a,int b) {
		return a-b;	
	}
}
class Keerthi extends CalciSupport{
	public int add(int a,int b) {
		return a+b;	
	}
	public int sub(int a,int b) {
		return a-b;	
	}
}
public class AddSubDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalciSupport a1=new Shambu();
		System.out.println("add : "+a1.add(10,50)); 
		System.out.println("******************");
		System.out.println("Sub : "+a1.sub(10,50));
		System.out.println("******************");
		CalciSupport a2=new Shambu();
		System.out.println("add : "+a2.add(10,50));
		System.out.println("******************");
		System.out.println("Sub : "+a2.sub(10,50));
		System.out.println("******************");

	}

}
