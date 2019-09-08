package in.bonakula.jcore.misc;

//  Replace a character with other character

public class StringReplace {
	public static void main(String[] args) {
		String s = "123145156167189";

		char[] a = s.toCharArray();
		char b[] = new char[a.length]; // For output

		for (int i = 0; i < a.length; i++) {
			if (a[i] == '1') {
				b[i] = 'a';
			} else {
				b[i] = a[i];
			}
		}

		System.out.println(a);
		System.out.println("\n'1' is replaced by 'a' ");
		System.out.println(b);

	}
}
