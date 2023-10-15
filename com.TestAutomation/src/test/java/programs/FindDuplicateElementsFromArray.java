package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElementsFromArray {

	public static void main(String[] args) {
		String names[] = { "java", "Ruby", "Python", "c", "Javascript", "java", "Python" };
		// find the duplicate string

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println(names[i]);
				}
			}
		}
		System.out.println("****");

		// Using HuashSet
		// Hashset is a class, Implements Set interface and stores only unique values

		Set<String> store1 = new HashSet<>();
		for (String name : names) {
			if (store1.add(name) == false)
				System.out.println(name);
		}
		System.out.println("****");

		// Using HashMap
		// HashMap is a class, Implements Map interface and stores duplicate values and
		// stores values in the form of key & value

		Map<String, Integer> store2 = new HashMap<>();
		for (String james : names) {
			Integer count = store2.get(james);
			if (count == null) {
				store2.put(james, 1);
			} else {
				store2.put(james, ++count);
			}
		}

		// fetch the data from HashMap
		Set<Entry<String, Integer>> pool = store2.entrySet();
		for (Entry<String, Integer> pool1 : pool) {
			if (pool1.getValue() > 1) {
				System.out.println(pool1.getKey());
			}
		}

	}

}
