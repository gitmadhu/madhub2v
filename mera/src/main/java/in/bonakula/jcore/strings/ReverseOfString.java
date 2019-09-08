package in.bonakula.jcore.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author RAGHAVENDER
 */

public class ReverseOfString {

	public static void main(String[] args) throws Exception {
		String original;
		String reverse = "";

		Scanner in = new Scanner(System.in);

		// BufferedReader in= new BufferedReader(new
		// InputStreamReader(System.in));

		System.out.println("Enter a string to reverse : ");

		original = in.nextLine();
		// original=in.readLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		System.out.println("\nAfter reversing the string : " + reverse);
		
		
		// Check whether it is Polyndrome 
		if(original.equals(reverse)){
			System.out.println("\nEntered String is a polyndrome ");
		}
		else{
			System.out.println("\nEntered String is  Not a polyndrome ");
		}

	}

}
