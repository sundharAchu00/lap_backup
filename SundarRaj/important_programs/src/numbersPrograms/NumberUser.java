package numbersPrograms;
import java.util.Scanner;
interface NumberProgramSpecifier{
	void palindrome();
	void prime();
	void xylem();
}
class NumberProgramProvider implements NumberProgramSpecifier{
	static Scanner s=new Scanner(System.in);
	public void xylem() {
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
	public void prime() { 
		System.out.println("Enter a Number");
		int num = s.nextInt();
		int count = 0;
		if (num == 0 || num == 1) {
			System.out.println("Neither Prime nor Composite");
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}
			if (count == 1) {
				System.out.println("The Given Number is not a Prime Number");
			} else {
				System.out.println("The Given Number is Prime Number");
			}
		}
	}
	public void palindrome() {
		System.out.println("Enter a Number");
		int num = s.nextInt(),rev=0,temp=num;
		while(num > 0) {
			rev=rev*10+(num%10);
			num/=10;
		}
		if (temp==rev) {
			System.out.println("The Number Is Palindrome");
		} else {
			System.out.println("The Number Is Not a Palindrome");
		}
	}
}
class NumberUser{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		NumberProgramSpecifier ref=new NumberProgramProvider();
		boolean b=true;
		do {
			System.out.println("1.Prime Number Or Not\n2.Palindrome Or Not\n3.Xylem Number or Not\n4.Exit");
			int n=s.nextInt();
			switch (n) {
			case 1:
				ref.prime();
				break;
			case 2:
				ref.palindrome();
				break;
			case 3:
				ref.xylem();;
				break;
			case 4:
				b=false;
				break;	
			default:
				System.out.println("Selection out of Range");
				break;
			}
		} while (b);
	}
}