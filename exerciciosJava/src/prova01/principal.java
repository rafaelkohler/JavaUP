package prova01;

import java.util.ArrayList;

/**
 * Essa classe ira servir para a resolução da primeira prova de java.
 * 
 * @author DaviMR, Rafael Kohler, Leandro Zeni
 *
 */
public class principal {

	/**
	 * Método que da início ao programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int opcao = menu();

		while (opcao > -1) {

			selecao(opcao);

			opcao = menu();
		}
	}

	/**
	 * Faz a execução da tela de menu com as opções ao usuário e devolve a escolha.
	 * 
	 * @return - Opção selecionada pelo usuário.
	 */
	public static int menu() {

		String[] opcoes = { "Formar Matriz Cruz", "Formar Matriz Cruz com bordas", "Formar Matriz X",
				"Formar Matriz X com bordas", "Formar Matriz Cruz com array", "Formar Matriz Cruz com bordas com array",
				"Formar Matriz X com array", "Formar Matriz X com bordas com array" };

		String titulo = "Selecione a opção desejada:";

		String descricao = null;

		int opcao = Console.mostrarMenu(opcoes, titulo, descricao);

		return opcao;
	}

	/**
	 * Chama os métodos de acordo com a seleção do usuário.
	 * 
	 * @param menu - Opção selecionada pelo usuário.
	 */
	public static void selecao(int opcao) {

		switch (opcao) {
		case 1:
			formarMatrizCruz();
			break;
		case 2:
			formarMatrizCruzBordas();
			break;
		case 3:
			formarMatrizX();
			break;
		case 4:
			formarMatrizXBordas();
			break;
		case 5:
			formarMatrizCruzArray();
			break;
		case 6:
			formarMatrizCruzBordasArray();
			break;
		case 7:
			formarMatrizXArray();
			break;
		case 8:
			formarMatrizXBordasArray();
			break;
		}
	}

	public static void formarMatrizCruz() {
		Integer tamanho = Console.recuperaInteiro("Digite o tamanho matriz");
		boolean borda = false;
		String[][] matriz = DesenhoMatriz.montarMatrizCruz(tamanho, borda);

		printarMatriz(matriz);

	}

	public static void formarMatrizXBordas() {
		Integer tamanho = Console.recuperaInteiro("Digite o tamanho matriz");
		boolean borda = true;
		String[][] matriz = DesenhoMatriz.montarMatrizX(tamanho, borda);

		printarMatriz(matriz);
	}

	public static void formarMatrizCruzBordas() {
		Integer tamanho = Console.recuperaInteiro("Digite o tamanho matriz");
		boolean borda = true;
		String[][] matriz = DesenhoMatriz.montarMatrizCruz(tamanho, borda);

		printarMatriz(matriz);
	}

	public static void formarMatrizX() {
		Integer tamanho = Console.recuperaInteiro("Digite o tamanho matriz");
		boolean borda = false;
		String[][] matriz = DesenhoMatriz.montarMatrizX(tamanho, borda);

		printarMatriz(matriz);
	}

	public static void printarMatriz(String[][] valores) {
		if (valores.length == 0) {
			System.out.println("[]");
		} else if (valores.length == 1) {
			System.out.println("[" + valores[0][0] + "]");
		} else {
			for (int i = 0; i < valores.length; i++) {
				for (int j = 0; j < valores.length; j++) {
					if (valores[i][j] == null) {
						System.out.print(" ");
					} else
						System.out.print(valores[i][j] + "");
				}
				System.out.println("");
			}
		}
	}

	private static void formarMatrizXBordasArray() {

	}

	private static void formarMatrizXArray() {

	}

	private static void formarMatrizCruzBordasArray() {

	}

	private static void formarMatrizCruzArray() {
		int tamanhoVetor = Console.recuperaInteiro("Digite o tamanho da Matriz");

		ArrayList<ArrayList<Integer>> matriz = DesenhoMatriz.montarMatrizCruzArray(tamanhoVetor);
		
		for (ArrayList<Integer> arrayList : matriz) {
			System.out.println(arrayList);
		}
	}
}
