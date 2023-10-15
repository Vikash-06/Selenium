package javabasic;

public class TestMainMethod {
	//Can we overload a main method?
	//Yes, We can overload the main method.

	public static void main(String[] args) {
		System.out.println("main method");
		main("system");
		main(100);
		main(40,160);
		Testmainparttwo.main(args);
	}

	public static void main(String args) {
		System.out.println(args);

	}

	public static void main(int y) {
		System.out.println(y);
	}

	public static void main(int a, int b) {
		System.out.println(a + b);
	}

}
