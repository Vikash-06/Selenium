package OopConcept;

public class StaticandNonstatic {

	String name = "Tom"; // Non Static variable
	static int age = 40; // static variable

	public static void main(String[] args) {
		// how to call static methods and variables inside the main method
		// 1. directly by name
		test2();
		System.out.println(age);

		// 2. By using classname
		StaticandNonstatic.test2();
		System.out.println(StaticandNonstatic.age);

		// how to call non static method and non static variable inside the main method
		// create an class object
		StaticandNonstatic obj = new StaticandNonstatic();
		obj.test1();
		System.out.println(obj.name);

		// Can i access static function with the help of object reference variable?
		// ans: YES, but it is not a good practice

	}

	// Non static method
	public void test1() {
		System.out.println("test1 method");
	}

	// static method

	public static void test2() {
		System.out.println("test method");
	}

}
