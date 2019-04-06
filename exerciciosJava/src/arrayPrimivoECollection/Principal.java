package arrayPrimivoECollection;

import java.util.ArrayList;

/**
 * Essa classe vai servir para a resolução da lista 01 de exercícios.
 * 
 * @author Rafael Kohler
 *
 */
public class Principal {

	/**
	 * Função que da início ao programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int menu = menu2();
		do {
			selecaoMenu(menu);
			menu = menu2();

		} while (menu > -1);
	}

	/**
	 * Faz a execução da tela com as opções ao usuário e devolve a escolha.
	 * 
	 * @return - Opção selecionada pelo usuário.
	 */
	public static int menu2() {

		String[] opcoes = { "Matriz em X", "Matriz em X com BORDA", "Matriz em Cruz", "Matriz em Cruz com BORDA",
				"Matriz em X ARRAY LIST", "Matriz em X Com BORDA ARRAY LIST", "Matriz em Cruz ARRAY LIST",
				"Matriz em Cruz Com BORDA ARRAY LIST" };
		int menu = Console.mostrarMenu(opcoes, "matriz:", null);
		return menu;

	}

	/**
	 * Chama as funções de acordo com a seleção do usuário.
	 * 
	 * @param menu - Opção selecionada pelo usuário.
	 */
	public static void selecaoMenu(int menu) {

		switch (menu) {
		case 1:
			matrizX();
			break;
		case 2:
			matrizXComBorda();
			break;
		case 3:
			matrizCruz();
			break;
		case 4:
			matrizCruzComBorda();
			break;
		case 5:
			matrizXArrayList();
			break;
		case 6:
			matrizXComBordaArrayList();
			break;
		case 7:
			matrizCruzArrayList();
			break;
		case 8:
			matrizCruzComBordaArrayList();
			break;
		}
	}

	private static void matrizX() {

	}

	private static void matrizXComBorda() {

	}

	private static void matrizCruz() {

	}

	private static void matrizCruzComBorda() {

	}

	private static void matrizXArrayList() {
		Integer tamanhoVetor = Console.recuperaInteiro("Informe o tamanho da matriz");

		boolean borda = false;

		ArrayList<ArrayList<String>> matriz = DesenvolveMatriz.matrizXArrayList(tamanhoVetor, borda);
		for (ArrayList<String> arrayList : matriz) {
			System.out.println(arrayList);
		}
	}

	private static void matrizXComBordaArrayList() {
		Integer tamanhoVetor = Console.recuperaInteiro("Informe o tamanho da matriz");

		boolean borda = true;

		ArrayList<ArrayList<String>> matriz = DesenvolveMatriz.matrizXArrayList(tamanhoVetor, borda);
		for (ArrayList<String> arrayList : matriz) {
			System.out.println(arrayList);
		}
	}

	private static void matrizCruzArrayList() {
		Integer tamanhoVetor = Console.recuperaInteiro("Informe o tamanho da matriz");

		boolean borda = false;

		ArrayList<ArrayList<String>> matriz = DesenvolveMatriz.matrizCruzArrayList(tamanhoVetor, borda);
		for (ArrayList<String> arrayList : matriz) {
			System.out.println(arrayList);
		}
	}

	private static void matrizCruzComBordaArrayList() {
		Integer tamanhoVetor = Console.recuperaInteiro("Informe o tamanho da matriz");

		boolean borda = true;

		ArrayList<ArrayList<String>> matriz = DesenvolveMatriz.matrizCruzArrayList(tamanhoVetor, borda);
		for (ArrayList<String> arrayList : matriz) {
			System.out.println(arrayList);
		}
	}

}