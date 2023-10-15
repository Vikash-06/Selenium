package OopConcept;

public class MethodOverloading {

	// methodoverloading = when the methods name are same but arguments or input
	// parameter are different within a class.
	// duplicate method (when method name is same and number of param is also same) are not allowed unless the data type is not diiferent.
	// inside the method we can not create a another method
	// we can also overload the main method.

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.test();
		obj.test(10.01);
		obj.test(10);
		obj.test(10, 20);
		main(15);
		main("hola");

	}
	public static void main(int m) {
		System.out.println("main method with single param");
		System.out.println(m);
	}
	public static void main(String vikash) {
		System.out.println("main method with different data type");
		System.out.println(vikash);
	}
	
	

	public void test() {
		System.out.println("test method with no input param");

	}

	public void test(int i) {
		System.out.println("test method with single input param");
		System.out.println(i);
	}

	public void test(double d) {
		System.out.println("test method with different data type and single param");
		System.out.println(d);
	}

	public void test(int j, int k) {
		System.out.println("test method with two input param");
		System.out.println(j+k);

	}

}
