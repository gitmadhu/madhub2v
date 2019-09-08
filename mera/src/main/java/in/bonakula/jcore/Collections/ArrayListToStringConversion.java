package in.bonakula.jcore.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListToStringConversion {

	public static void main(String[] args) {
		
		String s1="abc";
		String s2=s1;
		String s3=new String("abc");
		
		Set<String> listOfStrings=new HashSet<String>();
		listOfStrings.add(s1);
		listOfStrings.add(s2);
		listOfStrings.add(s3);
		
		System.out.println("Size Of Strings : "+listOfStrings.size());
		
		System.out.println(s2.equals(s3));
		
		//Another piece of code
		List<String> list=new ArrayList<String>();
		
		list.add("apple");
		list.add("banana");
		list.add("pine-apple");
		list.add("orange");
		list.add("apple");    //list allows duplicate values
		
		String[] stringArray=new String[list.size()];
		
		// Convert list to string
		list.toArray(stringArray);
		
		for(String temp:stringArray){
			System.out.println(temp);
		}
		System.out.println("String Array Size : "+stringArray.length);

	}

}
