
public class TreeNode_<E extends Comparable<E>> extends Node<E>{
	protected SimpleArrayList<TreeNode_<E>> childs;
	protected int n;
	
	public TreeNode_(int n) {
		this.childs = new SimpleArrayList<TreeNode_<E>>();
		this.n=n;
		this.data = new SimpleArrayList<E>();
		
		for (int i = 0; i < this.n; i++) {
			this.data.insert(null);;
		}
		for (int i = 0; i < this.n+1; i++) {
			this.childs.insert(null);;
		}
		
	}
	
	public E getData(int i) {
		return this.data.get(i);
	}
	
	public void setData(int i, E item) {
		this.data.set(i, item);
	}
	
	public TreeNode_<E> getChild(int i) {
		return this.childs.get(i);
	}
	
	public void setChild(int i, TreeNode_<E> item) {
		this.childs.set(i, item);
	}
	
	public String toString() {
		String str="[";
		int i=0;

		for (; i < this.n && this.data.get(i)!=null; i++) {
			if(this.childs.get(i)!=null)
				str+=this.childs.get(i).toString()+" <= ";
			str+=this.data.get(i).toString()+", ";
			
		}
		if(this.childs.get(i)!=null)
			str+=" =>  "+this.childs.get(i).toString();
		
		return str+"]";
	}
	
}
