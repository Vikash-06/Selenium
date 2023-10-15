package programs;

public class FindFactorialofaNumber {
	// fact of 4 = 4*3*2*1=24
	// fact of 5 = 5*4*3*2*1=120
	// fact of 2 = 2*1=2
	// fact of 1 = 1
	// fact of 0 = 1

	// method 1. Without recursive (using for loop)

	public static int factorial(int num) {
		int fact = 1;
		if (num == 0) {
			return 1;

		}
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		return fact;

	}

	// Method 2. with recursive

	public static int fact(int num) {
		if (num == 0)
			return 1;
		else
			return (num * fact(num - 1));// 4*3*2*1

	}

	public static void main(String[] args) {

		System.out.println(factorial(5));
	}

}
