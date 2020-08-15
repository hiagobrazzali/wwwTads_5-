public class Carro {
	
	protected String modelo;
	protected String cor;
	protected String marca;
	protected int codPessoa;
	


	public Carro(String modelo, String cor, String marca, int codPessoa) {
		this.modelo = modelo;
		this.cor = cor;
		this.marca = marca;
		this.codPessoa = codPessoa;
	}
	
	public Carro() {
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getCodPessoa() {
		return codPessoa;
	}


	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}


	@Override
	public String toString() {
		return "Carro [modelo = " + modelo + ", cor = " + cor + ", marca = " + marca + ", codPessoa = " + codPessoa + "]";
	}

}
