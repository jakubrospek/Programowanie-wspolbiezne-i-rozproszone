package ReaderWriterProblem;

public class MyFunctionThread extends Thread {
	double x;
	Sum localSum;
	
	MyFunctionThread(double x, Sum s) {
		this.x = x;
		this.localSum = s;
	}
	public double calc(double x) {
		double y = 1.0/Math.exp(x);
		return y;
	}
	public void calcAndAddToSum(double x, Sum s) {
		double y = 1.0/Math.exp(x);
		//double y = x;
		try {
			sleep((int) Math.random()*100);
		}
		catch (InterruptedException e) { }
		synchronized (s) {
			s.sum += y;
		}
	}
	
	public void run() {
		calcAndAddToSum(x,localSum);
	}
}
