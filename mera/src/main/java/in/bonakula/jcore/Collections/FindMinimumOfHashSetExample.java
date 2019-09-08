package in.bonakula.jcore.Collections;

import java.util.Collections;
import java.util.HashSet;

public class FindMinimumOfHashSetExample {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(new Long("123"));
		hs.add(new Long("456"));
		hs.add(new Long("789"));
		hs.add(new Long("753"));
		
		Object obj=Collections.min(hs);
		
		System.out.println("Minimum element of hashset is : "+obj);
		
		
	}

}
