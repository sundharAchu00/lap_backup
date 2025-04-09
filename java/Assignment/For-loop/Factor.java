import java.util.*;
class Factor 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		System.out.println("The Factor Of The "+num+" are ");
		Thread.sleep(1000);
		for (int i=1;i<num ;i++)
		{
			if (num%i==0)
			{
				System.out.println(i);
			}
		}
		
	}
}
