package programs;

public class Print1to100withoutloop {
	// program no.26
	//using recursive (when a function called itself)

	public static void main(String[] args) {
		//printNum(1);
		printNumbers(5, 200);
	}

	public static void printNum(int num) {
		if (num <= 100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	public static void printNumbers(int startingNum, int EndingNum) {
		if(startingNum<=EndingNum) {
			System.out.println(startingNum);
			startingNum++;
			printNumbers(startingNum, EndingNum);
		}
	}

}
