package stringclass;

public class S7 {

	public static void main(String[] args) {
		String s="Hello Hii Iam From Chennai";
		String s1[]=s.split(" ");
		String ans="";
//		System.out.println(s1[1]);
//		System.out.println(reverse("hello"));
		for (int i = 0; i < s1.length; i++) {
			ans+=reverse(s1[i])+" ";
		}
		System.out.println(ans);
	}
	static String reverse(String s1) {
		String rev="";
		for (int i = s1.length()-1; i >= 0; i--) 
			rev+=s1.charAt(i);
		
		return rev;
	} 
}
