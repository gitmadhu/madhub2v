package in.bonakula.jcore.threads;
/**
 * @author RAGHAVENDER
 */

public class ThreadActiveCount extends Thread {
@Override
public void run() {
	
}
	public static void main(String[] args) {
		
		ThreadActiveCount obj=new ThreadActiveCount();
		System.out.println("Thread Active Count :: "+Thread.activeCount());

	}

}
