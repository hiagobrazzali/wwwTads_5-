public class Funcionario extends Pessoa {

	protected Cargo cargo;

	public Funcionario(String nome, int idade, String CPF, Cargo cargo) {
		super(nome, idade, CPF);

	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Funcionario: \nNome = " + nome + "\n idade = " + idade + "\nCPF = " + CPF + "\nCargo = " + cargo;
	}

}