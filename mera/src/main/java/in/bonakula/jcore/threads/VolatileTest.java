package in.bonakula.jcore.threads;

public class VolatileTest {
	private static volatile int var=0;

	public static void main(String[] args) {
		new ChangeListener().start();
		new ChangeMaker().start();
	}
	
	static class ChangeListener extends Thread{
		@Override
		public void run() {
			int localValue=var;
			while(localValue<5){
				if(localValue!=var){
					System.out.println("Got Change for var : "+var);
					localValue=var;
				}
			}
		}
	}
	
	static class ChangeMaker extends Thread{
		@Override
		public void run() {
			int localValue=var;
			while(var<5){
				System.out.println("Incrementing var :: "+(localValue+1));
				
				var=++localValue;
				
				try{
					Thread.sleep(500);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
