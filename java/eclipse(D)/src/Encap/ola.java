package Encap;
import java.util.*;
public class ola {
	String app_name;
	double size;
	public ola(String apnm,double siz) {
		app_name=apnm;
		size=siz;
	}
}
class cars{
	int car_no;
	String car_type,color;
	ola o;
	public cars(int num,String type,String col) {
		car_no=num;
		car_type=type;
		color=col;
	}
	public void getola(String apnm,double siz) {
//		System.out.println("App Name : "+o.app_name);
//		System.out.println("App Size: "+o.size);
		o=new ola(apnm,siz);
		
	}
}
class Driver{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Car Number ");
		int num=sc.nextInt();
		System.out.println("Enter Car Type ");
		sc.nextLine();
		String typ=sc.nextLine();
		System.out.println("Enter Car Color ");
		String col=sc.nextLine();
		System.out.println("=====================================");
		cars c=new cars(num,typ,col);
		System.out.println("Enter App Name ");
		String nam=sc.nextLine();
		System.out.println("Enter App Size ");
		double si=sc.nextDouble();
		System.out.println("======================================");
		c.getola(nam,si);
		System.out.println(c.o.size);
		System.out.println(c.o.app_name);
		System.out.println("======================================");
		System.out.println(c.car_no);
		System.out.println(c.car_type);
		System.out.println(c.color);
	}
	
}