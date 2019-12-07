
public abstract class Tree<E extends Comparable<E>> extends LinkedStructures<E> implements Collector<E>{
	protected abstract void insert(TreeNode_<E> node, E item);
}
