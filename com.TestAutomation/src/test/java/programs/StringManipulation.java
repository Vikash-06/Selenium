package programs;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "The rains have started here selenium";

		String str1 = "The rains Have started here selenium";

		// to find length of String
		System.out.println(str.length()); // 27

		// to find the character value by indexing
		System.out.println(str.charAt(5)); // a

		// to find the indexing value of a character
		System.out.println(str.indexOf('s')); // 8

		// to find the indexing value of s (2nd occurance)
		System.out.println(str.indexOf('s', str.indexOf('s') + 1)); // 15

		// to find the indexing value of s (3rd occurance)
		System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s') + 1) + 1)); // 28

		// to find the indexing of a word
		System.out.println(str.indexOf("have")); // 10

		// to find the indexing of the word which is not availble in string
		System.out.println(str.indexOf("Hello")); // -1

		// string comparision

		// to comparing string str and str1 by equals method
		System.out.println(str.equals(str1)); // False

		// TO ignore the case sensitive in strings we can use..
		System.out.println(str.equalsIgnoreCase(str1)); // true

		// to fetch the sub string from a string
		System.out.println(str.substring(0, 9));

		// how to trim a string (trim only before space and after space)
		String s = "     Hello World   ";
		System.out.println(s.trim()); // Hello World

		// To remove the space between words use replace method
		System.out.println(s.replace(" ", "")); // HelloWorld

		String date = "02-01-2022";
		System.out.println(date.replace("-", "/")); // 02/01/2022

		// how to use split method
		String s1 = "My_Name_is_Vikash_Tyagi";
		String grp[] = s1.split("_");
		for (int i = 0; i < grp.length; i++) {
			System.out.println(grp[i]); // My Name is Vikash Tyagi
		}

		// to concate the values
		
		String sp = "Care";
		System.out.println(sp.concat("s")); // Cares

		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;

		System.out.println(x + y);
		System.out.println(a + b);
		System.out.println(x + y + (a + b));
		System.out.println(a + b + x + y);
	}

}
