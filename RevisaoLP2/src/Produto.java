public class Produto {

	protected String codigoML;
	protected String nome;
	protected double valor;
	protected int quantidade;
	protected int qtdVendida;
	protected Long vendedor;

	public Produto(String codigoML, String nome, double valor, int quantidade, int qtdVendida, Long vendedor) {
		this.codigoML = codigoML;
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.qtdVendida = qtdVendida;
		this.vendedor = vendedor;
	}

	public Produto() {

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

	public Long getVendedor() {
		return vendedor;
	}

	public void setVendedor(Long vendedor) {
		this.vendedor = vendedor;
	}

	@Override
	public String toString() {
		return "Produto [codigoML=" + codigoML + ", nome=" + nome + ", valor=" + valor + ", quantidade=" + quantidade
				+ ", qtdVendida=" + qtdVendida + ", vendedor=" + vendedor + "]\n";
	}
	
}
