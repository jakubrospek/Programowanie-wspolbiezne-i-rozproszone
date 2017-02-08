package ReaderWriterProblem;

public class MoneyTransfer3 extends Thread {
	private BankAccount	account;
	private double	amount;
	
	public MoneyTransfer3(BankAccount account, double amount) {
		this.account = account;
		this.amount = amount;
	}
	
	synchronized public void run() {
		double actualBalance = account.balance;
		double newBalance = actualBalance + amount;
		try {
			sleep((int) Math.random()*100);
		}
		catch (InterruptedException e) { }
		account.balance = newBalance;
	}
/*
	public void run() {
		synchronized (this) {
			double actualBalance = account.balance;
			double newBalance = actualBalance + amount;
			try {
				sleep((int) Math.random()*100);
			}
			catch (InterruptedException e) { }
			account.balance = newBalance;
		}
	}
*/
}
