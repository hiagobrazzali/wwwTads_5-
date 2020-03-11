public abstract class Cargo {

	protected String nome;
	protected double salario;
	protected String cargaHoraria;

	public Cargo() {
	}

	public Cargo(String nome, double salario, String cargaHoraria) {
		this.nome = nome;
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double descontoINPF() {
		double salario = this.salario;
		if (salario >= 1903.99 && salario >= 2826.65) {
			return salario * 0.075;

		} else if (salario >= 2826.66 && salario >= 3751.05) {
			return salario * 0.15;

		} else if (salario >= 3751.06 && salario >= 4664.68) {
			return salario * 22.5;

		} else if (salario >= 4664.68) {
			return salario * 0.275;

		} else {
			return 0;
		}
	}
}
