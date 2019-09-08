package in.bonakula.jcore.Collections;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxValueInArrayWithoutCollections {

	public static void main(String[] args) {
		System.out.println("Enter 5 integer numbers : ");
		Scanner in = new Scanner(System.in);
		int[] intArray = new int[5];

		for (int i = 0; i < 5; i++) {
			intArray[i] = in.nextInt();
		}

		int highest = intArray[0];

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > highest)
				highest = intArray[i];
		}

		System.out.println("Highest Value : " + highest);
		
		// Using Collections
		System.out.println("\nUsing Collections :");
		Arrays.sort(intArray);
		System.out.println("\n Min : " + intArray[0]);
		System.out.println("\n Max : " + intArray[intArray.length-1]);

	}

}
