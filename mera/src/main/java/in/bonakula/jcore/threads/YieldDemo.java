package in.bonakula.jcore.threads;

/**
 * @author Raghavender. V
 */
class Yield extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}

public class YieldDemo {

	public static void main(String[] args) {
		Yield y=new Yield();
		y.start();
		
		for(int i=1;i<=10;i++){
			System.out.println("Main Thread");
		}

	}

}
