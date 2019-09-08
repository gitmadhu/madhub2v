package in.bonakula.jcore.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UnmodifiableCollection {

	/**
	 * @author Raghavender. V
	 */
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("This");
		list.add("is");
		list.add("unmodifiable collection");
		
		System.out.println("Element added to list "+list.get(2));
		
		Collection<String> immutableCol=Collections.unmodifiableCollection(list);
		
		//list.add("Something added..");
		Iterator<String> iterator=immutableCol.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
