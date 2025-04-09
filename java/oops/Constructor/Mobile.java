import java .util.*;
class Mobile 
{
		double price;
		String brand;
		String color;
		String Processor;
	Mobile(double price,String brand,String color,String Processor)
	{
		 price=price;
		brand=brand;
		color=color;
		Processor=Processor;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Price : ");
		int price=sc.nextInt();
		System.out.println("enter Brand : ");
		String brand=sc.next();
		System.out.println("enter color : ");
		String color=sc.next();
		System.out.println("enter Processor : ");
		String processor=sc.next();
		Mobile ab=new Mobile(price,brand,color,processor);
		System.out.println(ab);
	}
}
