import java.util.*;
class Xylem 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a Multiple digit NUmber");
		int num=sc.nextInt();
		int extresum=0;
		int midsum=0;
		for (int i=num;i!=0 ; )
		{
			if(i==num || i<10)
			{
				extresum=extresum+i%10;
			}
			else
			{
				midsum=midsum+i%10;
			}
			i/=10;
		}

		System.out.println("The Extreme Sum Is : "+extresum);
		System.out.println("The Midle Sum Is : "+midsum);
		if (extresum==midsum)
		{
			System.out.println("The Given Number "+num+" : xylem");
		}
		else
		{
			System.out.println("The Given Number "+num+"is not a xylem");
		}
	}
}
