package collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// Arraylist is a dynamic array which means size is not fixed.
		// Arraylist can store different or similar data type of values.
		// Arraylist can store duplcate values as well.
		// Arraylist use add method to adding or storing the values.

//non generic
		ArrayList ab = new ArrayList();
		ab.add(10);// o
		ab.add(20);// 1
		ab.add(30);// 2
		System.out.println(ab.size()); // find the size of array
		System.out.println(ab.get(2)); // to fetch the value by using index

		ab.add("vik");// 3
		ab.add(true);// 4
		ab.add('A');// 5
		ab.add(10.01);// 6
		System.out.println(ab.size());
		System.out.println(ab.get(5));

		// to print all the values we will use for loop

		for (int i = 0; i < ab.size(); i++) {
			System.out.println(ab.get(i));
		}

		// geneic

		ArrayList<Integer> ab1 = new ArrayList<Integer>();
		ab1.add(100);// 0
		ab1.add(200);// 1
		System.out.println(ab1.size());
		System.out.println(ab1.get(0));

		// how to store user defined class object in Arraylist object

		// Employee Class Object
		// create arraylist
		ArrayList<Employee> ab2 = new ArrayList<Employee>();
		Employee e1 = new Employee("vikash", 29, "qa");
		Employee e2 = new Employee("Aakash", 27, "dev");
		Employee e3 = new Employee("Sonal", 25, "admin");
		ab2.add(e1);
		ab2.add(e2);
		ab2.add(e3);

		// iterator to traverse the values
		Iterator<Employee> it = ab2.iterator();
		while(it.hasNext()) {
		Employee emp =	it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
			
			
		}
		
		//addall
		
		ArrayList<String> ab3 = new ArrayList<String>();
		ab3.add("A");
		ab3.add("b");
		ArrayList<String> ab4 = new ArrayList<String>();
		ab4.add("ab");
		ab4.add("abc");
		
		
		ab3.addAll(ab4);
		System.out.println(ab3);
		
		
		//removeall
		ab3.removeAll(ab4);
		System.out.println(ab3);
		
		
		//retainall
		//retain all method willgive the common value
		ArrayList<String> ab5 = new ArrayList<String>();
		ab5.add("james");
		ab5.add("tom");
		ArrayList<String> ab6 = new ArrayList<String>();
		ab6.add("james");
		ab6.add("lol");
		
		ab5.retainAll(ab6);
		System.out.println(ab5);
		
		
	}

}
