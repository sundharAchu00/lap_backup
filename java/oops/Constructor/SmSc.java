class SmSc 
{
	static int a=10;
	static SmSc ref=new SmSc();
	static{
		System.out.println(a);
		System.out.println(SmSc.a);
		System.out.println(ref.a);
	}
	public static void main(String[] args){
		dinga();
		SmSc.dinga();
		ref.dinga();
		System.out.println("hi I am from main method");
	}
	public static void dinga(){
	System.out.println("hi I am from dinga method");	
	}
}
