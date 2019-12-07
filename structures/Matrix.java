
public interface Matrix<E> extends List<List<E>>{
	public void set(int i, int j, E item);
	public E get(int i, int j);
}
