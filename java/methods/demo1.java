import java.util.*;
class  demo1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t\t\tMethods...........");
		System.out.println("Enter a number to get factorial:");
		int num=sc.nextInt();
		num=factorial(num);
		System.out.println("factorial is :"+num);
	}
	public static int factorial(int a)
	{
		int fact=1;
		for (int i=1;i<=a ;i++ )
		{
			fact*=i;
		}
		return fact;
		
	}
}
