package objectClass;

public class WhatsAppVersionDriver {

	public static void main(String[] args) {
		
		Version1 v1=new Version2();
		Version2 v2=(Version2)v1;
		v1.status();
		v2.status();
		System.out.println(v1);
	}

}
