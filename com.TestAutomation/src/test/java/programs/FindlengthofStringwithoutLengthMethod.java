package programs;

public class FindlengthofStringwithoutLengthMethod {
	// Program no. 36
	// find the length of string withour using length method

	public static void main(String[] args) {
		String str = "Testing";

		System.out.println(str.toCharArray().length);

		System.out.println(str.split("").length);

		System.out.println(str.lastIndexOf(""));

		int count = 0;
		for (char c : str.toCharArray()) {
			count++;

		}
		System.out.println(count);
	}

}
