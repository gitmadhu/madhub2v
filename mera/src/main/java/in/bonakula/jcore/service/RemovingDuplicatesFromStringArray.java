package in.bonakula.jcore.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicatesFromStringArray {

	public static void main(String[] args) {
		
		// String array with duplicate values
		String[] data = { "Raghu", "B", "C", "Raghu", "A", "C", "A", "A" };
		System.out.println("Original Array : " + Arrays.toString(data));

		// Convert it to list as we need the list object to create set object
		List<String> list = Arrays.asList(data);
		Set<String> set = new HashSet<String>(list);
		
		//System.out.println(set);

		System.out.println("After removing duplicates : ");
		System.out.println(set);

		// Create an array to convert the set back to array

		String[] result = new String[set.size()];
		set.toArray(result);

		for (String s : result) {
			System.out.println(s);
		}

	}

}
