package in.bonakula.jcore.service;

public class CallByValue {

	/**
	 * @author Raghavender V.
	 */
	public static void main(String[] args) {
     String s1="Old String";
     System.out.println("Before calling method : "+s1);
     test(s1);
     System.out.println("After calling Method : "+s1);
     
	}

	private static void test(String s1) {
		s1="New String";		
	}

}
