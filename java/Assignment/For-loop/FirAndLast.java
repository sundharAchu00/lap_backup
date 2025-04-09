import java.util.*;
class FirAndLast 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int extre_sum=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			if(num==i || i<=9)
			extre_sum+=i%10;
		}
		System.out.println("sum of First and last number is: "+extre_sum);
	}
}
