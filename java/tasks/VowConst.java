import java.util.*;
class VowConst 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a character ");
		char ch=s.next().charAt(0);
		if (ch=='A'||ch=='a'||ch=='e'|ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
		{
			System.out.println("The Given Character is Vowel");
		}
		else if (ch=='A'-'z')
		{
			System.out.println("The Given Character is Consonant");
		}
	}
}
