import java.util.*;
class AccountDriver{
	static Scanner sc=new Scanner(System.in);
	static boolean b=true;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter Account Holder Name");
		String name=sc.nextLine();
		Thread.sleep(500);
		System.out.println("Enter Account Number");
		long Account_num=sc.nextLong();
		Thread.sleep(500);
		System.out.println("Enter Your Contact Number");
		long Cont=sc.nextLong();Thread.sleep(500);
		Account ac=new Account(name,Account_num,Cont);
//		System.out.println(ac.getAcc_holerName());
//		ac.deposite(1000);
//		System.out.println("Available balance is : "+ac.getBal());
//		ac.withdraw(670);
//		System.out.println("\t\t\tAfter Witdraw 670");
//		System.out.println("Available balance is : "+ac.getBal());
		do {
			System.out.println("1.Account Details\n2.Transactions\n3.Account Details Updations \n4.Exit");
			int n=sc.nextInt();
			Thread.sleep(500);
			switch(n) {
				case 1:{
					System.out.println("ACCOUNT Holder Name :"+ac.getAcc_holerName());
					Thread.sleep(500);
					System.out.println("ACCOUNT NUMBER :"+ac.getAcc_no());
					Thread.sleep(500);
					break;}
				case 2:{
					boolean b1=true;
					do {
					System.out.println("1.Deposit\n2.Witdraw\n3.Balance Enquiry\n4.Exit");
					int n1=sc.nextInt();
					if(n1==1) {
						//Deposit method call
						System.out.println("Enter how much do you want to deposit");
						double money=sc.nextDouble();
						ac.deposite(money);
					}else if(n1==2) {
					 //Withdraw method call
						System.out.println("Enter how much do you want to withdraw");
						double with_amt=sc.nextDouble();
						ac.withdraw(with_amt);
						System.out.println("Available balance is : "+ac.getBal());
						}else if (n1==3){
						System.out.println("Available balance is  : "+ac.getBal());}else if(n1==4){
							b1=false;
						}else
							System.out.println("selection out of range........");
					}while(b1);
					break;}
				case 3:{
					boolean b2=true;
					do {
						System.out.println("1.Change Account Holder Name\n2.Change Account Number\n3.Change Contact Number\n4.Exit");
						int n2=sc.nextInt();
						switch(n2) {
						case 1:{
							System.out.println("Enter your New name ");
							sc.nextLine();
							String NM=sc.nextLine();
							ac.SetAcc_holderName(NM);
							break;}
						case 2:{
							System.out.println("Enter your Account Number ");
							long AcN=sc.nextLong();
							ac.setAcc_no(AcN);
							break;}
						case 3:{
							System.out.println("Enter your New Contact Number ");
							long con=sc.nextLong();
							ac.setCont(con);
							break;}
						case 4:{
							b2=false;
							break;}
						default:{
							System.err.println("Selection out of Range........");
							break;}
						}
					}while(b2);
					break;}
				case 4:{
					b=false;
					break;}
				default:{
					System.out.println("selection out of range........");
					break;}
			}
			
		}while(b);
  }
}