package programs;

public class FindPrimeNumbers {

	public static boolean IsprimeNumber(int num) {
		// edge/corner condition
		// lowest prime number is 2
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;

	}
	
	public static void getPrimeNumbers(int num) {
		for(int i=2; i<=num; i++) {
			if(IsprimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(IsprimeNumber(4));
		getPrimeNumbers(50);
	}
}
