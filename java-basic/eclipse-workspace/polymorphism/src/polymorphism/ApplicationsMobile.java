package polymorphism;

class PlayStore{
	String name;
	PlayStore(){}
	PlayStore(String na){
		name=na;
	}
	public void status() {
		System.out.println("Appname"+name);
	}
}
class Whatsapp extends PlayStore{
	String name;
	Whatsapp(){}
	Whatsapp(String n){
		super("play_Store");
		name=n;
	}
	public void status() {
		System.out.println("Appname "+name);
	}
}
class Insta extends PlayStore{
	String name;
	Insta(){}
	Insta(String n){
		super("play_Store");
		name=n;
	}
	public void status() {
		System.out.println("Appname "+name);
	}
}
public class ApplicationsMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayStore ref=new Whatsapp("WhatsApp");
		ref.status();
		PlayStore ref1=new Whatsapp("Insta");
		ref1.status();
	}

}
