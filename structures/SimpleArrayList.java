
public class SimpleArrayList<E> extends ArrayStructures<E> implements SimpleList<E>{

	public void insert(E item) {
		if (this.isFull()) {
			this.duplicate();
		}
		this.items[n]=item;
		n++;
	}

}
