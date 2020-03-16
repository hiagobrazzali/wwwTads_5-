import java.util.ArrayList;

public class ProdutoController {

	public static Produto maisVendido(ArrayList<Produto> produto) {
		Produto produto2 = new Produto();
		for (int i = 0; i < produto.size(); i++) {
			int maior = produto.get(0).getQtdVendida();

			if (produto.get(i).getQtdVendida() > maior) {
				maior = produto.get(i).getQtdVendida();
				produto2 = produto.get(i);
			}
		}

		return produto2;
	}

	public static Produto maiorValor(ArrayList<Produto> produto) {
		Produto produto2 = new Produto();
		for (int i = 0; i < produto.size(); i++) {
			Double maior = produto.get(0).getValor();

			if (produto.get(i).getValor() > maior) {
				maior = produto.get(i).getValor();
				produto2 = produto.get(i);
			}
		}
		return produto2;
	}

	public static Produto maiorQtdEstoque(ArrayList<Produto> produto) {
		Produto produto2 = new Produto();
		for (int i = 0; i < produto.size(); i++) {
			int maior = produto.get(0).getQuantidade();

			if (produto.get(i).getQuantidade() > maior) {
				maior = produto.get(i).getQuantidade();
				produto2 = produto.get(i);
			}
		}
		return produto2;
	}

	public static Long vendedorMaisVendeu(ArrayList<Produto> produto) {
		Produto produto2 = new Produto();
		for (int i = 0; i < produto.size(); i++) {
			int maior = produto.get(0).getQtdVendida();

			if (produto.get(i).getQtdVendida() > maior) {
				maior = produto.get(i).getQtdVendida();
				produto2 = produto.get(i);
			}
		}

		return produto2.getVendedor();
	}

	public static String extrato(ArrayList<Produto> produto, int vendedor) {
		String saida = "\nExtrato: ";
		for (int i = 0; i < produto.size(); i++) {

			if (produto.get(i).getVendedor() == vendedor) {
				saida += "\n" + produto.get(i).toString();
			}
		}

		return saida;
	}

	public static Produto maiorReceita(ArrayList<Produto> produto) {
		Produto produto2 = new Produto();
		for (int i = 0; i < produto.size(); i++) {
			double maior = produto.get(0).getQtdVendida() * produto.get(0).getValor();

			if (produto.get(i).getQtdVendida() * produto.get(i).getValor() > maior) {
				maior = produto.get(i).getQtdVendida() * produto.get(i).getValor();
				produto2 = produto.get(i);
			}
		}
		return produto2;
	}
}