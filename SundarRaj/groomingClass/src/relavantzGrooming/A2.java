package relavantzGrooming;

public class A2 {
	public static void main(String[] args) {
		String s="Hello this is java grooming class";
		char ch[]=s.toCharArray();
		int l_count=0,w_count=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='A' && ch[i]<='z') {
				l_count++;
			} else {
				w_count++;
			}
		}
		System.out.println(l_count);
		System.out.println(w_count+1);
	}
}
