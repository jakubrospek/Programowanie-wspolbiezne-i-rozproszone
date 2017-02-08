package DeadlockExample;

public class BankAccount {
	private int accountNumber;
	public double balance = 0;
	public BankAccount(int accountNumber) { this.accountNumber = accountNumber; }
	public int getAccountNumber() { return accountNumber; }

	
}
