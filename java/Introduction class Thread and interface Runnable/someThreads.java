package printABC;

public class someThreads {
	public static void main(String[]args) {
		ABCThread t1 = new ABCThread();
		ABCThread t2 = new ABCThread();
		
		t1.start();
		t2.start();
	}
}