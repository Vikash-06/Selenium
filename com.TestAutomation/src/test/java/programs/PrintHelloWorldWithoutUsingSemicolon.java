package programs;

public class PrintHelloWorldWithoutUsingSemicolon {
	// print Hello World without using semicolon (;)

	public static void main(String[] args) {

		//1.
		if(System.out.printf("Hello World" + "\n")== null) {
			
		}
		//2.
		if(System.out.append("Hello World" + "\n")==null) {
			
		}
		//3.
		if(System.out.append("Hello World").equals(null)) {
			
		}
	}

}
