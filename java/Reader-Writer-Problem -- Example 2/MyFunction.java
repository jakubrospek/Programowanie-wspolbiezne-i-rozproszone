package ReaderWriterProblem;
import java.lang.Math;

public class MyFunction {
	public double calc(double x) {
		double y = 1.0/Math.exp(x);
		return y;
	}
	public void calcAndAddToSum(double x, Sum s) {
		double y = 1.0/Math.exp(x);
		s.sum += y;
	}
}
