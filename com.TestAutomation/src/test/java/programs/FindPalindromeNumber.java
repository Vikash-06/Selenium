package programs;

public class FindPalindromeNumber {
	//program no. 11

	//palindrome number= 151,454,161,34543
	
	public static void palindromenumber(int num) {
		
		int r;
		int sum=0;
		int t;
		t=num;
		while(num>0) {
			r=num%10;//151
			sum=sum*10+r;//151
			num=num/10;
			
		}
		if(t==sum) {
			System.out.println("palindrome number");
		}else {
			System.out.println("not a palindrome number");
		}
	}
	
	
	public static void main(String[] args) {

		palindromenumber(151);
		
	}

}
