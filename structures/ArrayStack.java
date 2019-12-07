public class ArrayStack<E> extends ArrayStructures<E> implements Stack<E>{

	
	public void insert(E item) {
		if (this.isFull()) {
			this.duplicate();
		}
		for (int i = n; i > 0; i--) {
			this.items[i] = items[i-1];
		}
		this.items[0] = item;
		this.n++;
	}
	
}
