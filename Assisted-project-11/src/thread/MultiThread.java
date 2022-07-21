package thread;

public class MultiThread extends Thread {
	public static void main(String args[]) {
		MultiThread mt=new MultiThread();
		mt.start();
		for(int j=0;j<100;j++) {
			System.out.print("main thread j :"+ j +" \t");
			try {
			Thread.sleep(500);
		}catch(InterruptedException ex)
			{
			ex.printStackTrace();}
		}
		
		System.out.println("End the main thread");
		
			
		
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Another thread i :" + i + " \t");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
