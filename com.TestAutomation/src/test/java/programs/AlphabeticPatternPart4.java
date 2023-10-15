package programs;

public class AlphabeticPatternPart4 {
	// program no. 30

	// note:
	// asc number for cap A = 65
	// asc number for small a = 97

	public static void main(String[] args) {
		// A
		// A B
		// A B C
		// A B C D
		// A B C D E

		int alpha = 65;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alpha + j) + " ");
			}
			System.out.println();
		}

	}

}
