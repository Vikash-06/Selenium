package programs;

public class ReverseAnInteger {
	//program no. 3

	public static void main(String[] args) {
		// Method First by using Algorithm
		
		int num = 12345;
		
		int rev = 0;
		
		while (num != 0) {
			rev = rev * 10 + num % 10; //54321
			num = num / 10; //

		}
		System.out.println("Reverse number is::" + rev);
		
		
		// Method 2nd by using StringBuffer
		
//		StringBuffer af = new StringBuffer(String.valueOf(num));
//		System.out.println(af.reverse());
		
	}

}
