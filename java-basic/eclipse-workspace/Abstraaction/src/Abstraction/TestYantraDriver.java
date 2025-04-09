package Abstraction;
abstract class TestYantra{
	abstract public void designation();
}
class Engineer extends TestYantra{
	String name="sundhar",domain="Full-Stack";
	
	public void designation() {
		System.out.println("Name of the Employee : "+name);
		System.out.println("Domain of the Employee : "+domain);
		
	}
}
class Security extends TestYantra{
	String name="ramesh",domain="Security";
	
	public void designation() {
		System.out.println("Name of the Employee : "+name);
		System.out.println("Domain of the Employee : "+domain);
		
	}
}
public class TestYantraDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestYantra e1=new Engineer();
		e1.designation();
		System.out.println("******************");
		TestYantra e2=new Security();
		e2.designation();

	}

}
