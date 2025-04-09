package Encap;
import java.util.*;
public class CEO {
	static Scanner sc=new Scanner(System.in);
	static boolean b=true;
	static String ceoName="Girish Sir";
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\t\t\tWelcome to Qspiders Jspiders...");
		System.out.println("Enter Manager Name :");
		String nam=sc.nextLine();
		System.out.println("Enter Branch Name :");
		String bran=sc.nextLine();
		System.out.println("Enter Skills of the Students :");
		String ski=sc.nextLine();
		System.out.println("Enter Number of Student :");
		int NOS=sc.nextInt();
		Jspiders us=new Jspiders(nam,bran,ski,NOS);
		do {
			System.out.println("1.Sign_up\n2.LogIn\n3.ForgetPassword\n4.Exit");
			int n=sc.nextInt();
			switch(n) {
			case 1:{
				us.Sign_up();
				break;}
			case 2:{
				us.login();
				break;}
			case 3:{
				us.ForgetCrediantials();
				break;}
			case 4:{
				b=false;
				break;}
			default:{break;}
			}
		}while(b);
	}
}
