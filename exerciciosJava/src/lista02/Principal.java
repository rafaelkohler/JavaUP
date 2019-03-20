package lista02;

import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe vai servir para a resolu��o da lista 02 de exerc�cios.
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

		String[] opcoes = { "Mostra vetor", "Maior elemento do vetor", "Menor elemento do vetor e sua posi��o", "Vetor inverso", "Vetor multiplicado", "Produto escalar" };

		int menu = Console.mostrarMenu(opcoes, "Selecione uma op��es do menu", null);

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
			vetorInverso();
			break;
		case 5:
			multiplicarVetor();
			break;
		case 6:
			produtoEscalar();
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
		System.out.println("A lista �: " +lista);
	}

	/**
	 * M�todo que mostra o maior elemento da lista.
	 */
	public static void maiorElemento() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");

		int maior = Exercicios.maiorElemento(tamanho);
		System.out.println("O maior elemento da lista �: " + maior + "\n");
	}

	/**
	 * M�todo que mostra o menor elemento da lista e sua posi��o.
	 */
	public static void menoElemento() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");

		int menor = Exercicios.menorElemento(tamanho);
		System.out.println("O menor elemento da lista �: " + menor + "\n");

	}
	
	/**
	 * M�todo respons�vel por imprimir a lista invertida.
	 */
	public static void vetorInverso() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");
		
		List<Integer> inverso = Exercicios.vetorInverso(tamanho);
		System.out.println("O vetor inverso �: " + inverso);
	}
	
	/**
	 * M�todo que mostra a multiplica��o dos valores de uma lista.
	 */
	public static void multiplicarVetor() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");
		
		List<Double> vetorMultiplicado = Exercicios.multiplicarVetor(tamanho);
		System.out.println("O menor elemento da lista �: " + vetorMultiplicado + "\n");

	}
	
	public static void produtoEscalar() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");
		
		Integer resultado = Exercicios.calcularProdutoEscalavel(tamanho);
		System.out.println("O produto escalar entre dois vetores �: " + resultado);
		
	}

}