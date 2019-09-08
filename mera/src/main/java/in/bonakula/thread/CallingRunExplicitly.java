
/*  If we are calling start() and run() explicitly on Thread object,
 *  run() will execute like a common method.
 *  Where as start() will execute as a Thread.
 * 
 */
package in.bonakula.thread;

class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println("Thread-1 is executing...."+i);
	}
}

class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println("Thread-2 is executing...."+i);
	}
}

public class CallingRunExplicitly {
  public static void main(String[] args) {
	Thread1 thread1=new Thread1();
	Thread2 thread2=new Thread2();
	
	thread1.start();
	
	thread1.run();
	
	thread2.start();
	
}
}
