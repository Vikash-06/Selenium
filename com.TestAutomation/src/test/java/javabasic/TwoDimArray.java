package javabasic;

public class TwoDimArray {

	public static void main(String[] args) {
		//In 2-D array values stores in matrix format
		String x[][] = new String [3][5];
		
		//first row
		x[0][0]="a";
		x[0][1]="b";
		x[0][2]="c";
		x[0][3]="d";
		x[0][4]="e";
		
		//second row
		
		x[1][0]="a1";
		x[1][1]="b1";
		x[1][2]="c1";
		x[1][3]="d1";
		x[1][4]="e1";
		
		//third row
		
		x[2][0]="a2";
		x[2][1]="b2";
		x[2][2]="c2";
		x[2][3]="d2";
		x[2][4]="e2";
		
		System.out.println(x.length); // total number of rows
		System.out.println(x[0].length); //total number of columns
		System.out.println(x[1][3]);
		
		//to print all the values: we will use for loop
		for(int row = 0; row<x.length; row++) {
			for(int col=0; col<x[0].length; col++) {
				System.out.println(x[row][col]);//abcde    a1 b1 c1 d1 e1     a2 b2 c2 d2 e2
				
			}
			
		}

	}

}
