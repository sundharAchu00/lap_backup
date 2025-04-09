package objectclass;

// class Demo{
//	 public String dinga() {
//		 return "dingi@123";
//	 }
// }
//
//public class Test extends Demo{
//	Test(){
//		super();
//	}
//	 public String dinga() {
//		 return "sangi@12345";
//	 }
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Demo ref=new Demo();
//		Test ref2=new Test();
//		System.out.println( ref.dinga());
//		System.out.println( ref2.dinga());		
//	}
//
//}
public class Test{
	@Override
	public String toString() {
		return "sundhar";
	}
	public static void main(String[] args) {
//		Object ref=new Test();
		Test t=new Test();
		System.out.println(t.toString());
	}
}