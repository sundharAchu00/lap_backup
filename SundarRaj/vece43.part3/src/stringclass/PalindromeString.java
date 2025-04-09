package stringclass;

public class PalindromeString {

	public static void main(String[] args) {
		String s1="Madam",rev="";
		for (int i = s1.length()-1; i >= 0 ; i--) {
			rev+=s1.charAt(i);
		}         
		if (s1.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println(" not a palindrome");
		}

	}

}
