package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountofDuplicateChar {
	// Program no. 32
	// print count of the duplicate character from string

	public static void main(String[] args) {
		PrintDuplicateCharacters("I love Coding");
	}

	public static void PrintDuplicateCharacters(String Strname) {
		// Edge Conditions
		if (Strname == null) {
			System.out.println("NULL String");
			return;
		}
		if (Strname.isEmpty()) {
			System.out.println("Empty String");
			return;
		}
		if (Strname.length() == 1) {
			System.out.println("String lenght is 1");
			return;
		}

		char charary[] = Strname.toCharArray();
		Map<Character, Integer> Storemap = new HashMap<>();
		for (Character imo : charary) {
			if (Storemap.containsKey(imo)) {
				Storemap.put(imo, Storemap.get(imo) + 1);
			} else {
				Storemap.put(imo, 1);
			}
		}

		// to fetch the duplicate entries from Map: HashMap

		Set<Entry<Character, Integer>> queue = Storemap.entrySet();
		for (Entry<Character, Integer> queue1 : queue) {
			if (queue1.getValue() > 1) {
				System.out.println(queue1.getKey() + ":" + queue1.getValue());
			}
		}

	}

}
