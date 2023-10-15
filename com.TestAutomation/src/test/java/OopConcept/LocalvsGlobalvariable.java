package OopConcept;

public class LocalvsGlobalvariable {
	// global variable define just right below the class
	String s = "Tom";
	int age = 40;

	public static void main(String[] args) {
		int a = 20;
		System.out.println(a);
		// to call or access global variable we just have to create an object of a class,
		// and then with the help of object variable we can access global varibales.
		LocalvsGlobalvariable obj = new LocalvsGlobalvariable();
		System.out.println(obj.s);

		obj.test();

	}

	public void test() {

		// when you define the variable inside the method then the variable considered
		// as a local variable
		// local variable can be access inside the method only.
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(age);
	}

}
