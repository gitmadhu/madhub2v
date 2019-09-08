package in.bonakula.jcore.Collections;

public class Intersect {
	static int[] a = { 1, 2, 3, 3, 5, 6, 7, 7, 7, 8 };
	static int[] b = { 2, 2, 2, 2, 4, 5, 8, 10 };

	public static void main(String[] args) {
		int j = 0;

		for (int i = 0; i < a.length; i++) {
			while (i + 1 < a.length && a[i + 1] == a[i]) {
				i++;
			}

			while (j + 1 < a.length && b[j + 1] == b[j]) {
				j++;
			}

			if (a[i] == b[j]) {
				System.out.print(a[i] + " ");
			} 
			else 
				if (b[j] < a[i]) {
				j++;
			}
		}//for

	}

}
