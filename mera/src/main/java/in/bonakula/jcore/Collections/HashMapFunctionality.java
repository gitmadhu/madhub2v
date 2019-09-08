package in.bonakula.jcore.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapFunctionality {

	/**
	 * @author Raghavender V.
	 */
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("malli", new Double(459));
		hm.put("raghu", new Double(999));
		hm.put("cnu", new Double(357));
		hm.put("cnu", " Key Overridden"); // overrides the previous one
		//hm.put(null, new Integer(143));
		//hm.put(null, "Null key overridden"); // overrides the previous one
		hm.put("john", null);
		hm.put("john1", null);
		
		System.out.println("Printing Hashmap directly..");
		System.out.println(hm);

		// iterating hash map using iterator()
		System.out.println("\nDisplay using Iterator..");
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println("Key = " + me.getKey() + " ; Value = " + me.getValue());
		}// while

		/*
		 To obtain only keys
		 While iterating over keySet(), keys should not be null(raises NullPointerException); 
		*/
		//Comment the null entry keys and run below code
		
		
		 System.out.println("\nDispalying only keys of the Hashmap :");
		 Set set1=hm.keySet(); 
		 Iterator i1=set1.iterator();
		 while(i1.hasNext()){ 
			 Object obj=i1.next();
			 System.out.println("keySet : "+obj.toString()); 
			}
		
		 
		 /*
		   To obtain only values 
		   While iterating over values, values should not be null(raises NullPointerException); 
		 */
		 
		 // Comment the null entry values and run below code 
		 
		 /*
		 Collection collection=hm.values(); 
		 Iterator i2=collection.iterator(); 
		 while(i2.hasNext()){ 
			 Object obj2=i2.next();
		 System.out.println("values : "+obj2.toString()); 
		 }
		 */
	}
}
/*
 * HashMap : some methods -> clear, containsKey,containsValue, entrySet, put,get,
 *  isEmpty, keySet, putAll, remove, size, values.
  
  The underlying datastructure is HashTable.
  Duplicate keys are not allowed, but values are allowed
  Insertion Order is not Preserved, its based on hash code of keys
  Heterogeneous objects are allowed for both keys and values
  null key is allowed only once null values are allowed multiple times
 */