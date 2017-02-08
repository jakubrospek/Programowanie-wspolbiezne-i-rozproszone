package DeadlockExample;

public class MoneyTransfer2  extends Thread {
	private BankAccount	accountFROM;
	private BankAccount	accountTO;
	private double	amount;

	public MoneyTransfer2(BankAccount accountFROM, 
			BankAccount accountTO, double amount) {
		this.accountFROM = accountFROM;
		this.accountTO = accountTO;
		this.amount = amount;
	}
	
	public void run() {
		synchronized (accountFROM) {
			// we are waiting some time
			// to see the effect of a deadlock
			try {
				sleep((int) Math.random()*500);
			} catch (InterruptedException e) { }

			synchronized (accountTO) {
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
	}
}
