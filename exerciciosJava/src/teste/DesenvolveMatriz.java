package teste;

import java.util.ArrayList;

public class DesenvolveMatriz {

	/**
	 * Monta matriz em CRUZ com usando ArrayList
	 * @param tamanhoVetor
	 * @param borda
	 * @return
	 */
	public static ArrayList<ArrayList<String>> matrizCruzArrayList(int tamanhoVetor, boolean borda) {
		ArrayList<ArrayList<String>> matriz = new ArrayList<>();
		Integer meio = tamanhoVetor / 2;

		if (tamanhoVetor % 2 != 0) {
			for (int i = 0; i < tamanhoVetor; i++) {
				ArrayList<String> matrizInterna = new ArrayList<>();
				for (int j = 0; j < tamanhoVetor; j++) {
					if (i == meio || j == meio) {
						matrizInterna.add("X");
					} else {
						matrizInterna.add("O");
					}
				}
				matriz.add(matrizInterna);
			}
		} else {
			for (int i = 0; i < tamanhoVetor; i++) {
				ArrayList<String> matrizInterna = new ArrayList<>();
				for (int j = 0; j < tamanhoVetor; j++) {
					if (i == meio || j == meio || i == meio - 1 || j == meio - 1) {
						matrizInterna.add("X");
					} else {
						matrizInterna.add("O");
					}
				}
				matriz.add(matrizInterna);
			}
		}
		if (borda) {
			return comBordaString(matriz);
		}

		return matriz;
	}

	/**
	 * Monta matriz em X com usando ArrayList
	 * @param tamanhoVetor
	 * @param borda
	 * @return
	 */
	public static ArrayList<ArrayList<String>> matrizXArrayList(int tamanhoVetor, boolean borda) {
		ArrayList<ArrayList<String>> matriz = new ArrayList<>();

		for (int i = 0; i < tamanhoVetor; i++) {
			ArrayList<String> matrizInterna = new ArrayList<>();

			for (int j = 0; j < tamanhoVetor; j++) {
				if (i == j || (i + j == tamanhoVetor - 1)) {
					matrizInterna.add("X");
				} else {
					matrizInterna.add("O");
				}
			}
			matriz.add(matrizInterna);
		}
		if (borda) {
			return comBordaString(matriz);
		}
		return matriz;
	}
	
	/**
	 * Constroi as bordas de uma matriz
	 * @param matriz
	 * @return String
	 */
	private static ArrayList<ArrayList<String>> comBordaString(ArrayList<ArrayList<String>> matriz) {

		for (int i = 0; i < matriz.size(); i++) {
			for (int j = 0; j < matriz.size(); j++) {
				if (i == 0 || i == matriz.size() - 1 || j == 0 || j == matriz.size() - 1) {
					matriz.get(i).set(j, "X");
				}
			}
		}
		return matriz;
	}
}
