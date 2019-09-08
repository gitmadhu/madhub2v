package in.bonakula.jcore.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class X implements Serializable {
	// java compiler does not complain if we declare a static member field as transient
	transient static String transientStaticVar = "transientStaticVar";
	transient final String transientFinalVar = "transientFinalVar";
	transient static final String transientStaticFinalVar = "transientStaticFinalVar";
	transient String transientVar = "transientVar"; 	//transient variables can not be serialized
}

public class SerializationTestWithTransient {

	public static void main(String[] args) {

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
					"logInfo.txt"));

			X x = new X();

			System.out.println("Before Serialization...");
			System.out.println("transientStaticVar = " + X.transientStaticVar);
			System.out.println("transientFinalVar = " + x.transientFinalVar);
			System.out.println("transientStaticFinalVar = "
					+ X.transientStaticFinalVar);
			System.out.println("transientVar = " + x.transientVar);

			out.writeObject(x);
			out.close();

			x.transientStaticVar = "newTransientStaticVar";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("logInfo.txt"));
			X x1=(X)in.readObject();
			
			System.out.println("\n\n After Serialization...");
			System.out.println("transientStaticVar = " + X.transientStaticVar);
			System.out.println("transientFinalVar = " + x1.transientFinalVar);
			System.out.println("transientStaticFinalVar = "
					+ X.transientStaticFinalVar);
			System.out.println("transientVar = " + x1.transientVar);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
