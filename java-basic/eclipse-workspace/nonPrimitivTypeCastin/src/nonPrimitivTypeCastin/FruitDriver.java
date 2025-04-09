package nonPrimitivTypeCastin;

class Fruit{
	String origin="ooty";
	double price=156;
	String taste="sweet";
}
class Apple extends Fruit{
	String color="red",name="Apple";
}
public class FruitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//white box testing purpose
		//non primitive
		Fruit f1=new Apple();
		System.out.println(f1.taste);
		//System.out.println(f1.color);//C.T.E because it is not visible to fruit(parent).
		//Apple a1=(Apple)new Fruit();
		//System.out.println(a1.color);
	}

}
