package in.bonakula.test;

public class StringTest {

	public static void main(String[] args) {
		
		String s1=new String("MphasiS");
		s1.concat("Limited");			
		
		String s2=s1.concat(" Limited ");
		
		
		System.out.println("Output : "+s1.concat("an HP company"));   
		
		System.out.println("Output : "+s2);   // Prints MphasiS Limited

		System.out.println("Output : "+s1);	  // Prints MphasiS
	}

}
