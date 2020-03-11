public class Vendedor {

	protected String codigoML;
	protected String nome;
	protected double valor;
	protected int quantidade;
	protected int qtdVendida;

	public Vendedor(String codigoML, String nome, double valor, int quantidade, int qtdVendida) {
		this.codigoML = codigoML;
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.qtdVendida = qtdVendida;
	}

	public Vendedor() {

	}

	public String getCodigoML() {
		return codigoML;
	}

	public void setCodigoML(String codigoML) {
		this.codigoML = codigoML;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQtdVendida() {
		return qtdVendida;
	}

	public void setQtdVendida(int qtdVendida) {
		this.qtdVendida = qtdVendida;
	}
}
