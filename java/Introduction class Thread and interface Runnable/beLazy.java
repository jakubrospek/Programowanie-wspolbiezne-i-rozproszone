package printABC;

public class beLazy {
	public static void doNothingForOneSecond() {
		try {
			Thread.sleep(200);
		}
		catch (InterruptedException e) {
		}
	}
}
