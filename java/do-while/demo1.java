class demo1 
{
	public static void main(String[] args) 
	{
		int sno=1,num=10;
		char ch='a';
		do
		{
			if (sno%2==1)
			{
				System.out.println(ch+++"*"+ch+"="+num);
				ch++;
				num-=2;
				sno++;
			}
			else
			{
				System.out.println((sno++)+"*"+sno+"="+num);
				num-=2;
			}
			
		}while (ch<='e');
	}
}
