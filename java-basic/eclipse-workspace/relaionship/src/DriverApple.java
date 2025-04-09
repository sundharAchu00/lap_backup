class Fruit{
	String origin;
	double price;
	Fruit(){}
	Fruit(String o,double pr){
		origin=o;
		price=pr;
	}
}
class Apple extends Fruit{
	String name,taste,color;
	Apple(String n,String co,String t,String or,double pri){
		super(or,pri);
		name=n;
		taste=t;
		color=co;
	}
	public void doA() {
		System.out.println(origin);
		System.out.println(price);
		System.out.println(name);
		System.out.println(color);
	}
}


public class DriverApple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******************");
		Apple ref=new Apple("Apple","red","sweet","kashmir",160);
		ref.doA();

	}

}
