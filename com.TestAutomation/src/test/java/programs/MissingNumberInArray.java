package programs;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5 };
		// fing a missing number in array (missing numnber is 3)

		int len = a.length; // 4

		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum = sum + a[i]; // 1+2+4+5= 12
		}
		System.out.println(sum);

		int sum1 = 0;
		for (int j = 1; j <= 5; j++) {
			sum1 = sum1 + j; // 1+2+3+4+5= 15

		}
		System.out.println(sum1);
		System.out.println("Missing number is::" + (sum1 - sum));

	}

}
