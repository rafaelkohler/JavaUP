package lista03;

import java.util.ArrayList;
import java.util.List;

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
	 * @return - Op��o selecionada pelo usu�rio.
	 */
	public static int menu2() {

		String[] opcoes = { "C�lculo do peso ideal" };
		int menu = Console.mostrarMenu(opcoes, "Selecione a op��o desejada da lista 03:", "Escolha uma das opl��es do menu");
		return menu;

	}

	/**
	 * Chama as fun��es de acordo com a sele��o do usu�rio.
	 * @param menu - Op��o selecionada pelo usu�rio.
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
		System.out.printf("O peso ideal �: %.2f kilos.\n\n", resultado);
		
	}

}