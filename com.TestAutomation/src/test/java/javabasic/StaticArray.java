package javabasic;

public class StaticArray {

	public static void main(String[] args) {
		// array: to store similar data type of values
		// 1. int array
		// lowest index = start from 0
		// upper index = (n-1) here n is the size of array

		int i[] = new int[3]; // 10, 20, 30
		i[0] = 10;            // 0   1    2
		i[1] = 20;
		i[2] = 30;
		
		System.out.println(i[2]);
		System.out.println(i.length);
		for(int k=0; k<i.length; k++) {
			System.out.println(i[k]);
		}
		
        //2.double array
		
		double d[]= new double[3];
		d[0]=10.01;
		d[1]= 10.1;
		d[2]=10.2;
		
		System.out.println(d.length);
		System.out.println(d[1]);
		
		//3. char array
		
		char c[]= new char[3];
		c[0]='1';
		c[1]='a';
		c[2]='B';
		System.out.println(c[1]);
		
		//4. boolean array
		boolean b[]= new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5.String array
		String s1[]= new String[3];
		s1[0]= "south";
		s1[1]="west";
		s1[2]="east";
		System.out.println(s1.length);
		System.out.println(s1[1]);
		for(int m = 0; m<s1.length; m++) {
			System.out.println(s1[m]);
		}
		//Disadvantage: 1. it stores only similar data type of values -----to overcome of this problem, We use Object array.
		//2. size is fixed in static array. - to overcome of this probles we use collection - Arraylist, HashTable (dynamic array) (2-D array)
		
		Object ob[]= new Object[3];
		ob[0]="I am vikash";
		ob[1]= 'M';
		ob[2]= 27;
		
		System.out.println(ob[2]);
		System.out.println(ob[0]);
		for(int z=0; z<ob.length; z++) {
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
