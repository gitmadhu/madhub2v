package in.bonakula.jcore.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFile {

	
	public static void main(String[] args) {
		
		try{
		Properties properties=new Properties();
		properties.setProperty("favouriteAnimal", "Lion");
		properties.setProperty("favouriteCountry", "India");
		properties.setProperty("favouriteCompany", "MphasiS");
		properties.setProperty("favouritePlace", "Araku");
		
		File file=new File("src/com/mphasis/resources/test3.xml");
		FileOutputStream fileOutput=new FileOutputStream(file);
		properties.store(fileOutput, "Favourite Things");
		
		fileOutput.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}
	

}
