public class Notebook {

	protected int codMonitor;
	protected String fabricante;
	protected int memoriaRam;
	protected String processador;
	protected String placaVideo;

	public Notebook(int codMonitor, String fabricante, int memoriaRam, String processador,
			String placaVideo) {
		this.codMonitor = codMonitor;
		this.fabricante = fabricante;
		this.memoriaRam = memoriaRam;
		this.processador = processador;
		this.placaVideo = placaVideo;
	}

	public Notebook() {

	}

	public int getCodMonitor() {
		return codMonitor;
	}

	public void setCodMonitor(int codMonitor) {
		this.codMonitor = codMonitor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getPlacaVideo() {
		return placaVideo;
	}

	public void setPlacaVideo(String placaVideo) {
		this.placaVideo = placaVideo;
	}

	@Override
	public String toString() {
		return "Notebook [Codmonitor=" + codMonitor + ", fabricante=" + fabricante + ", memoriaRam=" + memoriaRam
				+ ", processador=" + processador + ", placaVideo=" + placaVideo + "]";
	}

}
