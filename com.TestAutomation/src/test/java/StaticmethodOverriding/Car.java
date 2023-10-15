package StaticmethodOverriding;

public class Car {
	
	public void start () {
		System.out.println("Car start");
	}
	public void stop () {
		System.out.println("car stop");
	}
	//Method Hiding
	public static void refuel() {
		System.out.println("car refuel");
	}

}
