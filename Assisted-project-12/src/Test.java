

public class Test {
	private static Object T = new Object();

	public static void main(String args[]) throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
		synchronized (T) {
			T.wait(1000);
			System.out.println("Object '" + T + "' is woken after" + " waiting for 1 second");
		}
	}
}
