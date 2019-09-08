
/*    We can start a thread in another Thread class
 *    Here we are creating Thread3 class object and
 *    started that thread in Thread4. 
 * 
 */
package in.bonakula.thread;

class Thread3 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=20;i++)
			System.out.println("Thread-3 is executing...."+i);
	}
} 

class Thread4 extends Thread{
	@Override
	public void run() {
		Thread3 Thread3= new Thread3();
		Thread3.start();
		for(int i=1;i<=20;i++)
			System.out.println("Thread-4 is executing...."+i);
	}
}
public class CreateNewThreadInRun {

	public static void main(String[] args) {
		Thread4 Thread4= new Thread4();
		Thread4.start();

	}
}
