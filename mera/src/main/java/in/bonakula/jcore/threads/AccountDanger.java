package in.bonakula.jcore.threads;
class Account{
	private int balance=50;
	
	public int getBalance(){
		return balance;
	}
	public void withdraw(int amount){
		balance=balance-amount;
	}
}

public class AccountDanger implements Runnable {
	private Account acc=new Account();
	
	public static void main(String[] args) {
		AccountDanger r=new AccountDanger();
		
		Thread one=new Thread(r);
		Thread two=new Thread(r);
		
		one.setName("raghu");
		two.setName("santhosh");
		
		one.start();
		two.start();
	}
	public void run(){
		for(int x=0;x<5;x++){
			makeWithdrawal(10);
			if(acc.getBalance()<0){
				System.out.println("Account is overdrawn!");
			}
		}
	} // run 
	
// add/remove synchronized key word to makeWithdrawal method and check
private synchronized void makeWithdrawal(int amt){
	if(acc.getBalance()>=amt){
		System.out.println(Thread.currentThread().getName()+" is going to withdraw");
		try{
			Thread.sleep(500);
		}
		catch(InterruptedException ie){}
		acc.withdraw(amt);
		System.out.println(Thread.currentThread().getName()+" completes the withdrawal");
	}
	else{
		System.out.println("Not enough in account for "+Thread.currentThread().getName()
				+" to withdraw "+acc.getBalance());
	}
 }
}
