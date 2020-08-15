import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GerenciaArquivo {

	public static ArrayList<Pessoa> lePessoa(String fileName) throws IOException {
		String linha = "";
		FileReader arquivo = new FileReader(fileName);
		BufferedReader leitor = new BufferedReader(arquivo);
		ArrayList<Pessoa> list = new ArrayList<Pessoa>();
		while (linha != null) {
			linha = leitor.readLine();
			if (linha != null) {
				Pessoa p1 = new Pessoa();
				String[] pessoa = linha.split(";");
				p1.setNome(pessoa[0]);
				p1.setIdade(Integer.valueOf(pessoa[1]));
				p1.setCPF(pessoa[2]);
				list.add(p1);
			}
		}
		leitor.close();
		arquivo.close();
		return list;
	}

	public static ArrayList<Carro> leCarro(String fileName) throws IOException {
		String linha = "";
		FileReader arquivo = new FileReader(fileName);
		BufferedReader leitor = new BufferedReader(arquivo);
		ArrayList<Carro> list = new ArrayList<Carro>();
		while (linha != null) {
			linha = leitor.readLine();
			if (linha != null) {
				Carro c1 = new Carro();
				String[] carro = linha.split(";");
				c1.setModelo(carro[0]);
				c1.setCor(carro[1]);
				c1.setMarca(carro[2]);
				c1.setCodPessoa(Integer.valueOf(carro[3]));
				list.add(c1);
			}
		}
		leitor.close();
		arquivo.close();
		return list;
	}

	public static ArrayList<MonitorIntegrado> leMonitor(String fileName) throws IOException {
		String linha = "";
		FileReader arquivo = new FileReader(fileName);
		BufferedReader leitor = new BufferedReader(arquivo);
		ArrayList<MonitorIntegrado> list = new ArrayList<MonitorIntegrado>();
		while (linha != null) {
			linha = leitor.readLine();
			if (linha != null) {
				MonitorIntegrado m1 = new MonitorIntegrado();
				String[] monitor = linha.split(";");
				m1.setPolegadas(Double.parseDouble(monitor[0]));
				m1.setFrequencia(monitor[1]);
				list.add(m1);
			}
		}
		leitor.close();
		arquivo.close();
		return list;
	}

	public static ArrayList<Notebook> leNotebook(String fileName) throws IOException {
		String linha = "";
		FileReader arquivo = new FileReader(fileName);
		BufferedReader leitor = new BufferedReader(arquivo);
		ArrayList<Notebook> list = new ArrayList<Notebook>();
		while (linha != null) {
			linha = leitor.readLine();
			if (linha != null) {
				Notebook p1 = new Notebook();
				String[] pessoa = linha.split(";");
				p1.setCodMonitor(Integer.valueOf(pessoa[0]));
				p1.setFabricante(pessoa[1]);
				p1.setMemoriaRam(Integer.valueOf(pessoa[2]));
				p1.setProcessador(pessoa[3]);
				p1.setPlacaVideo(pessoa[4]);
				list.add(p1);
			}
		}
		leitor.close();
		arquivo.close();
		return list;
	}

}