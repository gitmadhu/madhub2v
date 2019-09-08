package in.bonakula.jcore.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StringArrayToCollection {

	public static void main(String[] args) {
		String stringArray[]={"sachin","yuvraj","dhoni","virat kohli"};
		
		// Convert String array to Collection
		
		Collection c=Arrays.asList(stringArray);
		
		System.out.println(c);
		
		// Convert to ArrayList
		
		ArrayList al=new ArrayList(c);
		System.out.println();
		System.out.println("Using ArrayList.."+al); // Or u can use iterator

	}

}
