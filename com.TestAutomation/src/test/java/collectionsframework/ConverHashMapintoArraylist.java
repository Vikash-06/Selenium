package collectionsframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ConverHashMapintoArraylist {

	public static void main(String[] args) {

		Map<String, Integer> Empdata = new HashMap<>();
		Empdata.put("Wipro", 5000);
		Empdata.put("infosys", 2000);
		Empdata.put("EXL", 6000);
		Empdata.put("GENPACT", 7000);
		Empdata.put("COZANT", 1000);

		System.out.println(Empdata.size());
		System.out.println(Empdata.get("EXL"));

		System.out.println("******");

		// to print all the values use iterator: over the set(pair)

		Iterator<Entry<String, Integer>> uj = Empdata.entrySet().iterator();
		System.out.println("Data for Company");
		while (uj.hasNext()) {
			Entry<String, Integer> mm = uj.next();
			String p = mm.getKey();
			int h = mm.getValue();

			System.out.println(p + "=" + h);

			System.out.println("******");
		}

		System.out.println("******");

		// how to convert HashMap keys into ArrayList
		List<String> Company = new ArrayList<>(Empdata.keySet());
		System.out.println("Name of the companies");
		for (String e : Company) {

			System.out.println(e);
		}
		System.out.println("******");

		// how to convert values in ArrayList
		List<Integer> emp = new ArrayList<>(Empdata.values());
		System.out.println("Data of employees");
		for (Integer a : emp) {
			System.out.println(a);
		}

	}

}
