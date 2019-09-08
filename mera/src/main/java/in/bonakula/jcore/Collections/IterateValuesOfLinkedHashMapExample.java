package in.bonakula.jcore.Collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
 * @author RAGHAVENDER
 */
public class IterateValuesOfLinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap lh=new LinkedHashMap();
		lh.put("1", "One");
		lh.put("2", "Two");
		lh.put("3", "Three");
		lh.put("3", "Three");
		
		
		System.out.println("Output : "+lh);
		
		Collection c=lh.values();
		
		Iterator iterator=c.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}

}
