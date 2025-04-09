package relavantzGrooming;

import java.util.Arrays;

public class S2 {
	public static void main(String[] args) {
		String s1="hi";
		String s2="welcome";
		String s3="Qspiders";
		String s4=s1+s2+s3;
		String s5=s4.toLowerCase();
		char s[]=s5.toCharArray();
		Arrays.sort(s);
		System.out.println(s4);
		System.out.println(Arrays.toString(s));
	}
}
