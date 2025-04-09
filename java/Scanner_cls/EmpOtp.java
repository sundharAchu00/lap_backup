import java.util.*;
class EmpOtp 
{
	static Scanner e=new Scanner(System.in);
	public static void main(String[] args) 
	{
		double a=Math.random()*9999+9999;
		int acs=(int)a;
		System.out.println("Your Acess code is:"+acs);
		System.out.println("Keep this code safe its is the acess key for you...!");
		System.out.println("Welcome....");
		System.out.println("Enter your access key to get access in 2nd floor");
		int cacs=e.nextInt();
		String dis=(acs==cacs)?"Access Granted":"Access Denied";
		System.out.println("Your "+dis);

	}
}
