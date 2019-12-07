
public class SimpleArraySparseMatrix extends SparseMatrix {
	private int zeros;
	public SimpleArraySparseMatrix(int n) {
		this(n, n);
	
	}
	
	public SimpleArraySparseMatrix(int n, int m) {
		super(n, m);
		this.zeros = this.n*this.m;
		this.rows = new SimpleArrayList<List<Integer>>();
		for (int i = 0; i <this.n; i++) {
			SimpleArrayList<Integer> newRow = new SimpleArrayList<Integer>();
			
			for (int j = 0; j < this.m; j++) {
				newRow.insert(0);
			}
			
			this.rows.insert(newRow);
		}
	}


	public void set(int i, int j, Integer item) {
		if (item != 0 && this.zeros+1>this.n*this.m/2) {
			((SimpleArrayList<Integer>)(((SimpleArrayList<List<Integer>>)this.rows).get(i))).set(j, item);;;
			this.zeros--;
		}
			
	}

	public Integer get(int i, int j) {
		
		return ((SimpleArrayList<Integer>)(((SimpleArrayList<List<Integer>>)this.rows).get(i))).get(j);
	}

	public boolean isEmpty() {
		return this.rows.size()==0;
	}

	public int size() {
		return this.rows.size();
	}

	public void insert(List<Integer> item) {
		this.rows.insert(item);
	}

	public int getZeros() {
		return 0;
	}
	
}
