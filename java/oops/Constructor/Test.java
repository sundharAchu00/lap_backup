class Test 
{
	static Test ref=new Test();
	static int a=50;
	public static void main(String[] args) 
	{
		ref.m1();
	}
	public void m1()
	{
		System.out.println(a);
		System.out.println(Test.a);
		System.out.println(ref.a);
	}
}
