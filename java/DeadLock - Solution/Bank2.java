package DeadlockExample;

public class Bank2 {
	public static void main(String[] args) {
		BankAccount accountA = new BankAccount(1);
		BankAccount accountB = new BankAccount(2);
		for (int i = 0; i < 100; i++) {
			MoneyTransfer2 t1 = new MoneyTransfer2(accountA, accountB, 10.00);
			MoneyTransfer2 t2 = new MoneyTransfer2(accountB, accountA, 10.00);
			t1.start();
			t2.start();
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {}
		}
		System.out.println("On my account are: "); 
		System.out.println("A: "+ accountA.balance + " zl.");
		System.out.println("B: "+ accountB.balance + " zl.");
	}
}
