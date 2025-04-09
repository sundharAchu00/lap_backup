import java.util.Scanner;
public class Account {
	static Scanner sc=new Scanner(System.in);
	private String Acc_holder_name;
	private long Acc_no,Contact;
	private double balance=0.0;
	
	public Account(String acc_HName,long Ac_no,long Con) {
		Acc_holder_name=acc_HName;
		Acc_no=Ac_no;
		Contact=Con;
	}
	
	public long getAcc_no() {
		return Acc_no;
	}
	public String getAcc_holerName() {
		return Acc_holder_name;
	}
	public long getCont() {
		return Contact;
	}
	public double getBal() {
		return balance;
	}
	public void setAcc_no(long acc)throws Exception  {//setting acc_no
		if(verification()) {
		Acc_no=acc;
		System.out.println("Account Number Updated Successfully........");
		}else {
			System.err.println("verification failed");
		}
	}
	public void SetAcc_holderName(String acc_name)throws Exception {//setting name
		if(verification()) {
			Acc_holder_name=acc_name;
			System.out.println("Name Updated Successfully........");
			}else {
				System.err.println("verification failed");
			}
	}
	public void setCont(long con)throws Exception {//setting contact
	 if(verification()) {
			Contact=con;
			System.out.println("Contact Updated Successfully........");
			}else {
				System.err.println("verification failed");
			}
	}
	
	public void deposite(double d_amt) {//deposit amount
		balance+=d_amt;
		System.out.println("deposited Successfully");
	}
	public void withdraw(double w_amt) {//withdraw amount
		if(balance>=w_amt) {
		balance-=w_amt;
		}else {
			System.err.println("Sry....withdraw limit exceed");
		}
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
}