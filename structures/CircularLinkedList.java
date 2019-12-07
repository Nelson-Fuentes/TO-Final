
public class CircularLinkedList<E> extends LinkedStructures<E> implements CircularList<E>  {

	public void insert(E item) {
		DoubleNode<E> newNode = new DoubleNode<E>(item, null);
		if (this.isEmpty()) {
			this.root = newNode;
			((DoubleNode<E>)this.root).setNext((DoubleNode<E>)this.root);
			((DoubleNode<E>)this.root).setPrev((DoubleNode<E>)this.root);
			
		} else {
			DoubleNode<E> aux = (DoubleNode<E>) this.root;
			aux.getPrev().setNext(newNode);
			newNode.setPrev(aux.getPrev());
			aux.setPrev(newNode);
			newNode.setNext(aux);
		}
		this.n++;
	}
	
	public String toString() {
		String str="[";
		SimpleNode<E> aux = (SimpleNode<E>)this.root;
		for (int i = 0; i < this.n; i++) {
			str+=aux.data.toString();
			if (i<this.n-1) {
				str+=", ";
			}
			aux = aux.getNext();
		}
		return str+"]";
	}

}
