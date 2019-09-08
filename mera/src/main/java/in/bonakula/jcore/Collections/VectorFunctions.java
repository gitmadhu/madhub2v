package in.bonakula.jcore.Collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorFunctions {

	/**
	 * @author Raghavender. V
	 */
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("A");
		v.add("C");
		v.add("B");
		v.add("D");			     //as duplicates are allowed and insertion order is preserved
	//  v.add(new Integer(3));   // heterogeneous objects are allowed
	//  v.add(null);			 //null insertion is possible 
		
		System.out.println("\nBefore Sorting "+v);
		
		System.out.println("\nAfter Sorting : ");
		Collections.sort(v);
		System.out.println("Sorted Vector Contains : "+v);
		
		// search element by binarySearch in Collections class
		int index=Collections.binarySearch(v, "C");
		System.out.println("Element Found At : "+index);
		
		//using Enumeration
		System.out.println("Using Enumeration");
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		// Using for each loop with Enumeration
		System.out.println(" Using for each loop with Enumeration");
		for(Enumeration e1=v.elements();e1.hasMoreElements();)
			System.out.println(e1.nextElement());
		
		// using iterator
		System.out.println("Using Iterator");
		Iterator i=v.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		// Using ListIterator
		System.out.println("Using ListIterator");
		ListIterator listIterator=v.listIterator();
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
			
		}

	}

}
