import java.util.*;
class NoOfDigit
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

    int count = 0,num;
	System.out.println("Enter a Number to Get NO.of .Digit Present in it.");
	num=sc.nextInt();

    while (num != 0) 
	{
      
      num /= 10;
      count++;
    }

    System.out.println("Number of digits: " + count);
  }
}