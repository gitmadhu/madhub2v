package in.bonakula.jcore.threads;

public class StaticSyncDemo extends Object{

	public static synchronized void staticA(){
		System.out.println("entering staticA()");
		
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("leaving staticA()");
	}
	
	public static void staticB(){
		System.out.println("entering staticB()");
		
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println("leaving staticB()");
	}
	public static void main(String[] args) {
		Runnable runA= new Runnable() {
			
			@Override
			public void run() {
				StaticSyncDemo.staticA();
			}
		};
		
		Thread threadA=new Thread(runA,"A");
		threadA.start();
		
		try {
		      Thread.sleep(200);
		    } 
		
		catch (InterruptedException x) {
		    }

		    Runnable runB = new Runnable() {
		      public void run() {
		        StaticSyncDemo.staticB();
		      }
		    };

		    Thread threadB = new Thread(runB, "B");
		    threadB.start();

	}

}
