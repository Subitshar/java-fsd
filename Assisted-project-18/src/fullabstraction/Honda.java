package fullabstraction;

public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("Honda go method");		
	}

	@Override
	public void stop() {
		System.out.println("Honda stop method");
	}

}
