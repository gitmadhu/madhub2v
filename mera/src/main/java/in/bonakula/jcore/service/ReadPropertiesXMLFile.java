package in.bonakula.jcore.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ReadPropertiesXMLFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("src/com/mphasis/resources/test.xml");
			FileInputStream fileInput=new FileInputStream(file);
			
			Properties properties=new Properties();
			properties.loadFromXML(fileInput);
			
			fileInput.close();
			
			Enumeration enumKeys=properties.keys();
			
			while(enumKeys.hasMoreElements()){
				String key=(String)enumKeys.nextElement();
				String value=properties.getProperty(key);
				
				System.out.println(key+" :  "+value);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
