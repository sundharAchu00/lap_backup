import java.util.*;
class GivEvOd
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		int count=1
		while (count<=5)
		{
		System.out.println("Enter The Number To Check Whether The Given Is ODD or EVEN :");
		int num=sc.nextInt();
		if (num>0)
		{
			if(num%2==0)
			{
				System.out.println("The Given Number "+num+" is positive even");
			}
			else
			{
				System.out.println("The Given Number "+num+" is positive odd");
			}
		}
		else
		{
			if(num%2==0)
			{
				System.out.println("The Given Number "+num+" is negative even");
			}
			else
			{
				System.out.println("The Given Number "+num+" is negative odd");
			}	
		}
		count++;
	   }
	}
}
