class A{
	int x=10;
	A(){}

}
class B extends A{
	int y=20;
	B(){}
}
public class DriverC extends B{
	int c=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriverC ref=new DriverC();
		B ref1=new DriverC();
		DriverC ref2=(DriverC)ref1;
		System.out.println(ref2.c);
		//downcasting implicitly
		//A ref3=new B();
		//B ref4=(B)ref3 ;
		ref.test();
	}
	public void test() {
		System.out.println(""+super.x);
		System.out.println(""+super.y);
	}

}
