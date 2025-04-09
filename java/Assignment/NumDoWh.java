import java.util.*;
class NumDoWh 
{
	static Scanner sc=new Scanner(System.in);
	static boolean b=true;
	public static void main(String[] args) 
	{
		
		do
		{
			System.out.println("\t\tselect the input\n");
			System.out.println("1.Addition of Two numbers\n2.Substraction of two Number\n3.largest of two numbers\n4.smallest of three numbers\n5.exit.");
			int user_in=sc.nextInt();
			switch (user_in)
			{
			case 1:{
				System.out.println("enter a value a:");
				int a=sc.nextInt();
				System.out.println("enter a value b:");
				int b=sc.nextInt();
				System.out.println("The Addition Of Two Numbers is : "+(a+b));
				break;}
			case 2:{
				System.out.println("enter a value a:");
				int a=sc.nextInt();
				System.out.println("enter a value b:");
				int b=sc.nextInt();
				System.out.println("The Addition Of Two Numbers is : "+(a-b));
				break;}
			case 3:{
				System.out.println("enter a value a:");
				int a=sc.nextInt();
				System.out.println("enter a value b:");
				int b=sc.nextInt();
				int res=a>b?a:b;
				System.out.println("The Largest of Two Numbers Is : "+res);
				break;}
			case 4:{
				System.out.println("enter a value a:");
				int a=sc.nextInt();
				System.out.println("enter a value b:");
				int b=sc.nextInt();
				int res=a<b?a:b;
				System.out.println("The Smallestt of Two Numbers Is : "+res);
				break;}
			case 5:{
				b=false;
				break;}
			default:{
				System.out.println("Selection out of Range......... ");
				break;}
			
			}
			}
		while (b);
		System.out.println("***Thank you..."+(char)3);
	}
}
