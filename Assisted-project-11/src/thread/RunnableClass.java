package thread;

public class RunnableClass implements Runnable {

	@Override
	public void run() {
		String s=Thread.currentThread().getName();
		System.out.println(s+": Run method start");
		System.out.println(s+": Run method end...");
		
	}

}
