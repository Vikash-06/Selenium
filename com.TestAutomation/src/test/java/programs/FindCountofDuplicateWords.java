package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindCountofDuplicateWords {
	// program no. 14
	public static void main(String[] args) {
		duplicatewords("My name is vikash but My name is not Akash Akash");
		
	}

	public static void duplicatewords(String InputString) {
		// split method
		String words[] = InputString.split(" ");

		// use HashMap
		Map<String, Integer> StoreA = new HashMap<>();

		// use for each loop
		for (String word : words) {
			if (StoreA.containsKey(word)) {
				StoreA.put(word, StoreA.get(word) + 1);
			} else {
				StoreA.put(word, 1);
			}
		}
		
		//to fetch the duplicate records from Map: HashMap
		Set<Entry<String, Integer>> obj = StoreA.entrySet();
		for(Entry<String, Integer> obj1: obj ) {
			if(obj1.getValue()>1) {
				System.out.println(obj1);
			}
		}
		

	}

}
