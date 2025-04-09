package stringclass;

public class Palindrome {

	public static void main(String[] args) {
		String s = "Malayalam";
		String s1[] = s.split("");
		String rev = "";
		for (int i = s1.length - 1; i >= 0; i--) {
			rev = rev + s1[i];
		}
		if (s.equalsIgnoreCase(rev)){
			System.out.println("Plaindrome");
		} else {
			System.out.println("Not a Plaindrome");
		}
	}

}
