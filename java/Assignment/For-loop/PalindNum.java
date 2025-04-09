import java.util.*;
class PalindNum 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		int num=sc.nextInt();
		int temp=num,rev=0;
		for (int i=num;i>0 ;i/=10 )
		{
			rev=(rev*10)+(i%10);
		}
		if (rev==num)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
}
