
public abstract class SparseMatrix extends NumericMatrix{
	public SparseMatrix(int n) {
		super(n);
	}
	
	public SparseMatrix(int n, int m) {
		super(n, m);
	}
	
	public abstract int getZeros();
}
