
public class DoubleLinkedList<E> extends LinkedStructures<E> implements DoubleList<E> {
	public void insert(E item) {
		DoubleNode<E> newNode = new DoubleNode<E>(item, null);
		if (this.isEmpty()) {
			this.root = newNode;
		} else {
			DoubleNode<E> aux = (DoubleNode<E>) this.root;
			while (aux.getNext()!=null) {
				aux = (DoubleNode<E>)aux.getNext();
			}
			aux.setNext(newNode);
			newNode.setPrev(aux);
		}
		this.n++;
	}
}
