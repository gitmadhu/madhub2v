package in.bonakula.jcore.threads;
/**
 * @author RAGHAVENDER
 */

public class StartVsRunCall {

	public static void main(String[] args) {
		// Creating two threads for start and run method call
		
		Thread startThread=new Thread(new Task("start()"));
		Thread runThread=new Thread(new Task("run()"));
		
		startThread.start();  //calling start method of Thread - will execute in new Thread
		runThread.run();      //calling run method of Thread - will execute in current Thread
	}
	
	/*
	 * Simple Runnable implementation
	 */
	
	private static class Task implements Runnable{
		private String caller;
		
		public Task(String caller){
			this.caller=caller;
		}
		
		@Override
		public void run() {
			System.out.println("Caller : "+ caller +" ; code on this thread is executed by : "+
		Thread.currentThread().getName());
			
		}
	}

}
