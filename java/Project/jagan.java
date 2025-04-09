class  Jagan
{
	public static void main(String[] args) 
	{
		String s="Hello I'm jagan@123";
		int l_count=0,w_count=1,u_case=0,l_case=0,spl_char=0;
		for (int i=0 ; i<s.length() ;i++ )
		{
			if (s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				u_case++;
			}else if (s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				l_case++;
			}else if (s.charAt(i)==' ')
			{
				l_count++;
			}else{
				spl_char++;
			}
		}
		System.out.println("upper_case : "+u_case);
		System.out.println("Lower_case : "+l_case);
		System.out.println("special_case : "+spl_char);
		System.out.println("Word : "+w_count);
	}
}
