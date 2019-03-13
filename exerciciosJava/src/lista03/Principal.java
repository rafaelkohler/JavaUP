package lista03;

import java.util.ArrayList;
import java.util.List;

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
	 * @return - Opção selecionada pelo usuário.
	 */
	public static int menu2() {

		String[] opcoes = { "Cálculo do peso ideal" };
		int menu = Console.mostrarMenu(opcoes, "Selecione a opção desejada da lista 03:", "Escolha uma das oplções do menu");
		return menu;

	}

	/**
	 * Chama as funções de acordo com a seleção do usuário.
	 * @param menu - Opção selecionada pelo usuário.
	 */
	public static void selecaoMenu(int menu) {

		switch (menu) {
		case 1:
			pesoIdeal();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		}
	}
	
	public static void pesoIdeal() {
		double altura = Console.recuperaDecimal("Favor digitar sua altura: ");
		String sexo = Console.recuperaTexto("Qual o seu sexo? M para masculino e F para feminino");

		double resultado = Exercicios.calcularPesoIdeal(sexo, altura);
		System.out.printf("O peso ideal é: %.2f kilos.\n\n", resultado);
		
	}

}