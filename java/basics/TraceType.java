class TraceType 
{
	public static void main(String[] args) 
	{
		//char<---byte
		byte a=65;
		char res1=(char)a;
		System.out.println(res1+" :char");
		//double<---byte
		double res2=a;
		System.out.println(res2+" :double");
		//float<---byte
		float res3=a;
		System.out.println(res3+" :float");
		//long<---byte
		long res4=a;
		System.out.println(res4+" :long");
		//int<---byte
		int res5=a;
		System.out.println(res5+" :int");
		//short<----byte
		short res6=a;
		System.out.println(res6+" :short");
		//float<----short
		float res7=res6;
		System.out.println(res7+" :float");
		//short<----long
		short res8=(short)res4;
		System.out.println(res8+" :short");
		//long<----short
		long res9=res6;
		System.out.println(res9+" :long");
		//int<----short
		int res10=res6;
		System.out.println(res10+" :integer");
		//short<----int
		short res11=(short)res5;
		System.out.println(res11+" :short");
		//byte<----int
		byte res12=(byte)res5;
		System.out.println(res12+" :byte");
	}
}
