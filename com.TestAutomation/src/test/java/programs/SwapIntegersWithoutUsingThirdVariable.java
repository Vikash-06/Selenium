package programs;

public class SwapIntegersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		//swap the above integers y should be 5 and x should be 10
		
		//first method using third variable
		int t;
		t = x; //5
		x = y; //10
		y = t; //5
		
		//second method without using third vairable (using + operator)
		x = x+y; //15
		y = x-y; //15-10=5
		x = x-y; //15-5=10
		
		//Third method without using third variable (using * operator)
		x = x*y; //50
		y = x/y; //5
		x = x/y; //10
		
		
		System.out.println(x);
		System.out.println(y);

	}

}
