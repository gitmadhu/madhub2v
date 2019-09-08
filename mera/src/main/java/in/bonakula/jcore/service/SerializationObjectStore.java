package in.bonakula.jcore.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationObjectStore {

	
	public static void main(String[] args) {
		try{
		//Create instances of FileOutputStream and ObjectOutputStream
		
		FileOutputStream fos=new FileOutputStream("books.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		//Create a book instance ..This book object then will be stored in the file
		Book book=new Book("5-45-565855","Head First Java","James Gosling");
		
		oos.writeObject(book);
		
		//Flush and close the ObjectOutputStream
		oos.flush();
		oos.close();
		
		//We have the book saved ..Now it is the time to read back and display
		
		FileInputStream fis=new FileInputStream("books.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		
		book=(Book)ois.readObject();
		System.out.println(book);
		
		ois.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}

	}

}

class Book implements Serializable{
	private String isbn;
	private String title;
	private String author;
	
	public Book(String isbn,String title,String author){
		this.isbn=isbn;
		this.title=title;
		this.author=author;
	}
	
	public String toString(){
		return "[BOOK : "+isbn+", "+title+", "+author+"]";
	}
}