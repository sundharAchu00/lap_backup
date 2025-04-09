package super_class;

class test1{
	int a,b;
	test1(){}
	test1(int a,int b){
		//L.I
		this.a=a;
		this.b=b;
	}
}
class test2 extends test1{
	int c,d;
	test2(){}
	test2(int c,int d,int a,int b){
		super(a,b);
		//L.I
		this.c=c;
		this.d=d;
//		this.a=a;
//		this.b=b;
	}
}
class test21 extends test2{
	int e,f;
	test21(){}
	test21(int e,int f,int a,int b,int c,int d){
		super(a,b,c,d);
		this.e=e;
		this.f=f;
	}
	public void doTest() {
		System.out.println("a "+a);
		System.out.println("b "+b);
		System.out.println("c "+c);
		System.out.println("d "+d);
		System.out.println("e "+e);
		System.out.println("f "+f);
	} 
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test21 t1=new test21(50,60,10,20,30,40);
		test21 t2=new test21(5,6,1,2,3,4);
		test2 t3=new test2(44,45,42,43);
		t1.doTest();
		System.out.println("******************");
		t2.doTest();
		System.out.println("******************");
		System.out.println("t21.a"+t3.a);
		System.out.println("t21.b"+t3.b);
		System.out.println("t21.c"+t3.c);
		System.out.println("t21.d"+t3.d);
	}
}
