import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivos {
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
//EFETUANDO A ESCRITA

		System.out.println("1 - Criar novo arquivo\n2 - usar arquivo existente");
		int menu = Integer.valueOf(entrada.nextLine());
		// ajustando a aparencia do console
		System.out.println("");
		System.out.println("__________________________________________________________");
		System.out.println("");

		System.out.println("Qual o nome do arquivo a ser criado?");
		String nomeArquivo = entrada.nextLine();
		// ajustando a aparencia do console
		System.out.println("");
		System.out.println("__________________________________________________________");
		System.out.println("");

		System.out.println("Qual o texto a ser adicionado?");
		String texto = entrada.nextLine();
		// ajustando a aparencia do console
		System.out.println("");
		System.out.println("__________________________________________________________");
		System.out.println("");

		entrada.close();

		File f = new File(nomeArquivo + ".txt");

		switch (menu) {
		case 1:
			try {

				FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.append(texto + " - LNG 1");
				bw.newLine();
				bw.append(texto + " - LNG 2");
				bw.newLine();
				bw.append(texto + " - LNG 3");
				bw.newLine();

				bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				FileWriter arquivo = new FileWriter(nomeArquivo + ".txt", true);
				BufferedWriter gravador = new BufferedWriter(arquivo);

				gravador.append(texto);
				gravador.newLine();
				gravador.close();
				arquivo.close();
				break;
			} catch (IOException e) {
				e.printStackTrace();
			}

		default:
			break;
		}

		// EFETUANDO A LEITURA
		try {
			FileReader fr = new FileReader(f);
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(fr);
			String s;
			// ENQUANTO EXISTE DADOS CONTINUA IMPRIMINDO
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("###### Erro: " + e.getMessage());
			e.printStackTrace();
		}
	}

}