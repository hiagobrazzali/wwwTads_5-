package projeto;

public class Consumidor extends Thread {
	private int idConsumidor;
	private Buffer pilha;
	private int totalConsumir;

	public Consumidor(int id, Buffer p, int totalConsumir) {
		idConsumidor = id;
		pilha = p;
		this.totalConsumir = totalConsumir;
	}

	/* é aqui que devemos definir o nosso client. Precisamos desse método para que possamos executar as chamadas que consomem
	 * os recursos do buffer.*/
	public void run() {
		for (int i = 0; i < totalConsumir; i++) {
			pilha.get(idConsumidor);
		}
		System.out.println("Consumidor: " + idConsumidor);
	}
}