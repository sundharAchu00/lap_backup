package stringclass;

public class B4 {

	public static void main(String[] args) {
		String s1="hello, jagan I'm jagan";
		String s2="Jagan";
		check(s1,s2);
	}

	private static void check(String s1, String s2) {
		String[] res=s1.split(" ");
		int count=0;
		for (int i = 0; i < res.length; i++) {
			if (s2.equalsIgnoreCase(res[i])) {
				count++;
			}
		}
		System.out.println(count +" times jagan is repeated");
	}
	
}
