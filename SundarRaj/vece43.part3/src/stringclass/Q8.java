package stringclass;

public class Q8 {

	public static void main(String[] args) {
		
		String s="Hello Hi Iam From India!!!";
		char[] ch=s.toCharArray();
//		System.out.println(ch.length);
		int u_count = 0,w_count=1,l_count=0,s_count=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='A'&& ch[i]<='Z') {
				u_count++;
			} else if (ch[i]>='a'&& ch[i]<='z')
				l_count++;
			else if (ch[i]==' ') {
				w_count++;
			} else {
				s_count++;
			}
		}
		System.out.println("letter count: "+((w_count-1)+l_count+s_count+u_count));
		System.out.println("word count: "+w_count);
		System.out.println("Special Character count: "+s_count);
		System.out.println("lower case letter count: "+l_count);
		System.out.println("Upper Case letter count: "+u_count);
	}

}
