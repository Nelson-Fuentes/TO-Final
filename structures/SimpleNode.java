
public class SimpleNode<E> extends Node<E>{
	private SimpleNode<E> next;
	public SimpleNode<E> getNext() {
		return next;
	}

	public void setNext(SimpleNode<E> next) {
		this.next = next;
	}

	public SimpleNode(E item, SimpleNode<E> next) {
		this.data = item;
		this.next = next;
	}
	
	public String toString() {
		String str=data.toString();
		if (next!=null) {
			str+=", " + this.next.toString();
		}
		return str;
	}
}
