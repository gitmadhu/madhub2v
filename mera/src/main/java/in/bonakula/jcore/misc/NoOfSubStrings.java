
//This is an Example to print the index of a substring

package in.bonakula.jcore.misc;

public class NoOfSubStrings {

	public static void main(String[] args) {
		
	String text = "012ab567ab0123ab";

	// finding all occurrances forward: Method #1
	for (int i = text.indexOf("ab"); i != -1; i = text.indexOf("ab", i+1)) {
	    System.out.println(i);
	} // prints "3", "8", "14"

	// finding all occurrences forward: Method #2
	for (int i = -1; (i = text.indexOf("ab", i+1)) != -1; ) {
	    System.out.println(i);
	} // prints "3", "8", "14"
	}
}
