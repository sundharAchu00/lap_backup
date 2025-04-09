package stringclass;

public class StringFirst {

	public static void main(String[] args) {
		String s1 = "Ram";
		System.out.println(s1);
		String s2 = "Ram";
		System.out.println(s1 == s2);// checking Address
		String s3 = new String("Ram");
		System.out.println(s1 == s3);// checking Address
		System.out.println(s1.equals(s3));// checking States
	}

}
