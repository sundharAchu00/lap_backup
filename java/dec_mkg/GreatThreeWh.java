import java.util.*;
class GreatThreeWh 
{	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{ 
		int count=1;
		while(count<=5)
		{
		System.out.println("Enter The Value For a : ");
		int a=sc.nextInt();
		System.out.println("Enter The Value For b : ");
		int b=sc.nextInt();
		System.out.println("Enter The Value For c : ");
		int c=sc.nextInt();
		int res= a>b?a:b;
		int largest=c>res?c:res;
		System.out.println("the largest number is :"+largest);
		count++;
		}
		System.out.println("********Thank You*******\n");
	}
}
