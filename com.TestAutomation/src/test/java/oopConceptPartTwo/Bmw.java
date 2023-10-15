package oopConceptPartTwo;

public class Bmw extends Car {
	
	//Inheritance means:
	//when child class inherits the properties of parent class.
	
	//This process can be achive by using "extends" keyword.
	//When a child class inherit the parent class it means we can call methods of parent class in child class without creating an object.
	//A parent class can have a multiple child class but a child class cannot have multiple parent class.
	// parent class cannot have access the properties of child class.
	
	 
	
	//overriden method: when same methods present in child class as well as parent class with the same name and same number of arguments.
	
	
	public void start() { //overriden method
		System.out.println("Start...BMW");
	}

	public void stop() { //overriden Method
		System.out.println("stop...BMW");
	}

	public void theft() {
		System.out.println("BMW theftservices");
	}
	 public void test() {
		 waiting();
	 }

}
