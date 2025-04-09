package is_a_relaionship;

class m1{
	int a=5,b=10;
}
class m2 extends m1{
	int c=30;
	//m1 data=new m1();
	int d=a+b+c;
}
public class ineritance {
	public static void main(String[] args) {
		m2 ref=new m2();
		System.out.println(ref.d);
	}

}
