package super_class;

class Vehicle{
	String name;
	int no_of_wheel;
	Vehicle(){}
	Vehicle(int w,String n){
		no_of_wheel=w;
		name=n;
	}
}
class Bike extends Vehicle{
	String engine_type;
	double price;
	Bike(){}
	Bike(String e,double p,int wh,String na){
		super(wh,na);
		engine_type=e;
		price=p;
	}
	public void dobike() {
		System.out.println("name :"+name);
		System.out.println("number of wheels :"+no_of_wheel);
		System.out.println("type of engine :"+engine_type);
		System.out.println("price :"+price);
	}
}
class Car extends Vehicle{
	String engine_type;
	double price;
	Car(){}
	Car(String e,double p,int wh,String na){
		super(wh,na);
		engine_type=e;
		price=p;
	}
	public void docar() {
		System.out.println("name :"+name);
		System.out.println("number of wheels :"+no_of_wheel);
		System.out.println("type of engine :"+engine_type);
		System.out.println("price :"+price);
	}
}
public class DriverVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("D",500000,4,"BMW");
		Bike b=new Bike("P",200000,2,"MT-15");
		c.docar();
		System.out.println("******************");
		b.dobike();

	}

}
