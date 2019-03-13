package lista02;

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
	 * 
	 * @return - Op��o selecionada pelo usu�rio.
	 */
	public static int menu2() {

		String[] opcoes = { "Mostra vetor", "Maior elemento do vetor", "Menor elemento do vetor e sua posi��o" };

		int menu = Console.mostrarMenu(opcoes, "Selecione a op��o desejada:", null);

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
			mostraVetor();
			break;
		case 2:
			maiorElemento();
			break;
		case 3:
			menoElemento();
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

	/**
	 * M�todo respons�vel por chamar o m�todo da classe Exerc�cio, passando como
	 * par�metro o tamanho do vetor.
	 */
	public static void mostraVetor() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");

		List<Integer> lista = Exercicios.mostraVetor(tamanho);
		System.out.println(lista);
	}

	/**
	 * M�todo que mostra o maior elemento da lista.
	 */
	public static void maiorElemento() {

		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");

		int lista = Exercicios.maiorElemento(tamanho);
		System.out.println("O maior elemento da lista �: " + lista + "\n");
	}

	/**
	 * M�todo que mostra o menor elemento da lista e sua posi��o.
	 */
	public static void menoElemento() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");

		int lista = Exercicios.menorrElemento(tamanho);
		System.out.println("O menor elemento da lista �: " + lista + "\n");

	}

}