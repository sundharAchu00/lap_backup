interface Hii{
	static public void jagan(){
		System.out.println("hello form static metod from interface");
	}
	public void jagan1();
}
public class Hello implements Hii {
	public void jagan1() {
		System.out.println("hello nsm from interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hii h1=new Hello();
		h1.jagan1();

	}

}
