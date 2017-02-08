package ReaderWriterProblem;

public class MoneyTransfer2 extends Thread {
	private BankAccount	account;
	private double	amount;
	
	public MoneyTransfer2(BankAccount account, double amount) {
		this.account = account;
		this.amount = amount;
	}
	
	public void run() {
		synchronized (account) {
			double actualBalance = account.balance;
			double newBalance = actualBalance + amount;
			try {
				sleep((int) Math.random()*100);
			}
			catch (InterruptedException e) { }
			account.balance = newBalance;
		}
	}
}
