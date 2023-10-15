package collectionsframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConceptPartone {

	public static void main(String[] args) {
		// HashMap is class in java which implements Map Interface.
		// HashMap stores only unique.
		// HashMap stores data in the form of Key & value
		// HashMap can have a single null key and multiple null values.
		// HashMap is non-Synchronised --no thread safe
		// it may have the concurrent mofificate exception --( fail - fast condition)
		// there is no shifting while using remove method
		// no order means there is no concept of indexing.
		// values in the form of key and values.

		Map<Integer, String> hm = new HashMap<Integer, String>();

		// put method

		hm.put(1, "east");
		hm.put(2, "west");
		hm.put(3, "north");
		hm.put(4, "south");
		hm.put(5, "northeast");

		System.out.println(hm.get(1)); // east
		System.out.println(hm.get(5));// null
		System.out.println(hm);

		// remove method
		hm.remove(3);
		System.out.println(hm);

		// how to print all the values

		// a. for each loop with entrySet method

		for (Entry<Integer, String> v : hm.entrySet()) {
			System.out.println(v.getKey() + " " + v.getValue());

		}
		System.out.println("***********");
		System.out.println("***********");

		// b. iterator: over the keys: by using keySet() method
		Iterator<Integer> itb = hm.keySet().iterator();
		while (itb.hasNext()) {
			int key = itb.next();
			String value = hm.get(key);
			System.out.println(key + " " + value);

		}
		System.out.println("***********");
		System.out.println("***********");

		// iterator: over the Set(Pair): by using entrySet

		Iterator<Entry<Integer, String>> ep = hm.entrySet().iterator();
		while (ep.hasNext()) {
			Entry<Integer, String> jj = ep.next();
			int l = jj.getKey();
			String o = jj.getValue();
			System.out.println(l + " " + o);

		}

		System.out.println("***********");

		// how to store class objects of Employee class
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee e1 = new Employee("vikash", 20, "qa");
		Employee e2 = new Employee("sonal", 21, "admin");
		Employee e3 = new Employee("Aakash", 22, "dev");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		// for each loop with entrySet

		for (Entry<Integer, Employee> z : emp.entrySet()) {
			int key = z.getKey();
			Employee e = z.getValue();
			System.out.println("Employee " + key + " info ");
			System.out.println(e.name + " " + e.age + " " + e.dept);

		}

	}

}
