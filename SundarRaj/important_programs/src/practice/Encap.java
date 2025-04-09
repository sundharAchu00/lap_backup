package practice;

class Parent{
	int a=5;
	
}
class Child1 extends Parent{
	int b=6;
}
class Child2 extends Parent{
	int c=7;
}
public class Encap {
 public static void main(String[] args) {
	Parent ref=new Child1();
	Child2 ref2=(Child2)ref;
//	System.out.println(ref2.b);
}
}
