import java.util.*;
class MockProject 
{
	static Scanner sc=new Scanner(System.in);
	static boolean SignUp_done=false,SignUp=true;
	static int dbstu_id,logstu_id,count=0;
	static long dbPass,logPass,dbcon;
	public static void main(String[] args) throws Exception
	{
		boolean bool=true;
		System.out.println("Welcome to my new project.......");
		Thread.sleep(1000);
		do
		{
		System.out.println("1.Qspiders\n2.Jspiders\n3.About Development\n4.Exit");
		int a=sc.nextInt();
		switch (a)
		{
		case 1:{
			Qspiders();
			break;}
		case 2:{
			Jspiders();
			break;}
		case 3:{
			System.out.println("Through developing we can make day to day life very easier with help of technology..........");
			break;}
		case 4:{
			bool=false;
			break;}
		default :{
			System.out.println("Selection out of Range");
			break;}
		}
		}
		while (bool);
	}
	public static void Qspiders()
	{
		boolean b=true;
		do
		{
		System.out.println("1.skill\n2.Faculty\n3.Syllabus\n4.Exit");
		int opt=sc.nextInt();
		switch (opt)
		{
		case 1:{
			System.out.println("\"Manual Testing\"-\"Selenium\"");
			break;}
		case 2:{
			System.out.println("HARSHAVARDHAN SIR");
			break;}
		case 3:{
			boolean bo=true;
			do
			{
			System.out.println("1.Black Box Testing\n2.White Box Testing\n3.Functional Testing\n4.SystemTesting\n5.Smoke Testing\n6.Regression Testing\n7.PerformanceTesting\n8.Interation Testing\n9.Exit"  );
			int op=sc.nextInt();
			switch (op)
			{
			case 1:{
				System.out.println("Black Box Testing is a method of software testing that examines the functionality of an application without peering into its internal structures or workings.");
				break;}
			case 2:{
				System.out.println("white box testing is a form of application testing that provides the tester with complete knowledge of the application being tested, including access to source code and design documents.");
				break;}
			case 3:{
				System.out.println("Functional testing is a type of testing that seeks to establish whether each application feature works as per the software requirements.");
				break;}
			case 4:{
				System.out.println("Testing the various components of an application interact together in the full, integrated system or application is known as System Testing.");
				break;}
			case 5:{
				System.out.println("Smoke testing is a software testing method that is used to determine if a new software build is ready for the next testing phase.");
				break;}
			case 6:{
				System.out.println("Regression testing is a type of software testing that is used to verify any modification or update in a software without affecting the overall working functionality of the said software.");
				break;}
			case 7:{
				System.out.println("Performance testing is a non-functional software testing technique that determines how the stability, speed, scalability, and responsiveness of an application holds up under a given workload.");
				break;}
				case 8:{
					System.out.println("Integration testing is a type of software testing in which the different units, modules or components of a software application are tested as a combined entity.");
					break;
				}
			case 9:{
				bo=false;
				break;}
			default:{
				System.out.println("Selection out of Range");
				break;}
			}
			}
			while (bo);
			break;}
		case 4:{
			b=false;
			break;}
		default:{
			System.out.println("Selection out of Range");
			break;}
			}
		}while (b);
	}
	public static void Jspiders()throws Exception
	{
		boolean b=true;
		do
		{
		System.out.println("1.Skills\n2.Faculty\n3.Project\n4.Exit");
		int op=sc.nextInt();
		switch (op)
		{
		case 1:{
			System.out.println("J2SE\nJ2EE\nWeb Tech\nSQL");
			break;}
		case 2:{
			System.out.println("Shambu sir\nBharath sir\nHarish sir\nSurya sir\nKalaiselvi mam\nSathyaPriya mam");
			Thread.sleep(1000);
			System.out.println("Syed Tabrez...."+(char)3);
			break;}
		case 3:{
			Project();
			break;}
		case 4:{
			b=false;
			break;}
		default:{
			System.out.println("Selection out of Range"); 
			break;}
			}
		}
		while (b);
	}
	public static void Project()throws Exception
	{
		boolean bool=true;
		Thread.sleep(1500);
		System.out.println("Welcome to the Project Section..........");
		Thread.sleep(500);
		do
		{
		System.out.println("1.Sign-up\n2.log-in\n3.forgetten Password\n4.Exit");
		int op=sc.nextInt();
		switch (op)
		{
		case 1:{
			SignUp();
			break;}
		case 2:{
			LogIn();
			break;}
		case 3:{
			ForgetPassword();
			break;}
		case 4:{
			bool=false;
			break;}
		default:{
			System.out.println("Selection out of Range");
			break;}
		
		}
		}
		while (bool);
	}
	public static void SignUp()throws Exception
	{
		if (SignUp)
				{
				System.out.println("enter your student ID:");
				dbstu_id=sc.nextInt();
				System.out.println("enter your Password:");
				dbPass=sc.nextLong();
				System.out.println("enter yout contact number")	;
				dbcon=sc.nextLong();
				System.out.println("enter your Age:");
				int dbage=sc.nextInt();
				Thread.sleep(2000);
				System.out.println("Account created Successfully.....");
				System.out.println("\t***********************");
				SignUp=false;
				SignUp_done=true;
				//checking acc exist or not
				}
				 else //checking stu id and contact to check acc is exist or not 
				{
					Thread.sleep(1500);
					System.out.println("Already Account Created......You Need to Sign-Up");
				}
	}

