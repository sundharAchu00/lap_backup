import java.util.*;
class MovRat 
{
	static Scanner e=new Scanner(System.in);
	public static void main(String[] args) throws Exception
	{
		//sending and otp and validating otp and give the list which contanins geners of movies and give movies in that genere
		double a=Math.random()*9999+9999;
		int sys_otp=(int)a;
		System.out.println("Your OTP code is:"+sys_otp);
		Thread.sleep(2000);
		System.out.println("Welcome....");
		System.out.println("Enter your OTP to access");
		int Use_ent_otp=e.nextInt();
		boolean ver=(sys_otp==Use_ent_otp)?true:false;//verifying otp
		System.out.println("processing...");
		Thread.sleep(3000);
		if (ver)
		{
			System.out.println("\t\tSelect The Input.");
			System.out.println("1.Comedy\n2.Action\n3.Horror\n");
			int butt=e.nextInt();
			if(butt==1)
			{
				System.out.println("1.Coffee With Kadhal\n2.OMG\n3.Nan Sirithal\n");
				int opt2=e.nextInt();
				Thread.sleep(2000);
				if(opt2==1)
				{
					System.out.println("The Raating of Coffee With Kadhal is "+2.75);
				}
				if(opt2==2)
				{
					System.out.println("The Raating of OMG  is "+2.25);
				}
				if(opt2==3)
				{
					System.out.println("The Raating of Nan Sirithal  is "+3.0);
				}
			}
			if(butt==2)
			{
				System.out.println("1.Vikram\n2.kgf\n3.Veerasimgha reddy\n");
				int opt3=e.nextInt();
				Thread.sleep(2000);
				if(opt3==1)
				{
					System.out.println("The Raating of vikram is "+4.75);
				}
				if(opt3==2)
				{
					System.out.println("The Raating of kGf  is "+4.0);
				}
				if(opt3==3)
				{
					System.out.println("The Raating of veerasimgha reddy  is "+3.0);
				}
				
			}
			if(butt==3)
			{
				System.out.println("1.Nane  Varuven\n2.kanchana2\n3.Arunthadhi\n");
				int opt4=e.nextInt();
				Thread.sleep(2000);
				if(opt4==1)
				{
					System.out.println("The Raating of Nane VAruven is "+3.0);
				}
				if(opt4==2)
				{
					System.out.println("The Raating of kanchana2  is "+3.75);
				}
				if(opt4==3)
				{
					System.out.println("The Raating of Arunthathi  is "+4.5);
				}
				
			}
		}
		if (ver==false)
		{
			System.out.println("Incorrect Password");
		}
		System.out.println("\t\t\t***************Thank You***************\n\t\t\t*************Come Again*****************");

	}
}
