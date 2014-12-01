package com.mera;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

import au.com.bytecode.opencsv.CSVReader;

public class CreateImpex {
	

	public static void main(String[] args) {
		
		
		Scanner street_import_script_scanner;
		try {
			
			 CSVReader reader = new CSVReader(new FileReader("44 stores.txt"), ';');
			 
			final File baseDir = new File("44stores");
			if (!baseDir.exists())
			{
				baseDir.mkdir();
			}

			 String [] nextLine;
			 String storeCode = null;
			    try {
					while ((nextLine = reader.readNext()) != null) {
					   System.out.println(nextLine[0] );
					   
					   storeCode = nextLine[0];
					   final File storeFile = new File(baseDir, storeCode.trim());
					   File template = new File("store_impex_template.impex");
					   final Scanner template_scanner = new Scanner(template);
					   
					   Files.copy(template.toPath(), storeFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
					   
					   Path path = Paths.get(storeFile.getPath());
					   Charset charset = StandardCharsets.UTF_8;

					   String content = new String(Files.readAllBytes(path), charset);

						content = content.replaceAll("STORECODE", nextLine[0]);
						content = content.replaceAll("STOREPKCODE", nextLine[1]);
						content = content.replaceAll("STREETPKCODE", nextLine[2]);
						content = content.replaceAll("STOREPAGELABEL", nextLine[3]);
						content = content.replaceAll("STREETCODE", nextLine[4]);
						
						  Files.write(path, content.getBytes(charset));
					   
					}
				} catch (IOException e) {
					System.out.println("problem creating ...."+storeCode);
				}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
