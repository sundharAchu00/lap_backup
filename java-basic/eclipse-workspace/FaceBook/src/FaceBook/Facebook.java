package FaceBook;
import java.util.*;
class FaceBook
{
	static Scanner sc=new Scanner(System.in);
	public String db_user_name;
	public String db_DOB;
	private int db_Email;
	private int db_passwd;
	public long db_contact;
	public FaceBook(){
	}
	public int getEmail() {
		//System.out.println();
		return db_Email;
	}
	public int getpasswd() {
		return db_passwd;
	}
	public long getcontact() {
		return db_contact;
	}
	public void setEmail(int id)throws Exception {
		if (verification()) {
		db_Email=id;
		Thread.sleep(500);
		System.out.println("Email id updated successfully..........");
		}else {
			System.out.println("We cannot change the Contact.....Try again");
		}
	}
	public void setpasswd(int psw)throws Exception {
		if (verification()) {
		db_passwd=psw;
		Thread.sleep(500);
		System.out.println("Password updated successfully..........");
		}else {
			Thread.sleep(500);
			System.out.println("We cannot change the Password.....Try again");
		}
	}
	public void setcontact(long con)throws Exception {
		if(verification())
		{
		db_contact=con;
		Thread.sleep(500);
		System.out.println("Contact updated successfully..........");
		}else {
			System.out.println("We cannot change the contact.....Try again");
		}
	}
	
	public boolean verification()throws Exception {
		System.out.println("Enter your contact: ");
		long user_enter_contact=sc.nextLong();
		if(db_contact==user_enter_contact) {
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
		System.out.println("Enter your username");
		sc.nextLine();
		db_user_name=sc.nextLine();
		Thread.sleep(500);
		System.out.println("Enter your Contact");
		db_contact=sc.nextInt();
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
		}else {
			//Both email or password wrong
			System.err.println("Entered email or password is wrong");
		}
	   }else {
		   //Not a registered user (did not sign in till now)
		   System.out.println("Sign_up fIrst to avail login option");
	   }
	}
}
