package super_class;
//important program

class C{
	//states
	static int a=20;
	int b=10;
	static {
		System.out.println("Hi Ram");
	}
	{
		System.out.println("Hi Sita");
	}
	C(){
		//LI
	}
	C(int a){
		System.out.println("I'am PWI OF C para constaructor");
	}
	public static void test() {
	}
	public void demo() {}
}
class E extends C{
	static int c=50;
	int d=60;
	static {
		System.out.println("Hi Dinga");
	}
	{
		System.out.println("Hi Dingi");
	}
	E(){
	 super();
	 //LI
	}
	E(String s){
		super(45);
		System.out.println("Hi iam PWI of E Para Const");
	}
	public static void dinga() {}
	public void dingi() {}
}
public class D{
	static int a=10;
	int b=20;
	static {
		System.out.println("hi iam driver Smli");
	}
	{
		System.out.println("hi iam driver NSMLI");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		E ref=new E("java");
		System.out.println("Byee");
		System.out.println(ref);
	}
	public void manga() {
		
	}
}
