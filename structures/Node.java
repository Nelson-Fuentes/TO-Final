
public abstract class Node<E> {
	protected SimpleArrayList<E> data;

	public Node() {
		this.data = new SimpleArrayList<E>();
		this.data.insert(null);
	}
	public Node(E item) {
		this();
	}

	public E getData() {
		return data.get(0);
	}

	public void setData(E data) {
		this.data.set(0, data);
	}
}
