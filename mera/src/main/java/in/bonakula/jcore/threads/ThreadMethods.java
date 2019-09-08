package in.bonakula.jcore.threads;

public class ThreadMethods extends Thread{

	public static void main(String[] args) {
		ThreadMethods obj1=new ThreadMethods();
		ThreadMethods obj2=new ThreadMethods();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		obj1.setName("Thread A");
		obj2.setName("Thread B");
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());
		
		obj1.setPriority(10);
		obj1.setPriority(1);
		
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		
		System.out.println("Current Thread : "+Thread.currentThread());
		System.out.println(Thread.activeCount());

	}

}
