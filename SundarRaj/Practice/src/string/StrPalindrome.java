package string;

public class StrPalindrome {

	public static void main(String[] args) {
		String str="Racecar",rev="";
		
		for (int i = str.length()-1; i >=0; i--) {
			rev+=str.charAt(i);
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("the Given String is Palindrome "+rev);
		} else {
			System.out.println("the Given String is Not a Palindrome "+rev);
		}
	}
}