	public static void LogIn()throws Exception
	{		
		if (SignUp_done)
			{
				System.out.println("Select the Input...");
				System.out.println("1.Log-in Using User Crediantials\n2.Login OTP");
				int logOpt=sc.nextInt();
				switch (logOpt)
				{
				case 1:
					{
				System.out.println("enter your student ID:");
				logstu_id=sc.nextInt();
				System.out.println("enter your Password:");
				logPass=sc.nextLong();
				Thread.sleep(1000);
				System.out.println("Processing...........");
				Thread.sleep(1000);
				if (dbstu_id==logstu_id && dbPass==logPass)
				{
					LogSuccess();
				}
				else
				{
					System.out.println("Wrong User Credientials");
					if (count==1)
						System.out.println("2 Attempts Left");
					else if (count==2)
						System.out.println("1 Attempts Left");
					else
					{
						Thread.sleep(1000);
						System.out.println("if forget your....we have a forget password in 4th feature....");
					}
				}
			break;}
			case 2:{
				System.out.println("Enter your register Number");
				long logcon=sc.nextLong();
				if (logcon==dbcon)
				{
					boolean logOtpVer=OtpVerification();
					if (logOtpVer)
					{
						LogSuccess();
					}
					else
					{
					System.out.println("Entered otp is wrong.......try again");
					}
				}
				else
					System.out.println("Entered number is wrong.......");
				break;}
				default:{
					System.out.println("Selection out of Range");
					break;}
		}
		}
		else
		{
			System.out.println("Go And Sign-up First");
		}

	}
	public static void ForgetPassword()throws Exception
	{
		if (SignUp_done)
		{
		System.out.println("Enter your register Number");
		long fcon=sc.nextLong();
		if (fcon==dbcon)
		{
			boolean fPassVer=OtpVerification();
			if (fPassVer)
			{
				Thread.sleep(500);
				System.out.println("your student id is: "+dbstu_id +"\nyour Password is:"+dbPass);
			}
			else
				System.out.println("entered Otp Is wrong");
		}
		else
		{
			System.out.println("Processing...........");
			Thread.sleep(1500);
			System.out.println("Entered number is wrong : "+fcon+"\n Please try again");
		}
	}
	else
		{
			Thread.sleep(1500);
			System.out.println("Your not Sign-in Yet Go And Sign-In to get the features.........");
		}
	}

	public static boolean OtpVerification()throws Exception
	{
		Thread.sleep(1500);
		System.out.println("Your have been received OTP in your registered contact number");
		double a=Math.random()*9999+9999;
		int otp=(int)a;
		System.out.println("processing.....");
		Thread.sleep(1500);
		System.out.println("Your OTP is :"+otp);
		Thread.sleep(1000);
		System.out.println("Enter otp:");
		int user_otp=sc.nextInt();
		if (otp==user_otp)
				return true;
			else
				return false;
	}
	public static void LogSuccess()throws Exception
	{
		boolean bool=true;
		do
		{
		System.out.println("1.number Programming\n2.Pattern Programming\n3.Recursion Programming\n4.exit");
		int n=sc.nextInt();
		switch (n)
		{
		case 1:{
			MyNumberPrograms.main(null);
			break;}
		case 2:{
			PatternProgram();
			break;}
		case 3:{
			RecNumProg.main(null);
			break;}
		case 4:{
			bool=false;
			break;}
		default:{
			System.out.println("Selection out of Range");
			break;}
		}
		}
		while (bool);
	}
	public static void PatternProgram()throws Exception
	{
		boolean b=true;
		do
		{
			System.out.println("1.developer name in pattern\n2.List of Patterns\n3.exit");
			int n=sc.nextInt();
			switch (n)
			{
			case 1:{
				PatName.main(null);
				break;}
			case 2:{
				PatternPrograms.main(null);
				break;}
			case 3:{
				b=false;
				break;}
			default:{
				System.out.println("Selection out of Range");
				break;}
			
			}
		}
		while (b);
	}
	public static void RecursionProgram()throws Exception
	{
		
	}
}