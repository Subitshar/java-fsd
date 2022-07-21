

import java.util.Scanner;

public class JoinThread extends Thread {
	private static int n;
	private static int sum;

	public static void main(String args[]) {
		JoinThread jt = new JoinThread();
		System.out.println("Enter the n value:");
		Scanner sc = new Scanner(System.in);
		jt.n = sc.nextInt();
		jt.start();

		try {
			jt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum of n values:" + jt.sum);
	}

	public void run() {
		for (int i = 0; i <= JoinThread.n; i++) {
			JoinThread.sum += i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
