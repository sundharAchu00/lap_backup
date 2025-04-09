package stringclass;

import java.util.Arrays;

public class S3 {
	public static void main(String[] args) {
		String s = "A3B2C3A1", res = "";
		String arr[] = new String[s.length() / 2];
		Integer a[]=new Integer[arr.length];
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (i % 2 == 1) {
				arr[j] += s.charAt(i);
				try {
				  a[j]=Integer.parseInt(arr[j]);
				}catch (Exception e) {
					System.out.println(a[0]);
				}
				 
				j++;
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}
