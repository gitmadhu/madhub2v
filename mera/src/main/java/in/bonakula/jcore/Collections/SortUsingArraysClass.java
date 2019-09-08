package in.bonakula.jcore.Collections;

import java.util.Arrays;
/**
 * @author Raghavender. V
 */
public class SortUsingArraysClass {

	public static void main(String[] args) {
		String[] strNames=new String[]{"raghu", "madhu","cnu", "hari"};
		
		System.out.println("Before Sorting : ");
		
		for(int i=0; i<strNames.length; i++){
			System.out.println(strNames[i]);
		}
		
		System.out.println("After sorting : ");
		
		Arrays.sort(strNames);
		for(int i=0; i<strNames.length; i++){
			System.out.println(strNames[i]);
		}
		

	}

}
