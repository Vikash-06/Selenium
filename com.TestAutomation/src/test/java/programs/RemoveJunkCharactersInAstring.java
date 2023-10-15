package programs;

public class RemoveJunkCharactersInAstring {
	//program no. 2

	public static void main(String[] args) {
		String s = "!@$%^ test 1234  ^&*^* Selenium";
		// To remove the junk characters or special characters in a String, We can use "Regular Expression"
		

		// Regular Expression "[^a-zA-Z0-9]"
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
