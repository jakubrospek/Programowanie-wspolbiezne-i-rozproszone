package DeadlockExample;

public class MoneyTransfer1  extends Thread {
	private BankAccount	accountFROM;
	private BankAccount	accountTO;
	private double	amount;

	public MoneyTransfer1(BankAccount accountFROM, 
			BankAccount accountTO, double amount) {
		this.accountFROM = accountFROM;
		this.accountTO = accountTO;
		this.amount = amount;
	}
	
	public void run() {
		double balanceFROM = accountFROM.balance - amount;
		double balanceTO = accountTO.balance + amount;
		try {
			sleep((int) Math.random()*100);
		} catch (InterruptedException e) { }
		accountFROM.balance = balanceFROM;
		try {
			sleep((int) Math.random()*100);
		} catch (InterruptedException e) { }
		accountTO.balance = balanceTO;
	}
}
