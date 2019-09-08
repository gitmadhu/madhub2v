package in.bonakula.jcore.Collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Raghavender. V
 */
public class BinarySearch {

	public static void main(String[] args) throws Exception {

		BufferedReader searchKey = new BufferedReader(new InputStreamReader(System.in));

		int[] array = new int[6];
		System.out.println("Enter six numbers : ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(searchKey.readLine());
		}

		System.out.println("Enter the number to be searcehd : ");
		int search = Integer.parseInt(searchKey.readLine());

		binarySearch(array, search);
	}

	private static void binarySearch(int[] array, int search) {
		int p = -1, low = 0, mid, high = 6;
		
		while (low <= high) {
			mid = (low + high) / 2;
			
			if (search == array[mid]) {
				p = mid;
				break;
			} 
			
			else if (search > array[mid]) {
				low = mid + 1;
			} 
			
			else if (search < array[mid]) {
				high = mid - 1;
			}
		} // while
		if (p == -1)
			System.out.println("Number does not exist in the array ");
		else {
			System.out.println("Number exists at index : " + (p ));
			System.out.println("Number found at position: "+(p+1));
		}

	}
}

/*
Binary Search Algorithm

Algorithm is quite simple. It can be done either recursively or iteratively:

1. Get the middle element;
2. If the middle element equals to the searched value, the algorithm stops;
3. Otherwise, two cases are possible:
    * searched value is less, than the middle element. In this case, go to the step 1 for the part of the array, 
    * before middle element.
    * searched value is greater, than the middle element. In this case, go to the step 1 for the part of the array, 
    * after middle element.

Now we should define, when iterations should stop. First case is when searched element is found. Second one is when 
subarray has no elements. In this case, we can conclude, that searched value doesn't present in the array.
Examples

Example 1. Find 6 in {-1, 5, 6, 18, 19, 25, 46, 78, 102, 114}.

Step 1 (middle element is 19 > 6):     -1  5  6  18  19  25  46  78  102  114

Step 2 (middle element is 5 < 6):      -1  5  6  18  19  25  46  78  102  114

Step 3 (middle element is 6 == 6):     -1  5  6  18  19  25  46  78  102  114

*/