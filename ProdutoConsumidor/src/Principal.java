
public class Principal {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.setId(1);

		Thread t1 = new Thread(p1);
		t1.start();

		Produto p2 = new Produto();
		p2.setId(2);

		Thread t2 = new Thread(p2);
		t2.start();

	}

}
