package Abstraction;

abstract class Buhari{
	Buhari(){}
	public abstract void Briyani();
}
class Chef extends Buhari{
	Chef(){}
	public void Briyani() {
		System.out.println("Briyani");
	}
}
public class EndUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buhari b=new Chef();
		b.Briyani();

	}

}
