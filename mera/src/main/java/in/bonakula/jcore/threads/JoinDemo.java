package in.bonakula.jcore.threads;

/**
 * @author Raghavender. V
 */

class Join implements Runnable {
	public void run() {
		for (int i = 1; i <= 4; i++) {
			System.out.println("This is Thread : "
					+ Thread.currentThread().getName());
		}
	}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Join j = new Join();
		Thread t1 = new Thread(j, "1");
		Thread t2 = new Thread(j, "2");
		Thread t3 = new Thread(j, "3");
		Thread t4 = new Thread(j, "4");

		t1.start();
		t1.join();
		t2.start();
		//t2.join();
		t3.start();
		t4.start();
	}
}

/*
 * join() method joins the next thread at the end of the current thread.
 * After current thread stops execution , the next thread executes.
 */
