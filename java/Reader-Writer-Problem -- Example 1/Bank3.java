package ReaderWriterProblem;

public class Bank3 {
	public static void main(String[] args) {
	BankAccount myAccount = new BankAccount();
		for (int i = 0; i < 10; i++) {
			MoneyTransfer3 t1 = new MoneyTransfer3(myAccount, 10.00);
			MoneyTransfer3 t2 = new MoneyTransfer3(myAccount, 10.00);
			MoneyTransfer3 t3 = new MoneyTransfer3(myAccount, 10.00);
			t1.start();
			t2.start();
			t3.start();
			try {
				t1.join();
				t2.join();
				t3.join();
			} catch (InterruptedException e) {}
		}
	System.out.println("On my account are " 
		+ myAccount.balance + " zl.");
	}
}
