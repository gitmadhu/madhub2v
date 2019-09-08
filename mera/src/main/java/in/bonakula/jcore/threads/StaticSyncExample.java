package in.bonakula.jcore.threads;

public class StaticSyncExample {
	public static void main(String[] args) {
		hello();
		goodBye();
	}
	
	public static synchronized void hello(){
		System.out.println("hello..");
	}
	
	public static void goodBye(){
		synchronized (StaticSyncExample.class) {
		System.out.println("good bye..");
		}
	}

}
