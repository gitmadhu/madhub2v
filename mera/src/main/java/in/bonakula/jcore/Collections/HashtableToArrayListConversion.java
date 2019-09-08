package in.bonakula.jcore.Collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

public class HashtableToArrayListConversion {

	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable=new Hashtable<String, Integer>();
		hashtable.put("raghu", 1500);
		hashtable.put("cnu", 2540);
		hashtable.put("madhu", 8500);
		hashtable.put("malli", 9999);
		
		// Convert to ArrayList
		
		ArrayList<String> keys=new ArrayList<String>(hashtable.keySet());
		
		System.out.println("HashTable keys in ArrayList : "+keys);
		
		// Using iterator
		Iterator<String> i=keys.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
		ArrayList<Integer> values=new ArrayList<Integer>(hashtable.values());
		
		System.out.println("HashTable values in ArrayList : "+values);
		
		//Using for-each loop
		for(Integer temp: values){
			System.out.println(temp);
		}

	}

}
