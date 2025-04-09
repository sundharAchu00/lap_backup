package numbersPrograms;

import java.util.Scanner;

public class XylemNumber {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a Number ");
		int num=s.nextInt();
		int midsum=0,exsum=0,last=0;
		last=num%10;
		num/=10;
		for (; num > 9; num/=10) {
			midsum+=(num%10);
		}
		exsum=last+num;
		if (midsum==exsum) {
			System.out.println("The Given Number is Xylem");
		} else {
			System.out.println("The Given Number is Not Phylem");
		}
	}

}
