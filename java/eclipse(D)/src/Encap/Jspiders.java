package Encap;

import java.util.Scanner;

public class Jspiders {
	static Scanner sc=new Scanner(System.in);
	private String Man_name;
	private String Branch;
	public String Skill_type;
	private long Contact;
	public int NoOfStu;
	private int db_Email;
	private int db_passwd;
	
	public Jspiders(String nm,String bran,String skil,int nos) {
		Man_name=nm;
		Branch=bran;
		Skill_type=skil;
		NoOfStu=nos;
	}
	public int getNOS() {
		return NoOfStu;
	}
	public String getSki() {
		return Skill_type;
	}
	public int getEmail() {
		return db_Email;
	}
	public void setEmail(int Mail)throws Exception  {
		if(verification()) {
			db_Email=Mail;
		}
	}
	public int getpasswd() {
		return db_passwd;
	}
	
	public void setpasswd(int pwd)throws Exception {
		if(verification()) {
			db_passwd=pwd;
		}
	}
	public String getMan_name() {
		return Man_name;
	}
	public String getbranch() {
		return Branch;
	}
	public long getcont() {
		return Contact;
	}
	
	public void setManNM(String nam)throws Exception {
		if (verification()) {
		Man_name=nam;
		System.out.println("Manager Name Updated Successfully......");}
	}
	public void setbran(String branc)throws Exception {
		if(verification()) {
		Branch=branc;}
	}
	
	public void setCon(long con)throws Exception {
		if(verification()) {
		Contact=con;}
	}
	
	public void addStudent() {
		NoOfStu++;
		System.out.println("Student added Successfully.......");
	}
	public void remStudent() {
		NoOfStu--;
		System.out.println("Student Removed Successfully.......");
	}
	public boolean verification()throws Exception {//otp verification
		System.out.println("Enter your contact: ");
		long user_enter_contact=sc.nextLong();
		if(Contact==user_enter_contact) {
			double otp=Math.random()*9999+9999;
			int sys_otp=(int)otp;
			System.out.println(sys_otp);
			Thread.sleep(1000);
			System.out.println("enter your otp ");
			int user_otp=sc.nextInt();
			if(user_otp==sys_otp) {
				System.out.println("Verification Successfull......");
				return true;
			}else {
				//wrong otp
				System.err.println("Entered otp is wrong");
				return false;
			}
			
		}else {
			//contact wrong
			System.err.println("Contact MissMatch");
			return false;
		}
	}
	
	boolean Sign_up_done=false;//to check acc exist
	
	public void Sign_up()throws Exception {
		//on process
		System.out.println("Enter your Email");
		db_Email=sc.nextInt();
		Thread.sleep(500);
		System.out.println("Enter your Password");
		db_passwd=sc.nextInt();
		Thread.sleep(500);
		System.out.println("Enter your Contact");
		Contact=sc.nextInt();
		Thread.sleep(500);
		Sign_up_done=true;
	}
	
	public void login()throws Exception{
		//login
		if(Sign_up_done) {
		System.out.println("Enter Email id");
		int user_entered_email=sc.nextInt();
		System.out.println("Enter Password");
		int user_entered_pwd=sc.nextInt();
		if(user_entered_email==db_Email&&user_entered_pwd==db_passwd) {
			//both email ans password is correct
			System.out.println("Welcome to home page");
			LogSucc();
		}else {
			//Both email or password wrong
			System.err.println("Entered email or password is wrong");
		}
	   }else {
		   //Not a registered user (did not sign in till now)
		   System.out.println("Sign_up fIrst to avail login option");
	   }
	}
	
	//fogret user crediantils 
	public void ForgetCrediantials()throws Exception {
	boolean b1=true;
	if(Sign_up_done)
	{	
	do {
	System.out.println("1.Email\n2.Password\n3.Contact\n4.exit");
	int input=sc.nextInt();
	switch(input) {
	case 1:{
		//get or set Email id
		boolean b2=true;
		do {
		System.out.println("1.Get Email id\n2.Set Email id\n3.Exit");
		int input1=sc.nextInt();
		switch(input1) {
		case 1:{
			System.out.println(getEmail());
			break;}
		case 2:{
			System.out.println("Enter your New Email id");
			int usrEmail=sc.nextInt();
			setEmail(usrEmail);
			break;}
		case 3:{
			b2=false;
			break;}
		default:{
			System.err.println("selection out of range");
			break;}
		}
		}while(b2);
		break;}
	case 2:{
		//get or set Password
		boolean b2=true;
		do {
		System.out.println("1.Get Password\n2.Set Password\n3.Exit");
		int input1=sc.nextInt();
		switch(input1) {
		case 1:{
			System.out.println(getpasswd());
			break;}
		case 2:{
			System.out.println("Enter your New Password");
			int pwd=sc.nextInt();
			setpasswd(pwd);
			break;}
		case 3:{
			b2=false;
			break;}
		default:{
			System.err.println("selection out of range");
			break;}
		}
		}while(b2);
		break;}
	case 3:{
		//get or set contact
		boolean b2=true;
		do {
		System.out.println("1.Get Contact\n2.Set Contact\n3.Exit");
		int input1=sc.nextInt();
		switch(input1) {
		case 1:{
			System.out.println(getcont());
			break;}
		case 2:{
			System.out.println("Enter your New Contact");
			int con=sc.nextInt();
			setCon(con);
			break;}
		case 3:{
			b2=false;
			break;}
		default:{
			System.err.println("selection out of range");
			break;}
		}
		}while(b2);
		break;}
	case 4:{
		b1=false;
		break;}
	default:{
		System.err.println("selection out of range");
		break;}
	}
	}while(b1);
	}
   }
	
	public void LogSucc() {
		System.out.println("Login Successfull..........");
		boolean b=true;
		do {
			System.out.println("1.No_Of_Student\n2.Skills yes\n3.Person using App\n4.Add Student\n5.Remove Student\n6.Exit");
			int n=sc.nextInt();
			switch(n) {
			case 1:{
				System.out.println("Total number of Students : "+getNOS());
				break;}
			case 2:{
				System.out.println("Skills Provided to Students : "+getSki());
				break;}
			case 3:{
				System.out.println(CEO.ceoName);
				break;}
			case 4:{
				addStudent();
				System.out.println("Total number of Students : "+getNOS());
				break;}
			case 5:{
				remStudent();
				System.out.println("Total number of Students : "+getNOS());
				break;}
			case 6:{
				b=false;
				break;}
			default:{break;}
			}
		}while(b);
	}
}


