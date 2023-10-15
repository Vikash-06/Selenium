package oopConceptPartTwo;

public class Vechile {

	public static void main(String[] args) {

		// Static polymorphism or compile time polyphormism: At the time of compile java
		// will decide which method should be call.
		// Static polymorphism can be achieved by method overloading.

		Bmw b = new Bmw();
		b.start();
		b.stop();
		b.theft();
		b.waiting();

		System.out.println("******");

		Car c1 = new Car();
		c1.stop();
		c1.start();
		c1.waiting();

		System.out.println("******");

		
		//When a child class object referred by parent class reference variable this concept known as dynamic or run time polymorphism.
		//it can be achived by method overriding.
		
		Car c2 = new Bmw();
		c2.start(); //overriden method called
		c2.stop();  //overriden method called
		c2.waiting();

	}

}
