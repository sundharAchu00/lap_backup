package upcasting;

class Animal{
	String sound,name,breed;
	Animal(){}
	Animal(String sound,String name,String breed){
		this.sound=sound;
		this.name=name;
		this.breed=breed;
	}
}
class cat extends Animal{
	String color,loyalty,loc;
	cat(){}
	cat(String color,String loyalty,String loc){
		super("Meow","jerry","bob tail");
		this.color=color;
		this.loyalty=loyalty;
		this.loc=loc;
	}
	public void doAnimal() {
		System.out.println("name :"+name);
		System.out.println("color :"+color);
		System.out.println("breed :"+breed);
		System.out.println("sound :"+sound);
		System.out.println("loyality :"+loyalty);
		System.out.println("location :"+loc);
		System.out.println("************************");
	}
}

class Dog extends Animal{
	String color,loyalty,loc;
	Dog(){}
	Dog(String color,String loyalty,String loc){
		super("bow..bow","zizy","bug");
		this.color=color;
		this.loyalty=loyalty;
		this.loc=loc;
	}
	public void doAnimal() {
		System.out.println("name :"+name);
		System.out.println("color :"+color);
		System.out.println("breed :"+breed);
		System.out.println("sound :"+sound);
		System.out.println("loyality :"+loyalty);
		System.out.println("location :"+loc);
		System.out.println("************************");
	}
}
public class BreedDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//upcasting child to parent
		Animal c=new cat("brown","Honest","chennai");
		Animal d=new Dog("black","loyal","chennai");
		//c.doAnimal();
		//d.doAnimal();
		//downcasting parent to child
		cat ref=(cat)c;
		ref.doAnimal();
		Dog ref1=(Dog)d;
		ref1.doAnimal();

	}

}
