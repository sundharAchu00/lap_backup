package exception_handling;

public class First {
	public static void main(String[] args) {
		try {
			System.out.println(5 / 2);
//			System.out.println(s.substring(0, 7));
			System.exit(0);
			System.out.println("hiii");
			throw new ArithmeticException();
		} catch (ArithmeticException e) {
			System.out.println("data invalid");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String........");
		} finally {
			System.out.println("hello");
		}

	}
}
