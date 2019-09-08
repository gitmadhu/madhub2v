package in.bonakula.jcore.Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableFunctionality {

	/**
	 * @author Raghavender V.
	 */
	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
		
		ht.put("raghu", new Integer(35000));
		ht.put("raghu", "how r u "); // overrides previous one
		
		//ht.put(null, "hi");        // raises RuntimeException--NullPointerException--null keys or null values not allowed
		//ht.put("NotAccepted", null); // raises RuntimeException--NullPointerException 
		
		ht.put("suresh", "hello");
		ht.put("ram", "hello");//Values can be duplicates
		
		System.out.println("Displaying Hashtable directly..");
		System.out.println(ht);
		
		//Iterating through Iterator
		System.out.println("\nDisplaying Hashtable using iterator()..");
		Set<Map.Entry> set=ht.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext()){			
			Map.Entry me=(Map.Entry)i.next();
			System.out.println("key="+me.getKey()+" ; value="+me.getValue());
		}

	}

}
