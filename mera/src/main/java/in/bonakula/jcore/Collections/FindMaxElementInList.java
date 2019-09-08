package in.bonakula.jcore.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxElementInList {

	public static void main(String[] args) {
		 List<Integer> intList=new ArrayList<Integer>();
		 
		 intList.add(new Integer(5));
		 intList.add(new Integer(1));
		 intList.add(new Integer(6));
		 intList.add(new Integer(99));
		 
		 Object max=Collections.max(intList);
		 
		 System.out.println("Max Element In List : "+max);

	}

}
