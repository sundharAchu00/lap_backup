import java.util.*;
class  RecNumProg
{
	static Scanner sc=new Scanner(System.in);
	static boolean b=true;
	static int digit=0,sum=0,fact=1,i=2,num,j=1,count=0,pow=1,exsum=0,midsum=0,n1=0,n2=1,n3,series=3;
	public static void main(String[] args) throws Exception
	{
		do
		{
		System.out.println("1.Strong number\n2.armstrong Number\n3.xylem Number or Not\n4.factorial\n5.fibonacci\n6.exit");
		int a=sc.nextInt();
			switch (a)
			{
			case 1:{
				System.out.println("enter a number to find Strong number or not");
				num=sc.nextInt();
				sum=0;
				String res=Strong(num);
				Thread.sleep(500);
				System.out.println("the given number is "+res+"\n");
				System.out.println("******************************");
				break;}
			case 2:{
				System.out.println("enter a number to find Armstrong Number");
				num=sc.nextInt();
				sum=0;
				digit=0;
				count=0;
				String res=ArmStrong(num);
				Thread.sleep(500);
				System.out.println("the given number is :"+res);
				System.out.println("******************************");
				break;}
			case 3:{
				System.out.println("enter a number to find Xylem Number");
				num=sc.nextInt();
				exsum=0;
				midsum=0;
				System.out.println("the given number is "+Xylem(num));
				Thread.sleep(500);
				System.out.println("******************************");
				break;}
				case 4:{
				System.out.println("enter a number to find Factorial");
				num=sc.nextInt();
				fact=1;
				i=2;
				System.out.println("the Factorial of the given number is "+factorial(num));
				Thread.sleep(500);
				System.out.println("******************************");
				break;}
				case 5:{
				System.out.println("how many series of fibonacci numbers u want ");
				num=sc.nextInt();
				n1=0;n2=1;n3=0;series=3;
				System.out.print("the fibonacci series is : "+n1+"  "+n2+"  ");
				fibonacci(num);
				Thread.sleep(500);
				System.out.println("\n******************************");
				break;}
			case 6:{
				b=false;
				break;}
			default:{
				System.out.println("selection out of range............");
				break;}
			}
		}
		while (b);
	}
	public static String Strong(int a)//finding strong number 
	{		
		if (a>0)
		{
			sum+=factorial(a%10);
			fact=1;i=2;
			Strong(a/10);
		}
		String s=(num==sum)?"Strong":"Not Strong";
		return s;
	}
	public static int factorial(int num)//finding factorial 
	{
		if (num>=i)
		{
		fact*=i;
		i++;
		factorial(num);
		}
		return fact;
	}
	public static String ArmStrong(int a)
	{
		if (a>0){
			if (count==0){
				digit=Digit(a);
				count++;
			}
			sum+=Power(a%10);
			pow=1;
			j=1;
			ArmStrong(a/=10);
			}
		String s=(num==sum)?"ArmStrong ":"Not ArmStrong ";
		return s;
	}
	public static int Digit(int a)
	{
		if (a>0)
		{
			digit++;
			Digit(a/10);	
		}
		return digit;
	}
	public static int Power(int a)
	{
		if (digit>=j)
		{
			pow*=a;
			j++;
			Power(a);
		}
		return pow;
	}
	public static String Xylem(int a)
	{
		if (num==a)
		{
			exsum+=a%10;
			a/=10;
		}
		else if (a<=9)
			exsum+=a;
		if (a>9)
		{
			midsum+=a%10;
			Xylem(a/10);
		}
		String res=(exsum==midsum)?"xylem":"Not Xylem";
		return res;
	}
	public static void fibonacci(int a)
	{
		if (series<=num)
		{
			n3=n1+n2;
			System.out.print(n3+"  ");
			n1=n2;
			n2=n3;
			series++;
			fibonacci(num);
		}
	}
}
