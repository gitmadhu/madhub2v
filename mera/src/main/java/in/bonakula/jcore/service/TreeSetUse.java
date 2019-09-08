package in.bonakula.jcore.service;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetUse {

	public static void main(String[] args) {
		TreeSet<String> treeSet=new TreeSet<String>();
		treeSet.add("1");
		treeSet.add("3");
		treeSet.add("2");
		treeSet.add("5");
		treeSet.add("4");
		
		System.out.println("Tree Set : "+treeSet);
		System.out.println("Lowest value stored in java TreeSet is : "+treeSet.first());
		System.out.println("Highest value stored in java TreeSet is : "+treeSet.last());
		
		
		SortedSet sortedSet=treeSet.tailSet("3");
		System.out.println("Tail Set contains : "+sortedSet);
		
		String elements[]={"A","B","C","D","G","F"};
		TreeSet set=new TreeSet(Arrays.asList(elements));
		System.out.println("Tree Set Strings : "+set);
		System.out.println(set.subSet("C", "F"));
		System.out.println(set.subSet("C", "Z"));

	}

}
