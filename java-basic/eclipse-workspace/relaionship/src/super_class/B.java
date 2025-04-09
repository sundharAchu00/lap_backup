package super_class;
class A{
	int a=10,b=20;
	{
		System.out.println("hi im parent nsmli");
	}
	A(){
		System.out.println("Sanga");
	}
}
public class B extends A{
	int c=10,d=20;
	{
		System.out.println("hi im Child nsmli");
	}
	B(){
		System.out.println("Sangi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B();
	}

}
