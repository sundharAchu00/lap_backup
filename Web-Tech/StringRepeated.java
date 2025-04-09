package stringclass;

public class StrPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Malayalam";
		String s2[]=s1.split("");
		String rev = "";
		for (int i = s2.length-1; i >=0 ; i--) {
			rev = rev+s2[i];
		}
		if (s1.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println(" not a palindrome");
		}
	}

}
