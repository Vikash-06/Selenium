package programs;

public class FindArmstrongNumber {
	// program no. 12

	public static void isArmstrongNumber(int num) {
		// What is armsStrongNumber
		// eg. 153 = 1*1*1+5*5*5+3*3*3= 1+125+27=153
		int r;
		int cube = 0;
		int t;
		t = num;
		while (num > 0) {
			r = num % 10;//3
			cube = cube + (r * r * r);//27+125+1=153
			num = num / 10;

		}
		if (t == cube) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not a armstrong number");
		}

	}
	public static void main(String[] args) {
isArmstrongNumber(152);
	}

}
