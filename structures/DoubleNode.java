public class DoubleNode <E> extends SimpleNode<E>{
	
	private DoubleNode<E> prev;
	public DoubleNode(E item, SimpleNode<E> next) {
		super(item, next);
	}
	public DoubleNode(E item, DoubleNode<E> next, DoubleNode<E> prev) {
		super(item, next);
		this.prev = prev;
	}
	public DoubleNode<E> getPrev() {
		return prev;
	}
	public void setPrev(DoubleNode<E> prev) {
		this.prev = prev;
	}
	

}
