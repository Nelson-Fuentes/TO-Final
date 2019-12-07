
public  abstract class Hash<E> extends Collection<E>{
	protected int m;
	protected SimpleArrayList<E> table [];
	
	public Hash(int m) {
		this.m = m;
		table = new SimpleArrayList[m];
		for (int i = 0; i < table.length; i++) {
			table[i] = new SimpleArrayList<E>();
		}
	}
	
	protected int functionHash(E item) {
		return item.hashCode()%m;
	}
	
}
