package FaceBook;
import java.util.*;
class user{
	//main method to create object and user interface
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		boolean b=true;
		FaceBook fb=new FaceBook();
		do{
		System.out.println("\t\t\tWelcome To FaceBook");
		Thread.sleep(500);
		System.out.println("1.Sign-up\n2.Log-in\n3.Forget Login Crediantials\n4.Exit");
		int n=sc.nextInt();
			switch(n){
			case 1:{
				//sign_up
				fb.Sign_up();
				break;}
			case 2:{
				//log_in
				fb.login();
				break;}
			case 3:{
				//forget log_in credentials
				boolean b1=true;
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
						System.out.println(fb.getEmail());
						break;}
					case 2:{
						System.out.println("Enter your New Email id");
						int usrEmail=sc.nextInt();
						fb.setEmail(usrEmail);
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
						System.out.println(fb.getpasswd());
						break;}
					case 2:{
						System.out.println("Enter your New Password");
						int pwd=sc.nextInt();
						fb.setpasswd(pwd);
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
						System.out.println(fb.getcontact());
						break;}
					case 2:{
						System.out.println("Enter your New Contact");
						int con=sc.nextInt();
						fb.setcontact(con);
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
				break;}
			case 4:{
				b=false;
				break;}
			default:{
				System.out.println("Input out of Range");
				break;}
			
			}
		}
		while (b);
	}
}
