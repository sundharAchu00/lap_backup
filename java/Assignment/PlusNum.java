import java.util.*;
class PlusNum 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		while (num>0)
		{
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("The sum of given Number By Digits is: "+sum);
	}
}
