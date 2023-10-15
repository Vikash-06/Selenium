package StaticmethodOverriding;

public class BMW extends Car {
	@Override
	public void start() {
		System.out.println("BMW start");
	}

	@Override
	public void stop() {
		System.out.println("BMW stop");
	}
	
	public  static void refuel() {
		System.out.println("BMW refuel");
	}

}
