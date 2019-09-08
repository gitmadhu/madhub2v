package in.bonakula.jcore.service;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Raghavender. V
 */

class Super{
	public void test() throws IOException{			// ArithmeticException is Unchecked Exception
		System.out.println("Super.test()");			// Check by IOException(Checked exception)
	}
}

class Sub extends Super{
	@Override
	
	public void test() throws FileNotFoundException{
		System.out.println("Sub.test()");
	}
}
public class ExceptionsInSuperAndSub {
	public static void main(String[] args) {
		/*
		 * In subclass overriding method, we can throw the same Exception or its subtype;
		 * but not its super type(raises an Exception) if they are checked Exception
		 * 
		 * In case of Unchecked Exception, we may ignore the exception in
		 * subclass overridden method or throw or handle the same or its subtype
		 */
		
		try {
			Sub subRef=new Sub();
			subRef.test();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
