public class Pessoa {

	protected String nome;
	protected int idade;
	protected String CPF;
	protected int codPessoa;

	public Pessoa(String nome, int idade, String CPF, int codPessoa) {
		this.nome = nome;
		this.idade = idade;
		this.CPF = CPF;
		this.codPessoa = codPessoa;
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

}
