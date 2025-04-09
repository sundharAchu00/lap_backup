package wrapperClass;

public class W1 {

	public static void main(String[] args) {
		int a=5;//storing 5 as value
		double b=78.90;
		//In all the Wrapper classes toString() is Overridded
		//the process of converting primitive type to non primitive is known as boxing
		//the process of converting Non-primitive type to primitive is known as Unboxing
		Integer ref=Integer.valueOf(a);//storing 5 as Object
		System.out.println(ref.toString());
		Double ref1=Double.valueOf(b);
		System.out.println(ref1.toString());
	}

}
