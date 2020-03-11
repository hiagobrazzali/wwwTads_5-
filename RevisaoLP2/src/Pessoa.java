public class Pessoa {

	protected String nome;
	protected int idade;
	protected String CPF;

	public Pessoa(String nome, int idade, String CPF) {
		this.nome = nome;
		this.idade = idade;
		this.CPF = CPF;
	}

	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public boolean Adulto() {
		return this.idade >= 18;
	}

	public String nomeCartao() {
		String frase = this.nome;
		String saida = "";
		String array[] = frase.split(" ");

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				saida += array[i];
			} else if (i == array.length - 1) {
				saida += array[i];
			} else {
				saida += array[i].charAt(0);
			}
			saida = array[i];
		}

		return saida;
	}

}
