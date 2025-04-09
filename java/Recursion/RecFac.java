import java.util.*;
class RecFac 
{
	static Scanner sc=new Scanner(System.in);
	static int fact=1,i=2,num;
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to get factorial");
		int num=sc.nextInt();
		factorial(num);
		System.out.println("Factorial of the given number "+fact);
	}
	public static int factorial(int a)
	{
		if (a>=i)
		{
			fact*=a;
			factorial(a--);
		}
			return fact;
	}
}
