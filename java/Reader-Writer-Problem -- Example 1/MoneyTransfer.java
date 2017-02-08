package ReaderWriterProblem;

public class MoneyTransfer extends Thread {
	private BankAccount	account;
	private double	amount;
	
	public MoneyTransfer(BankAccount account, double amount) {
		this.account = account;
		this.amount = amount;
	}
	
	public void run() {
		double actualBalance = account.balance;
		double newBalance = actualBalance + amount;
		try {
			sleep((int) Math.random()*100);
		}
		catch (InterruptedException e) { }
		account.balance = newBalance;
	}
}
