
public class NTree<E extends Comparable<E>> extends Tree<E>{
	protected int n;
	
	public NTree(int n) {
		this.n=n;
		this.root = new TreeNode_<E>(this.n);
		this.n=n;
		
	}
	
	protected void insert(TreeNode_<E> node, E item) {
		int i=0;
		for (; i < this.n && node.getData(i)!=null && node.getData(i).compareTo(item)<0 ; i++) {
			
		}
		if (i<this.n && node.getData(i)==null) {
			node.setData(i, item);
		} else {
			TreeNode_<E> newnode = node.getChild(i);
			if (newnode==null) {
				newnode = new TreeNode_<E>(this.n);
				node.setChild(i, newnode);
			}
			this.insert(newnode, item);
		}
	}

	@Override
	public void insert(E item) {
		this.insert((TreeNode_)this.root, item);
	}

}
