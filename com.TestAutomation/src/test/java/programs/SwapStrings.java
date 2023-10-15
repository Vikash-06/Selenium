package programs;

public class SwapStrings {
	// program no. 9

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";

		// step 1. append a and b
		a = a + b; // HelloWorld

		// step 2. Store initial string a in string b
		b = a.substring(0, a.length() - b.length());
		
        //Step 3. store initial string b in string a
		a = a.substring(b.length());
		System.out.println("the value of a::" + a);
		System.out.println("the value of b::" + b);
		
	}

}
