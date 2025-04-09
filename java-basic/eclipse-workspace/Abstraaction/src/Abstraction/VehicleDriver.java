package Abstraction;
abstract class Vehicle{
	int now;
	Vehicle(){}
	Vehicle(int now){
		this.now=now;
	}
	abstract public void noOfVehicles();
	abstract public void Wheels();
}
class Car extends Vehicle{
	Car(){
		super(4);
	}
	 public void noOfVehicles() {
		 System.out.println("Number of Vehicles is : one");
	 }
	 public void Wheels() {
		 System.out.println("Number of Wheels in a Vehicles is : "+now);
	 }
}
class Bike extends Vehicle{
	Bike(){
		super(2);
	}
	 public void noOfVehicles() {
		 System.out.println("Number of Vehicles is : one");
	 }
	 public void Wheels() {
		 System.out.println("Number of Wheels in a Vehicles is : "+now);
	 }
}
public class VehicleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Car();
		v1.Wheels();
		v1.noOfVehicles();
		Vehicle v2=new Bike();
		v2.Wheels();
		v2.noOfVehicles();
	}

}
