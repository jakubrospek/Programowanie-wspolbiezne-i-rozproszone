package printABC;

class ABCRunnable implements Runnable {
	public void run() {
		for (char i = 'A'; i <= 'Z'; i++) {
			// print the letter
			System.out.print(i);
			// do nothing for some time
			beLazy.doNothingForOneSecond();
		}
	}
}
