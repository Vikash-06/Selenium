package StaticmethodOverriding;

public class ExecutionClass {

	public static void main(String[] args) {
		BMW.refuel();
		BMW B = new BMW();
		B.start();
		B.stop();
	
		Car b = new Car ();
		b.start();
		b.stop();
		Car.refuel();

	}

}
