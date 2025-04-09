package Encapsulation;
import java.util.*;
public class Emp {
	public String name;
	private int id;
	private double sal;
	public String designation;
	
	public Emp() {
		System.out.println("im no args constructor.......");
	}
	public Emp(String name,int id,double sal,String designation) {
		this.name=name;
		this.id=id;
		this.sal=sal;
		this.designation=designation;
		System.out.println("im para args constructor.......");
	}
	public void detailOdEmp() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee ID is "+id);
		System.out.println("Employee Salary is "+sal);
		System.out.println("Employee designation is "+designation);
	}

}
	class EmpDriver{
		static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your name :");
		String name=sc.nextLine();
		System.out.println("Enter your Employee Id :");
		int id=sc.nextInt();
		System.out.println("Enter your salary :");
		double salary=sc.nextDouble();
		System.out.println("Enter your Designation :");
		sc.nextLine();
		String Desig=sc.nextLine();
		Emp e1=new Emp(name,id,salary,Desig);
//		Emp e2=new Emp();
//		Emp e3=new Emp();
//		Emp e4=new Emp();
//		Emp e5=new Emp();
		System.out.println(e1);
		e1.detailOdEmp();	}
}

