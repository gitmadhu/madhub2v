/**
	 * @Raghavender. V
	 */
package in.bonakula.jcore.service;

import java.io.FileNotFoundException;
import java.io.IOException;

class Test {
	/*
	 *   FileNotFoundException extends IOException (Checked Exception)
	 *   super class constructor should throw exception of subtype of subclass constructor exception
	 *   and vice-versa raises exception; 
	 */
	
	// Note : Check the below code by exchanging the exceptions in super and sub classes
	public Test() throws FileNotFoundException{
		System.out.println("Super Class Constructor  ");
	}
}

class SubTest extends Test{
	public SubTest() throws IOException{
		System.out.println("Subclass Constructor ");
	}
}
public class ConstructorException {
		public static void main(String[] args) {
		  try {
			new SubTest();
		   } 
		  
		  catch (IOException e) {
			e.printStackTrace();
		}
		
		  /*try {
			new SubTest();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}

}
