package javabasic;

public class IncrementDecrementPart {

	public static void main(String[] args) {
		int x=2;
		int y=x++; //post increment
		System.out.println(x); //3
		System.out.println(y); //2
		
		int m = 2;
		int n = ++m;  //pre increment
		System.out.println(m); // 3
		System.out.println(n);  //3
		
		int a = 2;
		int b = a--; //post decrement
		System.out.println(a);//1
		System.out.println(b);//2
		
		int c= 2;
		int d = --c; //pre decrement
		System.out.println(c);//1
		System.out.println(d);//1
		

	}

}
