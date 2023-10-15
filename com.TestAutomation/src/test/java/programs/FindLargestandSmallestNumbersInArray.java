package programs;

public class FindLargestandSmallestNumbersInArray {

	public static void main(String[] args) {
		
		int num[]= {12,10,-20,50,-40};
		 int largest = num[0];//50
		 int smallest = num[0];//-40
		 for(int i = 1; i<num.length; i++) {
			 if(num[i]>largest) {
				 largest = num[i]; //50
			 }else if(num[i]<smallest) {
				 smallest = num[i]; //-40
			 }
		 }
		 System.out.println("values of largest number::"+ largest);
		 System.out.println("values of smallest number::"+ smallest);
		
	}

}
