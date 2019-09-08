package in.bonakula.jcore.threads;


class Common {
	
	public synchronized void syncMethod1(){
		System.out.println("syncMethod1 called");
		
		try{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("syncMethod1 done!!");
	}
	
	public void method1(){
		System.out.println("method1 called..");
		
		try{
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("method1 done!!");
	}
}

public class SyncAndNonSyncMethodsExecution extends Thread{
	private int id=0;
	private Common common;
	
	public SyncAndNonSyncMethodsExecution(String name, int no, Common object){
		super(name);
		common=object;
		id=no;
	}
	
	@Override
	public void run() {
		System.out.println("Running thread : "+ this.getName());
		
		try{
			if(id==0){
				common.syncMethod1();
			}
			else{
				common.method1();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Common c = new Common();
		
		SyncAndNonSyncMethodsExecution t1=new SyncAndNonSyncMethodsExecution("Thread-1", 0, c);
		SyncAndNonSyncMethodsExecution t2=new SyncAndNonSyncMethodsExecution("Thread-2", 1, c);
		
		t1.start();
		t2.start();
	}

}
