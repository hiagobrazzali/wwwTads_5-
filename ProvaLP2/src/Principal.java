import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoaList = new ArrayList<Pessoa>();
		ArrayList<Carro> carroList = new ArrayList<Carro>();
		ArrayList<MonitorIntegrado> minitorList = new ArrayList<MonitorIntegrado>();
		ArrayList<Notebook> notebookList = new ArrayList<Notebook>();

		try {
			//ler as pessoas, e adiciona em uma lista 
			pessoaList = GerenciaArquivo
					.lePessoa("endereçoArquivo");
			carroList = GerenciaArquivo
					.leCarro("endereçoArquivo");
			minitorList = GerenciaArquivo
					.leMonitor("endereçoArquivo");
			notebookList = GerenciaArquivo
					.leNotebook("endereçoArquivo");
		} catch (IOException e) {
			System.err.println("Erro ao ler arquivo");
			e.printStackTrace();
		}

	}

}
