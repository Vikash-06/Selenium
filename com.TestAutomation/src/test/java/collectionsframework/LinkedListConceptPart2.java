package collectionsframework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConceptPart2 {

	public static void main(String[] args) {
		// LL is a default class in java.
		// it can be used as list, stack and queue
		// it allows the null entry
		// it is dynamic in nature hence insertion and deletion can easily implemented.
		// it can contain duplicate values.
		// In ll manipulation is fast as because there is no need to do shifting.
		// LL Constructor
		// a. LinkList(); b. LinkedList(Collections c);

		LinkedList<String> llc = new LinkedList<String>();
		System.out.println(llc.size());

//add method
		llc.add("Vikash"); // 0
		llc.add("Sonal"); // 1
		llc.add("Ruby"); // 2
		llc.add("Aakash"); // 3
		llc.add("shivani"); // 4
		llc.add("prince"); // 5
		llc.add("sahil"); // 6

		System.out.println(llc.size()); // to find the size of the list use .size() method.
		System.out.println(llc.get(2)); // to fetch any random value from list use .get(index) method

		// to print all the values we can use iterator, for each loop, for loop, while
		// loop
		// 1. iterator

		Iterator<String> abc = llc.iterator();
		while (abc.hasNext()) {
			System.out.println(abc.next());
		}
		System.out.println("**************");

		// 2.for each loop
		for (String ab1 : llc) {
			System.out.println(ab1);
		}

		System.out.println("**************");

		// 3. for loop

		for (int m = 0; m < llc.size(); m++) {
			System.out.println(llc.get(m));
		}

		System.out.println("**************");

		// while loop
		int num = 0;
		while (llc.size() > num) {
			System.out.println(llc.get(num));
			num++;

		}

		llc.add(2, "Lokesh");// 2
		System.out.println(llc.size());
		System.out.println(llc);

		LinkedList<String> llc1 = new LinkedList<String>();
		llc1.add("noida");// 0
		llc1.add("Ghazaiabad");// 1
		llc1.add("delhi");// 2
		System.out.println(llc1.size());

		// addall method : to add all the values from list llc1 to llc

		llc.addAll(llc1);
		System.out.println(llc);
		System.out.println(llc.size());

		// addFirst Method:

		llc.addFirst("Mombasa");
		System.out.println(llc);

		// addLast Method:
		llc.addLast("harry");
		System.out.println(llc);

		// removeFirst Method:
		llc.removeFirst();
		System.out.println(llc);

		// removeLast Method:
		llc.removeLast();
		System.out.println(llc);
		
		//remove with indexing
		llc.remove(0);
		System.out.println(llc);
		
		//clear method: to remove all the values
		llc.clear();
		System.out.println(llc);
		
		LinkedList<String> llc2 = new LinkedList<String>();
		llc2.add("java");
		llc2.add("python");
		llc2.add("ruby");
		llc2.add("javascript");
		System.out.println(llc2);
		
		//reverse the linkedlist
		
		//By using iterator method
		Iterator<String> itr = llc2.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*********");
		
		//Sorting: we have a Collections.sort  method
		Collections.sort(llc2);
		System.out.println(llc2);
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
