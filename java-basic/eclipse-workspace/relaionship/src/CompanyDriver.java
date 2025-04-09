class Company{
	String Cname,location,designation;
	Company(){}
	Company(String name,String loc,String desig){
		//l.i
		Cname=name;
		location=loc;
		designation=desig;
	}
}
class Employee extends Company{
	String Ename,hire_date;
	double salary;
	Employee(){}
	Employee(String en,double sal,String hired,String name,String loc,String desig){
		super(name,loc, desig);
		//li
		Ename=en;
		salary=sal;
		hire_date=hired;
	}
	public void DetOfEmp() {
		System.out.println("Emplyoee name :"+Ename);
		System.out.println("Emplyoee Company name :"+Cname);
		System.out.println("Designation : "+designation);
		System.out.println("Emplyoee salary :"+salary);
		System.out.println("Emplyoee hire date :"+hire_date);
		System.out.println("location : "+location);
		System.out.println("************************");
	}
}
public class CompanyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1=new Employee("sundhar",67000,"10-1=23","capegemini","chennai","Software developer");
		E1.DetOfEmp();
	}

}
