import java.util.*;
class Numbers 
{
	static Scanner sc=new Scanner(System.in);
	static boolean b=true;
	public static void main(String[] args) throws Exception
	{
		do
		{
		System.out.println("\t\t\tSelect the Function....");
		System.out.println("1.Perfect Number\n2.Factors of a Number\n3.Xylem or not\n4.Sum of Extreme numbers\n5.Digital Sum\n6.Digital Product\n7.Exit.");
		int n=sc.nextInt();
		switch (n)
		{
		case 1:{
			PerNum.main(args);
			Thread.sleep(3000);
			break;}
		case 2:{
			Factor.main(args);
			Thread.sleep(3000);
			break;}
		case 3:{
			Xylem.main(args);
			Thread.sleep(3000);
			break;}
		case 4:{
			FirAndLast.main(args);
			Thread.sleep(3000);
			break;}
		case 5:{
			DigSum.main(args);
			Thread.sleep(3000);
			break;}
		case 6:{
			DigProduct.main(args);
			Thread.sleep(3000);
			break;}
		case 7:{
			b=false;
			break;}
		default:{
			System.out.println("Sorry Select With in Range");
			break;}
		
		}
	   }
		while (b);
	}
}
