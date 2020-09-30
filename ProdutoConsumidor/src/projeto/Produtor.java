package projeto;

public class Produtor extends Thread {
	private int idProdutor;
	private Buffer pilha;
	private int producaoTotal;

	public Produtor(int id, Buffer p, int producaoTotal) {
		idProdutor = id;
		pilha = p;
		this.producaoTotal = producaoTotal;
	}

	/*
	 * é aqui que devemos definir o nosso client. Precisamos desse método para que
	 * possamos executar as chamadas que consomem os recursos do buffer.
	 */
	public void run() {
		for (int i = 0; i < producaoTotal; i++) {
			pilha.set(idProdutor, i);
		}
		System.out.println("Produtor: " + idProdutor);
	}
}