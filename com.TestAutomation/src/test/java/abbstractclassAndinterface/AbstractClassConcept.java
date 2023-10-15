package abbstractclassAndinterface;

public abstract class AbstractClassConcept {
    //Abstract class should have at least one abstract method.
	//abstract method does not have method body. it is just a method prototype
	//we do not create object of abstract class
	//Partially abstraction.
	
	public abstract void test1();

	public void test2() {
		System.out.println("test2 method");
	}

	public void test3() {
		System.out.println("test3 method");
	}

}
