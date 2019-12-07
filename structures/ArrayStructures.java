import java.util.Arrays;

public  abstract class ArrayStructures <E> extends Collection <E> {
	protected E items [];
	
	public ArrayStructures() {
		this.n=0;
		this.items = (E [])new  Object[1];
	}
	
	protected void duplicate() {
		this.items = Arrays.copyOf(this.items, this.items.length*2);
	}
	protected boolean isFull() {
		return n == this.items.length;
	}
	public String toString() {
		String str="[";
		for (int i = 0; i < n; i++) {
			str+=this.items[i].toString();
			if (i<n-1) {
				str+=", ";
			}
		}
		return str+"]";
	}
	public E get(int i) {
		return this.items[i];
	}
	
	public void set(int i, E item) {
		this.items[i]= item;
	}
}
