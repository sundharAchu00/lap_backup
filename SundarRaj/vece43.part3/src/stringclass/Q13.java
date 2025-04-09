package stringclass;

import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {
		String s="aekAMbEfCzd";
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		String upc="",lpc="";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='A' && ch[i]<='Z') 
				upc+=ch[i];
			 else if (ch[i]>='a' && ch[i]<='z') {
				lpc+=ch[i];
			} 
		}
//		System.out.println(upc);
		String answer="";
		for (int i = 0,m=0,n=0; i < s.length(); i++) {
			if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
				answer+=upc.charAt(m++);
			} else if (s.charAt(i)>='a' && s.charAt(i)<='z'){
				answer+=lpc.charAt(n++);
			}
		}
		System.out.println(answer);
	}

}
