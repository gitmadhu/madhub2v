package in.bonakula.jcore.service;

import java.io.IOException;

public class RunAnotherAppl4mJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			System.out.println("Opening Notepad");
			Runtime runtime=Runtime.getRuntime();
			Process process=runtime.exec("mspaint");
			
			try{
				Thread.sleep(10000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println("Closing Notepad");
			process.destroy();
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
