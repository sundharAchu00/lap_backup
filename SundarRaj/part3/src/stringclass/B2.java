package stringclass;

public class B2 {

	public static void main(String[] args) {
		String s1="jagan";
		System.out.println(s1.toUpperCase());
		System.out.println(s1);//immutable in nature
		String s2="VISHWA";
		System.out.println(s2.toLowerCase());
		String s3=s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1.concat(" is very handsome"));//immutable in nature
	}

}
