package in.bonakula.jcore.strings;

public class RemoveUnwantedCharsFromString {

	public static void main(String[] args) {
		String s="(9247)-826%3*5!!9@";
		
		System.out.println("Original String : "+s);
		
		s=s.replaceAll("[^a-z A-Z 0-9]", "");
		
		System.out.println("\nAfter Removing unwanted chars :"+s);

	}

}
