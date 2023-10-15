package javaPrograms;

public class ReverseNumbers {
	// program 3: how to reverse numbers

	public static void main(String[] args) {
		int i = 12345;
		int rev = 0;
		while (i != 0) {
			int reminder = i % 10;// 4
			rev = rev * 10 + reminder;// 54321
			i = i / 10;

		}
		System.out.println(rev);

	}

}
