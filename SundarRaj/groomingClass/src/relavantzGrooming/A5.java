package relavantzGrooming;

public class A5 {
	public static void main(String[] args) {
		String s="h2el3lo1";
		char []ch=s.toCharArray();
		int n_count=0,l_count=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='A'&& ch[i]<='Z'||ch[i]>='a'&& ch[i]<='z') {
				l_count++;
//				System.out.println(ch[i]+"io");
			}else if (ch[i]%2==0) {
				System.out.println("number divisible by two "+ch[i]);
			}
		}
		System.out.println();
	}
}
