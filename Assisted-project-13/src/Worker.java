
public class Worker implements Runnable {
	public Displaymessage dm1;
	public String name;

	Worker(String name, Displaymessage dm) {
		this.dm1 = dm;
		this.name = name;
	}

	@Override
	public void run() {
		dm1.SayHello(name);
	}

}
