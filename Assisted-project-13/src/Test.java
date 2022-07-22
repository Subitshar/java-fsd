
public class Test {

	public static void main(String[] args) {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Main method begin");
		
		Displaymessage dm = new Displaymessage();
		Thread t1 = new Thread(new Worker("subi",dm));
		t1.setName("t1");
		
		Thread t2 = new Thread(new Worker("suda",dm));
		t2.setName("t2");
		
		Thread t3 = new Thread(new Worker("raji", dm));
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(tname + ": Main method end");
		
	}

}
