package ReaderWriterProblem;

import java.util.LinkedList;

public class ParallelSum {

	public static void main(String[] args) {
		int nThreads = 10;
		LinkedList<MyFunctionThread> mfList = 
				new LinkedList<MyFunctionThread>();
		Sum s = new Sum();
		
		for (int i=0; i<nThreads; i++) {
			MyFunctionThread myf = new MyFunctionThread(i,s);
			mfList.add(myf);
		}
		
		System.out.println("number of threads " + mfList.size());

		for (MyFunctionThread el : mfList) {
			el.start();
		}

		for (MyFunctionThread el : mfList) {
			try { el.join(); }
			catch (InterruptedException e) { }
		}

		System.out.println("The sum is " + s.sum);
	}

}
