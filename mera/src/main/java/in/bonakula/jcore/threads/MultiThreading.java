package in.bonakula.jcore.threads;
/**
 * @author RAGHAVENDER
 */

class ThreadA extends Thread{
	
	@Override
	public void run() {
		try{
			Thread.sleep(1000);
		}
		catch (Exception e) {	}
		
		for(int i=1; i<=10;i++){
			System.out.println(" In Thread A :: "+i);
		}
	}
}

class ThreadB extends Thread{
	
	@Override
	public void run() {
		
		for(int i=1; i<=10;i++){
			System.out.println(" In Thread B :: "+i);
		}
	}
}

class ThreadC extends Thread{
	
	@Override
	public void run() {
		
		for(int i=1; i<=10;i++){
			System.out.println(" In Thread C :: "+i);
		}
	}
}

public class MultiThreading {

	public static void main(String[] args) throws Exception {
		ThreadA t1= new ThreadA();
		ThreadB t2= new ThreadB();
		ThreadC t3= new ThreadC();
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread.sleep(1000);
		System.out.println("Hello World!");
	}
}
