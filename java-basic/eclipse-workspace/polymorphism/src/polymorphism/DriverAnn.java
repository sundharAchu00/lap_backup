package polymorphism;

class Animal{
	Animal(){}
	public void Sound() {
		System.out.println("sound of the Animal");
	}
}
class Cat extends Animal{
	Cat(){}
	public void Sound() {
		System.out.println("meoww..");
	}
}
class Dog extends Animal{
	Dog(){}
	public void Sound() {
		System.out.println("Boww..Bow....");
	}
}
public class DriverAnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ref1=new Cat();
		Animal ref2=new Dog();
		ref1.Sound();
		ref2.Sound();
	}

}
