import java.util.*;
class GivEvOdWh
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{
		int count=1;
		while (count<=5)
		{
		System.out.println("Enter The Number To Check Whether The Given Is ODD or EVEN :");
		int num=sc.nextInt();
		if (num>0)
		{
			if(num%2==0)
			{
				System.out.println("The Given Number "+num+" is positive even\n");
			}
			else
			{
				System.out.println("The Given Number "+num+" is positive odd\n");
			}
		}
		else
		{
			if(num%2==0)
			{
				System.out.println("The Given Number "+num+" is negative even\n");
			}
			else
			{
				System.out.println("The Given Number "+num+" is negative odd\n");
			}	
		}
		count++;
	   }
	   System.out.println("*********Thank you*********"+(char)3);
	}
}
