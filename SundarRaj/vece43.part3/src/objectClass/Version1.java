package objectClass;

public class Version1 {
	 Version1() {}
	
	public void status(){
		System.out.println("the status time is 30 seconds");
	}
}

class Version2 extends Version1{
	 Version2() {}
	
	public void status(){
		System.out.println("the status time is 60 seconds");
	}
}
