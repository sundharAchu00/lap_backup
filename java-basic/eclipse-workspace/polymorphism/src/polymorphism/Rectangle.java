package polymorphism;

class shape{
	public void draw() {
		System.out.println("hii i am driver");
	}
}
public class Rectangle extends shape{
	@Override
	public void draw() {
		System.out.println("hii i am driver child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s= new Rectangle();
		s.draw();
	}
}
