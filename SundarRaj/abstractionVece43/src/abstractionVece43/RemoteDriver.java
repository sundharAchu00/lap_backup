package abstractionVece43;

abstract class Remote{
	abstract void powerOn();
	abstract void powerOff();
	abstract void incVolume();
	abstract void decVolume();
}
class Epson extends Remote{

	@Override
	void powerOn() {
		System.out.println("Epson Giving Power On Feature");
	}

	@Override
	void powerOff() {
		System.out.println("Epson Giving Power Off Feature");
	}

	@Override
	void incVolume() {
		System.out.println("Epson Giving Increase Volume Feature");
	}

	@Override
	void decVolume() {
		System.out.println("Epson Giving Decrease Volume Feature");

	}
	
}
class Sony extends Remote{

	@Override
	void powerOn() {
		System.out.println("Sony Giving Power On Feature");
	}

	@Override
	void powerOff() {
		System.out.println("Sony Giving Power Off Feature");
	}

	@Override
	void incVolume() {
		System.out.println("Sony Giving Increase Volume Feature");
	}

	@Override
	void decVolume() {
		System.out.println("Sony Giving Decrease Volume Feature");

	}
	
}
public class RemoteDriver {

	public static void main(String[] args) {
		 Remote r1=new Epson();
		 Remote r2=new Sony();
		 r1.powerOn();
		 r1.incVolume();
		 r2.powerOn();
		 r1.powerOff();
	}

}
