package OopConcept;

public class Car {
	// what is class and object in java
	int model;
	int wheel;

	public static void main(String[] args) {
		//Class is a template used to create Object and to define Object data types and Methods
		// new keyword is used to create an object
		// a,b and c are the object referenced variables
		// new Car(); is an object

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = 2015;
		a.wheel = 4;
        
		b.model=2020;
		b.wheel=2;
		
		c.wheel=3;
		
		System.out.println(a.model);
		System.out.println(b.wheel);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the references");
		a=b;
		b=c;
		c=a;
		a.model= 1998;
		System.out.println(a.model);
		c.model=2000;
		System.out.println(a.model);
	}

}
