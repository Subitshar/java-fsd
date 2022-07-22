
public class Displaymessage {
	public String name;
	public synchronized void SayHello(String name) {
		this.name=name;
		String tname=Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			
			System.out.println(tname+" hello how are you "+this.name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
