import java.util.*;
class PerNum 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int sum=0;
		for (int i=1;i<num ;i++)
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		}
		String res=sum==num?"the given number "+num+" is perfect":"the given number "+num+" is NOTperfect";
		System.out.println(res);
	}
}
