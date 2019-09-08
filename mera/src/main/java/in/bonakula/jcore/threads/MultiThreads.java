package in.bonakula.jcore.threads;

/**
 * @author RAGHAVENDER
 */

class Temp {
	// Check the below code without synchronized keyword
	synchronized void function(String s) {
		System.out.println("Hello..");
		System.out.println(s + " World!");
	}
}

class ThreadX extends Thread {
	Temp temp;

	public ThreadX(Temp temp) {
		this.temp = temp;
	}

	@Override
	public void run() {
		temp.function("Java");
	}
}

class ThreadY extends Thread {
	Temp temp;

	public ThreadY(Temp temp) {
		this.temp = temp;
	}

	@Override
	public void run() {
		temp.function("Raghu's");
	}
}

public class MultiThreads {

	public static void main(String[] args) {
		Temp t = new Temp();
		
		ThreadX t1 = new ThreadX(t);
		ThreadY t2 = new ThreadY(t);

		t1.start();
		t2.start();
	}
}
