import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GerenciaArquivo {
	public static ArrayList<Pessoa> lePessoas(String fileName) throws IOException {
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
	
	public static ArrayList<Produto> leProduto(String fileName) throws IOException {
		String linha = "";
		FileReader arquivo = new FileReader(fileName);
		BufferedReader leitor = new BufferedReader(arquivo);
		ArrayList<Produto> list = new ArrayList<Produto>();
		while (linha != null) {
			linha = leitor.readLine();
			if (linha != null) {
				Produto p1 = new Produto();
				String[] produto = linha.split(";");
				p1.setCodigoML(produto[0]);
				p1.setNome(produto[1]);
				p1.setValor(Double.parseDouble(produto[2]));  
				p1.setQuantidade(Integer.valueOf(produto[3]));
				p1.setQtdVendida(Integer.valueOf(produto[4]));
				p1.setVendedor(Long.parseLong(produto[5]));
				list.add(p1);
			}
		}
		leitor.close();
		arquivo.close();
		return list;
	}
	

}