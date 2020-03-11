import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Produto> produtoList = new ArrayList<Produto>();
//		ArrayList<Pessoa> pessoaList = new ArrayList<Pessoa>();
		//

		try {
		//	pessoaList = GerenciaArquivo.lePessoas("*800");
			produtoList = GerenciaArquivo.leProduto("C:\\Users\\Hiago Brazzali\\OneDrive\\Workspace5°Periodo\\RevisaoLP2\\produtos.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//	System.out.println(produtoList.toString());
			
			ProdutoController.maisVendido(produtoList);

	}

}
