
public class LinkedStack<E> extends LinkedStructures<E> implements Stack<E>{
	public void insert(E item) {
		SimpleNode<E> newNode = new SimpleNode<E>(item, (SimpleNode<E>)this.root);
		this.root = newNode;
		this.n++;
	}
}
