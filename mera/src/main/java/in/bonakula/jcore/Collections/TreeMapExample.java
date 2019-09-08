package in.bonakula.jcore.Collections;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("Green", "Car");
		map.put("Blue", "Sky");
		map.put("Yellow", "Submarine");
		map.put("Red", "Carpet");
		System.out.println("Map elements:");

		// ordered by insertion order
		for (String key : map.keySet()) {
			System.out.println("Key/Value: " + key + "/" + map.get(key));
		}
		
		System.out.println("Map size:" + map.size());
		
		System.out.println("Removing element 'Sky'...");
		map.remove("Blue");
		
		System.out.println("Map size:" + map.size());
		
		// iterating by iterator
		// ordered by key in ascending order
		
		System.out.println("Map elements (ascending):");
		Iterator<String> i = map.keySet().iterator();
		while (i.hasNext()) {
			String key = i.next();
			System.out.println("Key/Value: " + key + "/" + map.get(key));
		}
		
		// ordered by key in descending order
		System.out.println("Map elements (descending):");
		Iterator<String> id = map.descendingKeySet().iterator();
		
		while (id.hasNext()) {
			String key = id.next();
			System.out.println("Key/Value: " + key + "/" + map.get(key));
		}
		
		System.out.println("Map contains key 'Red'? " + map.containsKey("Red"));
		System.out.println("Map contains object 'Sky'? "
				+ map.containsValue("Sky"));
		System.out.println("Removing all elements...");
		
		map.clear();
		
		System.out.println("Map is empty now? " + map.isEmpty());
		map.put(null, "NullTest"); // allows null value!
	}

}
