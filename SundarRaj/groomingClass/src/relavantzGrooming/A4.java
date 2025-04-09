package relavantzGrooming;

import java.util.Arrays;

//Anagram
public class A4 {
	public static void main(String[] args) {
		String s="army",s1="mary",res="anagram";
		
		char[] ch1=s.toCharArray();
		char[] ch2=s1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (ch1.length==ch2.length) {
		for (int i = 0; i < s.length(); i++) {
			if (ch1[i]!=ch2[i]) {
				res="Not a Anagram";
				break;
			}
		}
		}else {
			res="Anagram";
		}
		System.out.println(res);
	}
}
