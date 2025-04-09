package objectclass;

class Hi extends Object{
	int a;

	public Hi(int a) {
		super();
		this.a = a;
	}
	public boolean equals(Object o) {
		Hi ref=(Hi)o;
		if (this.a==ref.a) {
			return true;
		} else {
			return false;
		}
		
		
	}
}
public class Hello {
	public static void main(String[] args) {
		Hi ref=new Hi(5);
		Hi ref1=new Hi(5);
		System.out.println(ref.equals(ref1));
	}
}

