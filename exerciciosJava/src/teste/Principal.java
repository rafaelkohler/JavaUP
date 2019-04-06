package teste;

import java.util.ArrayList;

/**
 * Essa classe vai servir para a resolu��o da lista 01 de exerc�cios.
 * 
 * @author Rafael Kohler
 *
 */
public class Principal {

	/**
	 * Fun��o que da in�cio ao programa.
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
	 * Faz a execu��o da tela com as op��es ao usu�rio e devolve a escolha.
	 * 
	 * @return - Op��o selecionada pelo usu�rio.
	 */
	public static int menu2() {

		String[] opcoes = { "Matriz em X", "Matriz em X com BORDA", "Matriz em Cruz", "Matriz em Cruz com BORDA",
				"Matriz em X ARRAY LIST", "Matriz em X Com BORDA ARRAY LIST", "Matriz em Cruz ARRAY LIST",
				"Matriz em Cruz Com BORDA ARRAY LIST" };
		int menu = Console.mostrarMenu(opcoes, "matriz:", null);
		return menu;

	}

	/**
	 * Chama as fun��es de acordo com a sele��o do usu�rio.
	 * 
	 * @param menu - Op��o selecionada pelo usu�rio.
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