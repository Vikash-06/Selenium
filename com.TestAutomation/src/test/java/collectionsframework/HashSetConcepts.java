package collectionsframework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		//HashSet is default class in java.
		//HashSet implements Set interface.
		//Set interface does not contain duplicate values however list interface may have the duplicate values
		//In HashSet we can perform some mathmatical operations like union, intersaction and differences.
		
		Set<String> hs = new HashSet<String>();
		hs.add("East");
		hs.add("west");
		hs.add("south");
		hs.add("north");
		hs.add("north");
		
		System.out.println(hs);
		System.out.println(hs.contains("East")); //boolean: true
		
		//TO PRINT ALL THE VALUES WE CAN ALSO USE: for each loop, iterator
		System.out.println("******");
		
		//for each loop
		for(String e: hs) {
			System.out.println(e);
		}
		
		System.out.println("******");
		//iterator
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("******");
		//remove method
		hs.remove("north");
		System.out.println(hs);
		
		//mathmatical operations
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,3,5,7,9,10}));
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {2,4,6,8,10}));
		
		//union
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		
		System.out.println("******");
		//get the intersaction: to find common values for first and second set
		Set<Integer> intersaction = new HashSet<Integer>(first);
		intersaction.retainAll(second);
		System.out.println(intersaction);
		
		System.out.println("******");
		
		//differences method:
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff);
		

	}

}
