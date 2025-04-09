import java.util.*;
class StuDet 
{
	static Scanner q=new Scanner(System.in);
	public static void main(String[] args)throws Exception 
	{

		System.out.println("Enter Student ID:");
		int a=q.nextInt();
		System.out.println("Enter Student first character:");
		char b=q.next().charAt(0);
		System.out.println("Enter Student total mark:");
		double c=q.nextDouble();
		System.out.println("processing....");
		Thread.sleep(2000);
		System.out.println("Student ID:"+a);
		System.out.println("Student first character:"+b);
		System.out.println("Student total marks:"+c);
		System.out.println("*********END*********");
	}
}
