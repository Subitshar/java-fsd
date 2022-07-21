package fullabstraction;

public class Toyota implements Car {

	@Override
	public void go() {
		System.out.println("Toyota go method");
	}

	@Override
	public void stop() {
		System.out.println("Toyota stop function");
	}

}
