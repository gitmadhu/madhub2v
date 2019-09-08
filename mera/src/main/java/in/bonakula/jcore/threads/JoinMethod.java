package in.bonakula.jcore.threads;
class MyThread implements Runnable{
	String name; // name of the thread
	Thread t;
	public MyThread(String threadName) {
		name=threadName;
		t=new Thread(this,name);
		System.out.println("New Thread : "+t);
		t.start();
	}
	@Override
	public void run() {
		try{
			for(int i=5;i>0;i--){
				System.out.println(name+" : "+i);
				Thread.sleep(1000);
			}
		}
			catch (InterruptedException e) {
			}
			System.out.println(name+" existing");
		}
	}

public class JoinMethod {

	public static void main(String[] args) {
		MyThread obj1=new MyThread("One");
		MyThread obj2=new MyThread("Two");
		MyThread obj3=new MyThread("Three");
		
		System.out.println("Thread one is alive : "+obj1.t.isAlive());
		System.out.println("Thread one is alive : "+obj2.t.isAlive());
		System.out.println("Thread one is alive : "+obj3.t.isAlive());
		
		try{
			System.out.println("Waiting for threads to finish..");
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}
		catch(InterruptedException ie){
			System.out.println("Main thread interrupted");
		}
		System.out.println("Thread one is alive : "+obj1.t.isAlive());
		System.out.println("Thread one is alive : "+obj2.t.isAlive());
		System.out.println("Thread one is alive : "+obj3.t.isAlive());
		
		System.out.println("Main thread existing");
		

	}

}
