package staticblocks;

public class StaticBlockq2 {
	// q:1 how can we run a java program without create an object
	// q:2 similarity and difference of static block and static method?
	// similarity is we do not need to create object for both
	// difference is in static block we can execute it automatiicall at the time of
	// loading class
	// however to executing static method we have to call it inside the main method
	// by calling it directly or with using of class name.
	
	static {
		System.out.println("static block");
	}

	public static void testing() {
		System.out.println("testing method");
	}

	public static void main(String[] args) {

		System.out.println("main method");
		// testing();
		StaticBlockq2.testing();

	}

}
