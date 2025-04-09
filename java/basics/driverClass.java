import java.util.Scanner;
class Netflix 
{
	String app_name;
	double app_size;
	theatre t;
	//creating comstructor for netflix
	public Netflix(String name,double size){
		//initializing non-static variables through constructor
		//l.i
		app_name=name;
		app_size=size;
	}
	//creating a user defined Method with passing the direct values;
	public void setTheatre(theatre t){
		
	}

	//creating a user defined method without passing the direct value;
		/*public void setTheatre(String tnm,double tpri,int scr){
			t=new theatre(tnm,tpri,scr);
	}*/
}

//creating theatre
class theatre{
	String tname;
	double tprice;
	int no_of_scrs;
	public theatre(String tnm,double tpri,int scr){
		//initializing non-static variables through constructor
		//l.i
		tname=tnm; 
		tprice=tpri;
		no_of_scrs=scr;
	}
}

class driverClass{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//System.out.println("Hello World!");
		System.out.println("Enter App Name ");
		String name=sc.nextLine();
		System.out.println("Enter App Size ");
		double size=sc.nextDouble();
		System.out.println("================");
		//creating a reference to the object Netflix
		Netflix n1=new Netflix(name,size);
		System.out.println(n1.app_name);
		System.out.println(n1.app_size);
		System.out.println("================");
		//accessing theatre member using netflix
		/*n1.setTheatre("Rohini",110,5);
		System.out.println(n1.t.tname);
		System.out.println(n1.t.tprice);
		System.out.println(n1.t.no_of_scrs);
		System.out.println("================");*/
		n1.setTheatre(n1.t=new theatre("rohini",110,5));
		System.out.println(n1.t.tname);
		System.out.println(n1.t.tprice);
		System.out.println(n1.t.no_of_scrs);
		System.out.println("================");
	}
}
