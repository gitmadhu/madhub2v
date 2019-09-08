package in.bonakula.jcore.service;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class ResourceBundleTest {

	public static void main(String[] args) {
		
		ResourceBundle rb=ResourceBundle.getBundle("com.mphasis.resources.test1");
		
		Enumeration<String> enumKeys=rb.getKeys();
		
		while(enumKeys.hasMoreElements()){
			String key=enumKeys.nextElement();
			String value=rb.getString(key);
			
			System.out.println(key+" : "+value);
		}
	}

}
