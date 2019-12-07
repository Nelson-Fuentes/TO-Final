
public abstract class LinkedStructures <E> extends Collection <E>  {
	protected Node <E> root;
	
	public String toString() {
		return "["+this.root.toString()+"]";
	}
}
