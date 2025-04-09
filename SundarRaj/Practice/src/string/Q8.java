package string;

public class Q8 {

	public static void main(String[] args) {
		
		String s="Hello Hi Iam From India!!!";
		char[] ch=s.toCharArray();
//		System.out.println(ch.length);
		int u_count = 0,w_count=1,l_count=0,s_count=0;
		String upper_case="",lower_case="",spl_char="";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='A'&& ch[i]<='Z') {
				u_count++;
				upper_case+=ch[i];
			} else if (ch[i]>='a'&& ch[i]<='z') {
				l_count++;
			lower_case+=ch[i];
			}else if (ch[i]==' ') {
				w_count++;
			} else {
				s_count++;
				spl_char+=ch[i];
			}
		}
		System.out.println("letter count: "+((w_count-1)+l_count+s_count+u_count));
		System.out.println("word count: "+w_count);
		System.out.println("Special Character count: "+s_count);
		System.out.println("lower case letter count: "+l_count);
		System.out.println("Upper Case letter count: "+u_count);
		System.out.println("******************");
		System.out.print("the upper case are : ");
		for (int i = 0; i <upper_case.length(); i++) {
			System.out.print(upper_case.charAt(i)+" ");
		}
	}

}
