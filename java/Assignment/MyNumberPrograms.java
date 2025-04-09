import java.util.*;
class MyNumberPrograms 
{
	static boolean b=true;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		System.out.println("\t\t\tNumber programs..............");
		do
		{
		System.out.println("1.prime or Not\n2.factorial\n3.fibonacci\n4.number reverse\n5.palindrome\n6.Digital sum\n7.Digital Product\n8.Factors of the number\n9.strong number\n10.armstrong Number\n11.xylem or not\n12.exit");
		int n=sc.nextInt();
		switch (n)
		{
		case 1:{
			PrimeOrNot();
			Thread.sleep(1500);
			System.out.println("**********************");
			break;}
		case 2:{
			Factorial();
			Thread.sleep(1500);
			System.out.println("**********************");
			break;}
		case 3:{
			Fibonacci();
			Thread.sleep(1500);
			System.out.println("**********************");
			break;}
		case 4:{
			NumRev();
			Thread.sleep(1500);
			System.out.println("**********************");
			break;}
		case 5:{
			Palindrome();
			Thread.sleep(1500);
			System.out.println("**********************");
			break;}
		case 6:{
			DigitalSum();
			Thread.sleep(1500);
			System.out.println("**********************");
			break;}
		case 7:{
			DigitalProduct();
			Thread.sleep(1500);
			System.out.println("**********************");
			break;}
		case 8:{
			FactorNum();
			Thread.sleep(1500);
			System.out.println("\n**********************");
			break;}
		case 9:{
			StrongNum();
			Thread.sleep(1500);
			System.out.println("**********************");
			break;}
		case 10:{
			ArmStrong();
			Thread.sleep(1500);
			System.out.println("**********************");
			break;}
		case 11:{
			Xylem();
			Thread.sleep(1500);
			System.out.println("**********************");
			break;}
			case 12:{
			b=false;
			break;}
		default:{
			System.out.println("Selection out of Range");
			break;}
		}
		}
		while (b);
		
	}
	public static void  PrimeOrNot()
		{
			boolean c=true;
			System.out.println("Enter a Number ");
			int num=sc.nextInt();
			if (num==0||num==1)
			{
				System.out.println("the given number is neither prime nor compound");
			}
			else
			{
				for (int i=2;i<num ;i++ )
				{
					if (num%i==0)
					{
					  c=false;
					}
				}
			}
			if (c)
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("not prime number");
			}
		}
		public static void Factorial()
		{	
			int fact=1;
			System.out.println("Enter a Number to get Factorial");
			int num=sc.nextInt();
			for (int i=0;i<=num ;i++ )
			{
				fact*=i;
			}
			System.out.println("Factorial of the Number is "+fact);
		}
		public static void Fibonacci()
		{
			int n1=0,n2=1,n3;
			System.out.println("enter no.of digits to get fibonacci series:");
			int num=sc.nextInt();
			System.out.print("the fibonacci series is : "+n1+" "+n2+" ");
			for (int i=0;i<(num-2) ;i++ )
			{
				n3=n1+n2;
				System.out.print(n3+" ");
				n1=n2;
				n2=n3;
			}
		}
		public static void NumRev()
		{
			System.out.println("enter a number");
			int num=sc.nextInt();
			int rev=0;
				for (int i=num;i>0 ;i/=10 )
				{
					rev=(rev*10)+(i%10);
				}
			System.out.println("reverse of the given number is"+rev);
		}
		public static void Palindrome()
		{
			System.out.println("enter a number");
		int num=sc.nextInt();
		int rev=0;
		for (int i=num;i>0 ;i/=10 )
			rev=(rev*10)+(i%10);
		if (rev==num)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
		}
		public static void DigitalSum()
		{
			System.out.println("enter a number");
			int num=sc.nextInt();
			int sum=0;
				for (int i=num;i>0 ;i/=10 )
				{
					sum+=(i%10);
				}
			System.out.println("Digital sum of the  given number is  "+sum);

		}
		public static void DigitalProduct()
		{
			System.out.println("enter a number");
			int num=sc.nextInt();
			int sum=1;
				for (int i=num;i>0 ;i/=10 )
				{
					sum*=(i%10);
				}
			System.out.println("Digital product of the  given number is  "+sum);

		}
		public static void FactorNum()
		{
			System.out.println("Enter a Number");
			int num=sc.nextInt();
			System.out.println("Factors of a Number are : ");
			for (int i=1;i<num ;i++ )
			{
				if (num%i==0)
				{
					System.out.print(i+" ");
				}
			}
		}
		public static void StrongNum()
		{
			System.out.println("enter a number");
			int num=sc.nextInt();
			int sum=0,fact=1,digit=0;
			for (int i=num;i>0 ;i/=10 )
			{
				digit=i%10;
				fact=1;
				for (int j=1;j<=digit ; j++)
				{
					fact*=j;
				}
				sum+=fact;
			}
			if (num==sum)
			System.out.println("The Given Number Is Strong Number");
			else
				System.out.println("The Given Number Is not Strong Number");
		}
		public static void ArmStrong()
		{
			System.out.println("Enter the Number ");
			int num=sc.nextInt();
			int product=1,temp=num,sum=0,count=0,last=0;
			for (int i=num ;i>0 ;i/=10 )
			{
				count++;
			}
			while (temp>0)
			{
				last=temp%10;
			for (int j=1;j<=count ;j++ )
			{
				product*=last;
				System.out.println(last+"last "+product+"prod");
			}
			sum+=product;
			System.out.println(sum);
			product=1;
			temp/=10;
			}
			if (num==sum)
			{
				System.out.println("ArmStrong Number");
			}
			else
			{
				System.out.println("Not ArmStrong Number");
			}
		}
		public static void Xylem()
		{
			System.out.println("Enter a Multiple digit NUmber");
		int num=sc.nextInt();
		int extresum=0;
		int midsum=0;
		for (int i=num;i!=0 ; i/=10)
		{
			if(i==num || i<10)
			{
				extresum=extresum+i%10;
			}
			else
			{
				midsum=midsum+i%10;
			}
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
