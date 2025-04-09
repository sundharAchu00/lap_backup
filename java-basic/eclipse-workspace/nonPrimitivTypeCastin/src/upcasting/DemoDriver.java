package upcasting;
class p1{
	int a=10,b=20;
	p1(){}
}
class p2 extends p1{
	int c=30,d=40;
	p2(){}
}
class c1 extends p2{
	int e=50,f=60;
	c1(){}
}
public class DemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test t1=new Demo();
//		Demo t2=(Demo)t1;
//		System.out.println(t1.a);
//		System.out.println(t1.b);
//		System.out.println(t1.c);
//		System.out.println(t2.d);
//		System.out.println(t2.e);
//		System.out.println(t2.f);
		p1 ref1=new p2();//ab,..not access cd
		p2 ref2=(p2)ref1;//cdef...not acess ab
		p1 ref4=new c1();
		c1 ref3=(c1)ref4;//abcdef
		System.out.println(ref2.c);
		System.out.println(ref2.d);
		System.out.println(ref3.c);
		System.out.println(ref3.d);
		System.out.println(ref3.e);
	}

}
