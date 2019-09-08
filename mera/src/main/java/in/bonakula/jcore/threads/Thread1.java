package in.bonakula.jcore.threads;

public class Thread1 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++)
			System.out.println("in run : " + i);
	}

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();

		for (int i = 1; i <= 10; i++)
			System.out.println("in main : " + i);
	}
}
