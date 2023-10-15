package OopConcept;

public class FunctionsInJava {

//Non Static method
	
	//main method is the first executing point
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		
		//to call first method
		obj.test1();
		
		//to call 2nd method
		int l = obj.test2();
		System.out.println(l);
		
		//to call 3rd method
		String s1 = obj.test3();
		System.out.println(s1);
		
		//to call 4th method
		int z = obj.test4(30, 10);
		System.out.println(z);
		
		
		

	}

	// 1. when no input and no output
	// void means it does not return any value

	public void test1() {
		System.out.println("test1 method");
	}

	// 2. when no input but get some output
	// return type = int

	public int test2() {
		System.out.println("test method");
		int a = 10;
		int b = 20;
		int c = a + b;// 30
		return c;
	}

	// 3. when no input but some o/p
   //return type = String
	public String test3() {
		System.out.println("test3");
		String s = "Selenium";
		return s;

	}

	// 4. when you pass some input and get some output
	// return type = int
	public int test4(int x, int y) {
		System.out.println("test4 method");
		int d = x / y;
		return d;

	}

}
