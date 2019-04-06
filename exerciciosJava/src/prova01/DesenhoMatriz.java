package prova01;

import java.util.ArrayList;

/**
 * Classe utilizada para a resolução da prova.
 * 
 * @author DaviMR, Rafael Kohler, Leandro Zeni
 *
 */
public class DesenhoMatriz {

	public static String[][] montarMatrizCruz(Integer dimensao, boolean borda) {

		String[][] matriz = new String[dimensao][dimensao];

		Integer meio = dimensao / 2;

		Integer meio2 = dimensao / 2 - 1;

		if (dimensao % 2 == 0) {

			for (int i = 0; i < dimensao; i++) {

				matriz[i][meio] = "X";
				matriz[i][meio2] = "X";

				for (int j = 0; j < dimensao; j++) {
					if (i == meio || j == meio || i == meio2 || j == meio2) {
						matriz[i][j] = "X";
					}
				}
			}

		} else {
			for (int i = 0; i < dimensao; i++) {

				matriz[i][meio] = "X";

				for (int j = 0; j < dimensao; j++) {
					if (i == meio || j == meio) {
						matriz[i][j] = "X";
					}
				}
			}
		}
		if (borda) {
			matriz = comBorda(matriz);
		}

		return matriz;
	}

	public static String[][] montarMatrizX(Integer dimensao, boolean borda) {

		String[][] matriz = new String[dimensao][dimensao];
		for (int i = 0; i < dimensao; i++) {
			matriz[i][i] = "X";
			for (int j = 0; j < dimensao; j++) {
				if ((i == j) || (i + j == dimensao - 1)) {
					matriz[i][j] = "X";
				}
			}
		}
		if (borda) {
			matriz = comBorda(matriz);
		}

		return matriz;
	}

	private static String[][] comBorda(String[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz.length; j++) {
				if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz.length - 1) {
					matriz[i][j] = "X";
				}
			}

		}
		return matriz;
	}

	/**
	 * Método que
	 * 
	 * @param tamanhoVetor
	 * @return
	 */

	public static ArrayList<ArrayList<Integer>> montarMatrizCruzArray(int tamanhoVetor) {
		ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

		Integer meio = tamanhoVetor / 2;

		if (tamanhoVetor % 2 == 0) {
			for (int i = 0; i < tamanhoVetor; i++) {
				ArrayList<Integer> matrizInterna = new ArrayList<>();

				for (int j = 0; j < tamanhoVetor; j++) {
					if (j == meio || j == meio - 1 || i == meio || i == meio - 1) {
						matrizInterna.add(0);
					} else {
						matrizInterna.add(1);
					}
				}
				matriz.add(matrizInterna);
			}
		} else {
			for (int i = 0; i < tamanhoVetor; i++) {
				ArrayList<Integer> matrizInterna = new ArrayList<>();

				for (int j = 0; j < tamanhoVetor; j++) {
					if (j == meio || i == meio) {
						matrizInterna.add(0);
					} else {
						matrizInterna.add(1);
					}
				}
				matriz.add(matrizInterna);
			}
		}
		return matriz;
	}
}
