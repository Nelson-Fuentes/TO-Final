
public abstract class AbstractMatrix<E>   implements Matrix<E> {
	protected int n, m;
	protected List<List<E>> rows;
	public AbstractMatrix(int n) {
		this(n,n);
	}
	
	public AbstractMatrix(int n, int m) {
		this.n=n;
		this.m=m;
	}
	

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
	
	public String toString() {
		return this.rows.toString();
	}
	
	
}
