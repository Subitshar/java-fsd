package thread;

public class RunnableTest {

	public static void main(String[] args) {
		RunnableClass R=new RunnableClass();
		System.out.println("Start the main");
		Thread rt= new Thread(R);
		rt.start();
		rt.setName("RT");
		try {
			rt.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End the main");

	}

}
