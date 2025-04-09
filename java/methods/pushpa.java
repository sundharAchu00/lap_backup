import java.util.*;
class  pushpa
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Hello From Main");
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		int b=plus(num);
		System.out.println("result1 : "+b);
		String x="hello",y="java",z;
		z=plus(x,y);
		System.out.println("result2 : "+z);
		System.out.println("Byee From Main");
	}
	public static int plus(int a)
	{
		return a+(int)10.5;
	}
	public static String plus(String a,String b)
	{
		return a+b;
	}
}
