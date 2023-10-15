package javabasic;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		h.put(1, 10);// 0
		h.put(2, 20);// 1
		h.put(3, 30);// 2

		System.out.println(h.size());
		System.out.println(h.get(3));

		h.put('A', "TOM");// 3
		h.put('B', "Jerry");// 4

		System.out.println(h.size());
		System.out.println(h.get('B'));

		// to print all the values
		Hashtable<Integer, String> hh = new Hashtable<Integer, String>();
		hh.put(4, "vikash");
		hh.put(5, "sonal");

		for (Entry<Integer, String> ee : hh.entrySet()) {
			System.out.println(ee.getKey() + " " + ee.getValue());
		}

		// to store only integers key and integers value only
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 100);
		h1.put(2, 200);
		System.out.println(h1.size());
		System.out.println(h1.get(1));

		// to store only integers key and string as value
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2.put(1, "bob the builder");
		h2.put(2, "Shinchan");
		// h2.put(3, 100); //error
		System.out.println(h2.size());
		System.out.println(h2.get(1));

		// notes: In Hashtable data stores in the form of "key" and "value"
		// we use put method to add data in Hashtable
		// Hashtable is dynamic and can store multiple data type of values.
		// Hashtable is synchronised.
	}

}
