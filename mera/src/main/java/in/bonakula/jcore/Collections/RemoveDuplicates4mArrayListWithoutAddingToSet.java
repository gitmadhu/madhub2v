package in.bonakula.jcore.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicates4mArrayListWithoutAddingToSet {

	public static void main(String[] args) {
		List<String> duplicateList=new ArrayList<String>();
		
		duplicateList.add("tiger");
		duplicateList.add("lion");
		duplicateList.add("lion");
		duplicateList.add("tiger");
		duplicateList.add("rhino");
		
		System.out.println("\n Original List : "+duplicateList);
		
		List<String> nonDuplicateList=new ArrayList<String>();
		
		Iterator<String> duplicateIterator=duplicateList.iterator();
		
		while(duplicateIterator.hasNext()){
			String duplicateWord=duplicateIterator.next();
			
			if(nonDuplicateList.contains(duplicateWord)){
				duplicateIterator.remove();
			}
			else{
				nonDuplicateList.add(duplicateWord);
			}
		}
		
		System.out.println("\n After Removing Duplicates : "+nonDuplicateList);

	}

}
