package string;

public class StrSpeciedElement {

	public static void main(String[] args) {
		String s="hello world";
		char ch[]=s.toCharArray();	
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='l') {
				count++;
			}
		}
		System.out.println("The Count Is "+count);
	}

}
