public class MonitorIntegrado {
	
	protected double polegadas;
	protected String frequencia;
	protected int codMonitor;


	public MonitorIntegrado(double polegadas, String frequencia, int codMonitor) {
		this.polegadas = polegadas;
		this.frequencia = frequencia;
		this.codMonitor = codMonitor;
	}
	
	public MonitorIntegrado() {
		
	}


	public double getPolegadas() {
		return polegadas;
	}


	public void setPolegadas(double polegadas) {
		this.polegadas = polegadas;
	}


	public String getFrequencia() {
		return frequencia;
	}


	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}


	@Override
	public String toString() {
		return "Monitor [polegadas = " + polegadas + ", frequencia = " + frequencia + "]";
	}

}
