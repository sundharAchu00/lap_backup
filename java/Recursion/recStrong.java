import java.util.*;
class recStrong 
{
	static Scanner sc=new Scanner(System.in);
	static int digit=0,sum=0,fact=1,i=2,num;
	public static void main(String[] args) 
	{
		System.out.println("enter a number to find factorial");
		num=sc.nextInt();
		String res=Strong(num);
		System.out.println("the given number is "+res);
	}
	public static String Strong(int a)
	{
		if (a>0)
		{
			sum+=factorial(a%10);
			fact=1;i=2;
			Strong(a/10);
		}
		String s=(num==sum)?"Strong":"Not Strong";
		return s;
	}
	public static int factorial(int num)
	{
		if (num>=i)
		{
		fact*=i;
		i++;
		factorial(num);
		}
		return fact;
	}
}
