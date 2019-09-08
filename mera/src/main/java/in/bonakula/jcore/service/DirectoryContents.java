package in.bonakula.jcore.service;

import java.io.File;
import java.io.IOException;

public class DirectoryContents {

	
	public static void main(String[] args) throws IOException {
		
		File file=new File(".");
		File[] files=file.listFiles();
		
		for(File fileArray:files){
			if(fileArray.isDirectory()){
				System.out.println("Directory : ");
			}
			else{
				System.out.println("File : ");
			}
			System.out.println(fileArray.getCanonicalPath());
		}

	}

}
