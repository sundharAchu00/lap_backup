import java.util.*;
class NumRev 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter a number to get the reverse of the number");
		int a=sc.nextInt();
		int rem;
		for (;a!=0; )
		{
			rem=a%10;
			System.out.print(rem);
			a/=10;
		}
	}
}
