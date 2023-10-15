package constructor;

public class ConstructorConceptPart1 {
	// Constructor is used to initialised the class variable object.
	// it is used to ddefine the class features by creating an class object.
	// it looks like a function but it not a function as it does not any return
	// type.
	// it should be named as similar as class name.
	// we can overload a constructor.
	// constructor may have default type, constructor with no args and parametrised
	// constructor.
	// we will use "this" and "super" keyword in constructor.

	// default constructor
	public ConstructorConceptPart1() {
		System.out.println("default constructor");
	}

	// parametrised constructor with one single parameter
	public ConstructorConceptPart1(int i) {
		System.out.println("single param constructor " + i);
	}

	// parametrised constructor with two parameter
	public ConstructorConceptPart1(int k, int j) {
		System.out.println("value of one param " + k);
		System.out.println("value of second param " + j);
	}

	public static void main(String[] args) {
		ConstructorConceptPart1 obj = new ConstructorConceptPart1();
		ConstructorConceptPart1 obj1 = new ConstructorConceptPart1(40);
		ConstructorConceptPart1 obj2 = new ConstructorConceptPart1(10, 20);


}
}