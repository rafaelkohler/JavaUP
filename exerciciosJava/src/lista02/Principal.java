package lista02;

import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe vai servir para a resolução da lista 02 de exercícios.
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

		String[] opcoes = { "Mostra vetor", "Maior elemento do vetor", "Menor elemento do vetor e sua posição", "Vetor inverso", "Vetor multiplicado", "Produto escalar" };

		int menu = Console.mostrarMenu(opcoes, "Selecione uma opções do menu", null);

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
	 * Método responsável por chamar o método da classe Exercício, passando como
	 * parâmetro o tamanho do vetor.
	 */
	public static void mostraVetor() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");

		List<Integer> lista = Exercicios.mostraVetor(tamanho);
		System.out.println("A lista é: " +lista);
	}

	/**
	 * Método que mostra o maior elemento da lista.
	 */
	public static void maiorElemento() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");

		int maior = Exercicios.maiorElemento(tamanho);
		System.out.println("O maior elemento da lista é: " + maior + "\n");
	}

	/**
	 * Método que mostra o menor elemento da lista e sua posição.
	 */
	public static void menoElemento() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");

		int menor = Exercicios.menorElemento(tamanho);
		System.out.println("O menor elemento da lista é: " + menor + "\n");

	}
	
	/**
	 * Método responsável por imprimir a lista invertida.
	 */
	public static void vetorInverso() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");
		
		List<Integer> inverso = Exercicios.vetorInverso(tamanho);
		System.out.println("O vetor inverso é: " + inverso);
	}
	
	/**
	 * Método que mostra a multiplicação dos valores de uma lista.
	 */
	public static void multiplicarVetor() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");
		
		List<Double> vetorMultiplicado = Exercicios.multiplicarVetor(tamanho);
		System.out.println("O menor elemento da lista é: " + vetorMultiplicado + "\n");

	}
	
	public static void produtoEscalar() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");
		
		Integer resultado = Exercicios.calcularProdutoEscalavel(tamanho);
		System.out.println("O produto escalar entre dois vetores é: " + resultado);
		
	}

}