package in.bonakula.jcore.threads;

class DThread extends Thread
{
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println("in thread "+i);
			i=i+1;
		}
	}
}
public class DaemonThreadDemo {
	public static void main(String[] args) {
		DThread obj=new DThread();
		obj.setDaemon(true);
		obj.start();
		
		for(int i=1;i<=30;i++)
		System.out.println("in main "+i);
	}

}
