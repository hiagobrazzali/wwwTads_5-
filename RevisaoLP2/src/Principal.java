import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Produto> produtoList = new ArrayList<Produto>();
//		ArrayList<Pessoa> pessoaList = new ArrayList<Pessoa>();
		//

		try {
			// pessoaList = GerenciaArquivo.lePessoas("*800");
			produtoList = GerenciaArquivo
					.leProduto("C:\\Users\\Hiago Brazzali\\OneDrive\\Workspace5�Periodo\\RevisaoLP2\\produtos.txt");
		} catch (IOException e) {
			System.err.println("Erro ao ler arquivo");
			e.printStackTrace();
		}
		System.out.println("O produto mais vendido �:\n " + ProdutoController.maisVendido(produtoList).toString());
		System.out.println("O produto com maior valor �:\n " + ProdutoController.maiorValor(produtoList).toString());
		System.out.println("O produto com maior quantidade em estoque �:\n " + ProdutoController.maiorQtdEstoque(produtoList).toString());
		System.out.println("O produto mais vendido �:\n " + ProdutoController.vendedorMaisVendeu(produtoList));
		System.out.println("O produto mais vendido �:\n " + ProdutoController.extrato(produtoList, 151123950));
		System.out.println("O produto com maior receita �:\n " + ProdutoController.maiorReceita(produtoList).toString());
	}

}
