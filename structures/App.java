import java.util.Random;
public class App {

	public static void main(String[] args) {
		SimpleArraySparseMatrix matrix = new SimpleArraySparseMatrix(3);
		matrix.set(2, 2, 3);
		matrix.set(0, 1, 5);
		matrix.set(2, 0, 9);
		System.out.println(matrix);
		NTree<Integer> t = new NTree<Integer>(1);
		t.insert(2);
		System.out.println(t);
		t.insert(1);
		t.insert(3);
		System.out.println(t);
	}

}
