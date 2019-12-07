
public class ArrayQueue<E> extends ArrayStructures<E> implements Queue<E>{

	
	public void insert(E item) {
		if (this.isFull()) {
			this.duplicate();
		}
		this.items[n]=item;
		n++;
	}

}
