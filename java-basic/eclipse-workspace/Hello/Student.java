
import java.util.*;
public class Student {

	public String sname;
	public int sid;
	private double smarks;
	private  String deptName;
	static String scl_name="xyz";
	public Student(String name,int id,double mar,String dept){
		sname=name;
		sid=id;
		smarks=mar;
		deptName=dept;
	}
	public double getMarks() {
		return smarks;
	}
	public void setDept(String Dname) {
		deptName=Dname;
	}
	public String getDept() {
		return deptName;
	}
}

class StudentDriver{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("sathish",101,98,"Mathematics");
		System.out.println("Student Name : "+s1.sname);
		System.out.println("Student marks : "+s1.getMarks());
		System.out.println("Student Department : "+s1.getDept());
		System.out.println("We are going to change the department of student1");
		System.out.println("enter DepartName : ");
		String dnam=sc.nextLine();
		s1.setDept(dnam);
		System.out.println("Student Department : "+s1.getDept());
	}

}
