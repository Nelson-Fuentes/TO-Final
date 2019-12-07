
public abstract class Collection <E> implements Collector<E> {
	protected int n;
	public boolean isEmpty() {
		return this.n==0;
	}
	public int size() {
		return this.n;
	}
	public abstract void insert(E item);
	
}
