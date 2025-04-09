package stringclass;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {

		String s1="Jagan and Watson are Good Friends";
		String res1[]=s1.split(" ");
		
		System.out.println(Arrays.toString(res1));
		
		for (int i = res1.length-1; i >=0; i--) {
			System.out.println(res1[i]);
		}
		String res2[]=s1.split("");
		System.out.println(Arrays.toString(res2));
		
	}

}
