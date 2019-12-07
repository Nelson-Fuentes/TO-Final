
public class TableHash<E> extends Hash<E> {
	
	
	
	public TableHash(int m) {
		super(m);
	}


	public String toString() {
		String str = "[";
		for (int i = 0; i < m; i++) {
			str+=i+": => "+this.table[i].toString();
			if (i<n-1) {
				str+=", ";
			}
		}
		return str+"]";
	}

	
	public void insert(E item) {
		this.table[this.functionHash(item)].insert(item);
	}

}
