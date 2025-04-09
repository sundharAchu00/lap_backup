package exception;

public class B extends A {
	
	public void display()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		
		A a=new A();
		
		if(a instanceof B)
		{
			B b=(B)a;
		
			b.display();
		}
		
		System.out.println("bye");
	}

}
