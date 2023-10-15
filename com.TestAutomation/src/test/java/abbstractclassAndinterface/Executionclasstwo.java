package abbstractclassAndinterface;

public class Executionclasstwo {

	public static void main(String[] args) {
		InterfaceChildclass oo = new InterfaceChildclass();
		oo.biketest1();
		oo.biketest2();
		oo.biketest3();
		oo.yamahabike();
		oo.suzukibike();
		System.out.println("*****");

		// dynamic polymorphism
		bike b = new InterfaceChildclass();
		b.biketest1();
		b.biketest2();
		b.biketest3();
		
	}

}
