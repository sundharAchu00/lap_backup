package multithreading;

class M2 extends Thread {

	@Override
	public void run() {
		try {

			System.out.println("Prem Kumar" + Thread.currentThread().getId());

		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public class M1 {
		public static void main(String[] args) {

			for (int i = 0; i <= 5; i++) {
				M2 ref = new M2();
				ref.start();;
			}
		}
	}
}
