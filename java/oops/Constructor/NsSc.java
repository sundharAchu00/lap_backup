class  NsSc
{
	static NsSc ref=new NsSc();
	int a=10;
	static{
		System.out.println(ref.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hi I am from Main method");
		ref.m1();
	}
	public void m1()
	{
		System.out.println("Hi I am from m1 method");
	}
}
