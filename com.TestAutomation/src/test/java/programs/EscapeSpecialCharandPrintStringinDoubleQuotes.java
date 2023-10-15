package programs;

public class EscapeSpecialCharandPrintStringinDoubleQuotes {
	//Program no. 34

	public static void main(String[] args) {
		// /"Hello"/
		// /'Hello'/
		// "Hello"
		// I love "java" and "movies" and "programming"
		// 'I love "java" and "movies" and "programming"'

		System.out.println("/\"Hello\"/");
		System.out.println("/'Hello'/");
		System.out.println("\"Hello\"");
		System.out.println("I love \"java\" and \"movies\" and \"programming\"");
		System.out.println("'i love \"java\" and \"movies\" and \"programing\"'");
		System.out.println(Xpath("vikash"));
	}

	public static String Xpath(String name) {
		// input[@id='name']
		String Xpath = "//input[@id='" + name + "']";
		return Xpath;

	}

}
