package polymorphism;

class Test1{
	public void m1() {
		System.out.println("test");
	}
}
public class Demo extends Test {
	public void m1() {
		System.out.println("test");
	}
	public static void main(String[] args) {
		Demo t=new Demo();//example for run time polymorphism
		t.m1();
	}
}
