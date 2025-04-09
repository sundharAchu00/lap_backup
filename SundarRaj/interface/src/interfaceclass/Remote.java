package interfaceclass;

public interface Remote {
	
	double price=500.55;
	void powerOff();
	void powerOn();
}
class Sony implements Remote{
	double remote_price=800.45;
	{
		System.out.println("********Powered by Sony********");
	}
	Sony(double price){
		remote_price=price;
	}
	public void powerOn() {
		System.out.println("Your Sony Tv is Switched ON");
	}
	public void powerOff() {
		System.out.println("Your Sony Tv is Switched OFF");
	}
}

class Epson implements Remote{
	double remote_price=1000.45;
	{
		System.out.println("********Powered by Epson********");
	}
	Epson(double price){
		remote_price=price;
	}
	public void powerOn() {
		System.out.println("Your Epson Tv is Switched ON");
	}
	public void powerOff() {
		System.out.println("Your Epson Tv is Switched OFF");
	}
}

class OnePlus implements Remote{
	double remote_price=1200.45;
	{
		System.out.println("********Powered by OnePlus********");
	}
	OnePlus(double price){
		remote_price=price;
	}
	public void powerOn() {
		System.out.println("Your OnePlus Tv is Switched ON");
	}
	public void powerOff() {
		System.out.println("Your OnePlus Tv is Switched OFF");
	}
}