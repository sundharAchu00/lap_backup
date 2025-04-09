class  TypeNarrow
{
	public static void main(String[] args) 
	{
		int res=15;
		long res4=78;
		byte a=83;
		//short<----int
		short res1=(short)res;
		System.out.println(res1+" :short");
		//byte<----int
		byte res2=(byte)res;
		System.out.println(res2+" :byte");
		//short<----long
		short res3=(short)res4;
		System.out.println(res3+" :short");
		//char<---byte
		char res5=(char)a;
		System.out.println(res5+" :char");
		
	}
}

