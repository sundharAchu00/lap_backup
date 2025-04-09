package string;

import java.util.Arrays;

public class StrReplace {
	public static void main(String[] args) {
		String s="I Love Biryani";
		String[] res=s.split(" ");
		for (int i = 0; i < res.length; i++) {
			if (res[i].equalsIgnoreCase("love")) {
				res[i]="Hate";
			}
		}
		String op="";
		for (int i = 0; i < res.length; i++) {
			op+=res[i]+" ";
		}
		System.out.println(op);
	}
}
