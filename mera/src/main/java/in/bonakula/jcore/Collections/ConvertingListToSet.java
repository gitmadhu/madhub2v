package in.bonakula.jcore.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertingListToSet {

	public static void main(String[] args) {
		System.out.println("List values..");
		
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("9");
		list.add("7");
		list.add("2");
		list.add("2");
		
		System.out.println("List size : "+list.size());
		
		for(String temp:list){
			System.out.println(temp);
		}
		
		Set<String> set= new HashSet<String>(list);
		
		System.out.println("Set values..(Eliminates duplicates)");
		System.out.println("List size after adding to set : "+list.size());
		
		for(String temp:set){
			System.out.println(temp);
		}
		
		System.out.println("Set size : "+set.size());

	}
}
