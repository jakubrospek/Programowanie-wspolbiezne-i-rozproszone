package producerConsumerExample2;

public abstract class Value {
	protected int value;
	abstract public int get();
	abstract public void put(int v);
}