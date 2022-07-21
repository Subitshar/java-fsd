package polymarphism;

public class Runtime {

	public static void main(String[] args) {
		Macbookpro pro=new Macbookpro();
		operate(pro);
		
		Macbookair air =new Macbookair();
		operate(air);
		
	}
	static void operate(macbook mac) {
		mac.start();
		mac.shutdown();
	}

	
}
