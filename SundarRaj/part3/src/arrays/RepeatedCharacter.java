package arrays;

public class RepeatedCharacter {

	public static void main(String[] args) {

		String s = "great responsibility";
		int count = 0;
		char[] s1 = s.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			count = 1;
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i] == s1[j] && s1[i] != ' ') {
					count++;
					s1[j] = '1';
				}
			}
			if (count > 1 && s1[i] != '1') {
				System.out.println(s1[i] + "-" + count);
			}
		}
	}

}
