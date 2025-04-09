package groomingSunday;

public class P3 {
	public static void main(String[] args) {
		String s="sundhar";
		try {
			System.out.println(s.charAt(8));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("SIOBE is handled...");
		}
	}
}
