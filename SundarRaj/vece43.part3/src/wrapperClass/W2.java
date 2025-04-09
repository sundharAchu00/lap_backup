package wrapperClass;

public class W2 {
	public static void main(String[] args) {
		long a=234678900;
		Long ref=Long.valueOf(a);//boxing
		System.out.println(ref);
		
		//unboxing
		Long ref1=ref.longValue();
		System.out.println(ref);
		
		Integer a1=10;//autoBoxing internally the compiler will call a1.valueOf()
		int a2=a1;//auto unboxing implicity without the help of intvalue()
		
	}
}
