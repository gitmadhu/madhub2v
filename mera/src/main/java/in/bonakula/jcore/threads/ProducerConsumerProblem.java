package in.bonakula.jcore.threads;


/**
 * @author Raghavender. V
 */

public class ProducerConsumerProblem {

	public static void main(String[] args) throws Exception {
		// Producer produces some data which Consumer consumes
		Producer obj1=new Producer();
		Consumer obj2=new Consumer(obj1);
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
		t2.start();
		t1.start();
	}
}

class Producer extends Thread{
	// to add data
	StringBuffer sb;
	public Producer() {
		sb=new StringBuffer();
	}
	public void run(){
		synchronized(sb){
		// go on appending data to String Buffer
		for(int i=1; i<=10; i++){
			try{
				sb.append(i+":");
				Thread.sleep(100);
				System.out.println("appending");
			}
			catch (Exception e) {
			}
		}
		sb.notify(); // data production is over, so notify to Consumer Thread
	}
 }
}
class Consumer extends Thread{
	Producer producer;
	public Consumer(Producer producer) {
		 this.producer=producer;
	}
	@Override
	public void run() {
		synchronized (producer.sb) {
	 try{
		 producer.sb.wait();
		 }
	 catch (Exception e) {}
		
	 System.out.println(producer.sb);
		} //sync 
	} // run
} //Consumer