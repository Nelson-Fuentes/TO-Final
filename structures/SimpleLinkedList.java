
public class SimpleLinkedList<E> extends LinkedStructures<E> implements SimpleList<E>{

	
	public void insert(E item) {
		SimpleNode<E> newNode = new SimpleNode<E>(item, null);
		if (this.isEmpty()) {
			this.root = newNode;
		} else {
			SimpleNode<E> aux = (SimpleNode<E>) this.root;
			while (aux.getNext()!=null) {
				aux = aux.getNext();
			}
			aux.setNext(newNode);
		}
		this.n++;
	}

}
