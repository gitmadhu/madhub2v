package in.bonakula.jcore.threads;

public class DaemonThread implements Runnable{
	private String threadName;
	
	public DaemonThread(String thread) {
		this.threadName=threadName;
	}
	public void run(){
		System.out.println("Running [ "+ threadName +" ]");
	}
	 
	/**
	 * @author Raghavender. V
	 */
	public static void main(String[] args) {
		Thread t1= new Thread(new DaemonThread("FirstThread"));
		Thread t2= new Thread(new DaemonThread("SecondThread"));
		
		// t1 is a deaemon thread
		t1.setDaemon(true);
		t1.start();
		// t2 is a user thread
		t2.start();
		
	}

}
