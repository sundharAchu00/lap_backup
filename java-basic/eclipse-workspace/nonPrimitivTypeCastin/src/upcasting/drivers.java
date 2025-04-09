package upcasting;
class organization{
	String CEO,loc,state;
	organization(){}
	organization(String CEO,String loc,String state){
		this.CEO=CEO;
		this.loc=loc;
		this.state=state;
	}
}
class Student extends organization{
	String sname;
	int sid;
	double marks;
	Student(){}
	Student(String sna,int id,double mark){
		super("Girish","banglore","karnataka");
		sname=sna;
		sid=id;
		marks=mark;
	}
	public void getDetails() {
		System.out.println("Sudent name "+sname);
		System.out.println("Sudent id "+sid);
		System.out.println("Sudent marks "+marks);
		System.out.println("organization CEO "+CEO);
		System.out.println("organization location "+loc);
		System.out.println("organization state "+state);
		System.out.println("************************");
	}
}
class Qsp extends organization{
	String Mname,JFname;
	Qsp(){}
	Qsp(String Mname,String JFname){
		super("Sundhar","chennai","TamilNadu");
		this.Mname=Mname;
		this.JFname=JFname;
	}
	public void getDetails() {
		System.out.println("Manager name "+Mname);
		System.out.println("Java Faculty "+JFname);
		System.out.println("organization CEO "+CEO);
		System.out.println("organization location "+loc);
		System.out.println("organization state "+state);
		System.out.println("************************");
	}
}
public class drivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		organization o1=new Student("jagan",11,420);
		organization o2=new Qsp("watson","Tabrez");
		//System.out.println(o1.CEO);
		//System.out.println(o2.CEO);
		Student s1=(Student)o1;
		s1.getDetails();
		Qsp q1=(Qsp)o2;
		q1.getDetails();

	}

}