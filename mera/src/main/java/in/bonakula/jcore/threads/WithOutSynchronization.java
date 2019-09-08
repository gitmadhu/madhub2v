package in.bonakula.jcore.threads;
class State{
	public int cnt=0;
}

public class WithOutSynchronization implements Runnable{
	State s;
	public WithOutSynchronization(State s){
		this.s=s;
	}
	public void run(){
		synchronized (s) {
		int x=s.cnt;
		s.cnt=x+1;
		System.out.println("x = "+x);
		System.out.println("s.cnt = "+s.cnt);
		}
	}
	public static void main(String[] args) {
	State s=new State();
	WithOutSynchronization ws=new WithOutSynchronization(s);
	Thread t1=new Thread(ws);
	Thread t2=new Thread(ws);
	t1.start();
	t2.start();
	}

}
