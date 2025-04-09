class Demo1 {
	static int count=0;
	public Demo1(){
		this(5);
		System.out.println(count++);
		System.out.println(count++);
	}

	public Demo1(int a){
		this("java");
		System.out.println(count++ +"------------"+a);
		System.out.println(count++ +"------------"+a);
	}

	public Demo1(String s){
		//L.I
		System.out.println(count++ +"------------"+s);
		System.out.println(count++ +"------------"+s);
	}

	public static void main(String[] args){
		new Demo1();
	}

}
