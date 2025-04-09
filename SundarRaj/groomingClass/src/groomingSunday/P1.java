package groomingSunday;

public class P1 {
	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("null pointer Exception is handled");
//			e.printStackTrace();
//			e.getMessage();
		}
	}
}
