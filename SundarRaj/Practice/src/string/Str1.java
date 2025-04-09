package string;
//question is in whatsApp --> jagan
import java.util.Arrays;

public class Str1 {
	public static void main(String[] args) {
		String s1[] = { "hello", "Hello", "hiI", "hii", "welcome", "hello", "welcome", "JAgan" };
		int count = 1;
		Arrays.sort(s1);
//		System.out.println(Arrays.toString(s1));
		for (int i = 0; i < s1.length - 1; i++) {
			for (int j = 1; j < s1.length; j++) {
				if (s1[i].equalsIgnoreCase(s1[j])) {
					count++;
				}
			}
			if (count % 2 == 1) {
				System.out.println(s1[i] + " the count is : " + count);
			}
			count = 0;
		}
	}
}
