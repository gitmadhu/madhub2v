
/*   We cannot start a thread multiple times.
 *    It will give Illegal Thread State Exception.
 *    But Executes only once...
 * 
 */
package in.bonakula.thread;

class Thread5 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=400;i++)
			System.out.println("Current Thread::"+Thread.currentThread().getName()+
					"...Thread-5 is executing...."+i);
	}
}


public class InvokeStartMultipleTimes {
	public static void main(String[] args) {
		Thread5 thread5 = new Thread5();
		thread5.setName("Ravan");
		thread5.start();
		//thread5.start();
	}
	

}
