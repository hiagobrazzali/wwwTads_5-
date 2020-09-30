package projeto;

public class Principal {

	public static void main(String[] args) {
		Buffer bufferCompartilhado = new Buffer();
		Produtor produtor1 = new Produtor(1, bufferCompartilhado, 9);
		Produtor produtor2 = new Produtor(2, bufferCompartilhado, 9);
		Consumidor consumidor1 = new Consumidor(1, bufferCompartilhado, 4);
		Consumidor consumidor2 = new Consumidor(2, bufferCompartilhado, 15);

		produtor1.start();
		consumidor1.start();
		produtor2.start();
		consumidor2.start();
	}

}
