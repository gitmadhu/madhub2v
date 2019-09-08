package in.bonakula.jcore.threads;

class TestRunnable implements Runnable{
	public void run(){
		for(int x=1;x<=6;x++){
			System.out.println("Run by "+Thread.currentThread().getName()+" , x is "+x);
		}// for
	 }
}
public class RnnableUsage {

	/**
	 * @author Raghavender. V
	 */
	public static void main(String[] args)throws InterruptedException {
		TestRunnable r= new TestRunnable();
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		
		t1.setName("Ragz");
		//t1.setPriority(1);
		t2.setName("Cnu");
		
		t1.start();
		t2.join();
		t2.start();
		//System.out.println("t1.getId() : "+t1.getId());
		//System.out.println("t2.getId() : "+t2.getId());

	}

}
