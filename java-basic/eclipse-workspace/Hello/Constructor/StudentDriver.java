package Constructor;
import java.util.*;
public class StudentDriver {
	static Scanner sc=new Scanner(System.in);
	static Student s1;
	static String name;
	static int id;
	static double marks;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean b=true;
		boolean submit=false;
		System.out.println("\t\t\tStudent Details Form ");
		Thread.sleep(500);
		do
		{
			System.out.println("1.Enter Student detail\n2.Student Details\n3.Exit");
			int n=sc.nextInt();
			switch (n)
			{
			case 1:{
				System.out.println("Enter a Student Name : ");
				sc.nextLine();
				name=sc.nextLine();
				System.out.println("Enter your Student Id: ");
				id=sc.nextInt();
				Thread.sleep(250);
				System.out.println("Enter your marks: ");
				marks=sc.nextInt();
				Thread.sleep(250);
				submit=true;
				System.out.println("Student Information Stored Successfully..........");
				break;}
			case 2:{
				if (submit==true){
				Student s1=new Student(name,id,marks);
				s1.detailsOfStudent();
				System.out.println("**************");
				}
				else{
					System.out.println("please enter Student Details");
				}
				break;}
			case 3:{
				System.out.println("\t\t\tThank  You............");
				b=false;
				break;}
			}
		}
		while (b);

	}

}
