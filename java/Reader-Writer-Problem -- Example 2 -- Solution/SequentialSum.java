package ReaderWriterProblem;
import java.util.*;

public class SequentialSum {

	public static void main(String[] args) {
		int nThreads = 10;
		LinkedList<MyFunction> mfList = new LinkedList<MyFunction>();
		for (int i=0; i<nThreads; i++) {
			MyFunction myf = new MyFunction();
			mfList.add(myf);
		}
		Sum s = new Sum();
		System.out.println("number of threads " + mfList.size());
		int i=0;
		for (MyFunction el : mfList) {
			el.calcAndAddToSum((double) i, s);
			i++;
		}
		System.out.println("The sum is " + s.sum);
	}

}
