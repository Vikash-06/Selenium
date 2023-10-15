package javabasic;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());  //size of arrayList
		ar.add(400);//3
		ar.add(500);//4
		System.out.println(ar.size());
		ar.add("vikash");//5
		ar.add('A');//6
		ar.add(10.01);//7
		ar.add("bob");//8
		System.out.println(ar.size()); //9
		ar.remove(8);
		System.out.println(ar.size()); //8
		
		 //to print all the values we use for loop
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		//how to store only one data type of values only
		
		//it will store only integer type of values
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);//0
		ar1.add(20);//1
		
		System.out.println(ar1.size());
		
		//to find the values by indexing user "get method"
		System.out.println(ar1.get(1));
		
		//to store string values then we can define the list type as String
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("TOM");//0
		ar2.add("jerry");//1
		System.out.println(ar2.size());//2
		System.out.println(ar2.get(0)); //tom
	
	//Arralist is a class and dynamic in nature.
	//We can store mupltiple values in different data type in ArrayList
	//In ArrayList we use add to method to add values in ArrayList
	//to find the size of ArrayList we use .size() method.
		

	}

}
