package practice;
import java.util.Scanner;
interface CalciSupport{
	int add(int a,int b);
	int sub(int a,int b);
	int multiply(int a,int b);
	int division(int a,int b);
	int modulus(int a,int b);
}
interface addition extends CalciSupport{
	default int add(int a,int b) {return a+b;}
//	default int sub(int a,int b) {return a-b;}
//	default int multiply(int a,int b) {return a*b;}
//	default int division(int a,int b) {return a/b;}
//	default int modulus(int a,int b) {return a%b;}
}
interface substraction extends CalciSupport{
	default int sub(int a,int b) {return a-b;}
}
interface multi extends CalciSupport{
	default int multiply(int a,int b) {return a*b;}
}
interface div extends CalciSupport{
	default int division(int a,int b) {return a/b;}
}
interface mod extends CalciSupport{
	default int modulus(int a,int b) {return a%b;}
}
class JacKibly implements mod,div,substraction,addition,multi{
	
}
public class CalcDriver {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool=true;
		CalciSupport ref=new JacKibly();
		System.out.println("\t\t\tCALCULATOR");
		do {
		System.out.println("1.add\n2.subtraction\n3.Multiply\n4.Division\n5.MOdulus\n6.Exit");
		int n=s.nextInt();
		switch (n) {
		case 1:{
			System.out.println("Enter the first value");
			int a=s.nextInt();
			System.out.println("Enter the Second value");
			int b=s.nextInt();
			//ref.add(a,b);
			System.out.println("Addition of "+a+" and "+b+" is "+ref.add(a,b));
			break;}
		case 2:{
			System.out.println("Enter the first value");
			int a=s.nextInt();
			System.out.println("Enter the Second value");
			int b=s.nextInt();
			//ref.sub(a,b);
			System.out.println("Substraction of "+a+" and "+b+" is "+ref.sub(a,b));
			break;}
		case 3:{
			System.out.println("Enter the first value");
			int a=s.nextInt();
			System.out.println("Enter the Second value");
			int b=s.nextInt();
			//ref.multiply(a, b);
			System.out.println("Multiply of "+a+" and "+b+" is "+ref.multiply(a,b));
			break;}
		case 4:{
			System.out.println("Enter the first value");
			int a=s.nextInt();
			System.out.println("Enter the Second value");
			int b=s.nextInt();
			System.out.println("Division of "+a+" and"+b+" is "+ref.division(a,b));
			break;}
		case 5:{
			System.out.println("Enter the first value");
			int a=s.nextInt();
			System.out.println("Enter the Second value");
			int b=s.nextInt();
			//ref.modulus(a,b);
			System.out.println("Modulus of "+a+" and"+b+" is "+ref.modulus(a,b));
			break;}
		case 6:{
			bool=false;
			break;}
		default:{
			System.out.println(" Bad Selection");
			break;}
		}
		}while(bool);
	}
}
