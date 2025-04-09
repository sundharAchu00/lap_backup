import java.util.*;
class DigSum 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int dig=0;
			for (int i=num;i>0;i/=10)
				dig+=i%10;
				System.out.println("the digital sum is "+dig);
	}
}
