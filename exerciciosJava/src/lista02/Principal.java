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

		String[] opcoes = { "Mostra vetor", "Maior elemento do vetor", "Menor elemento do vetor e sua posição",
				"Vetor inverso", "Vetor multiplicado", "Produto escalar", "Fibonacci Vetor e Array", "Soma dos números pares", "Ordena do menor para o maior",
				"Repetidos - Array List"};

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
			criarSerieFibonacci();
			break;
		case 8:
			produtorioNumerosPares();
			break;
		case 9:
			ordenaMaior();
			break;
		case 10:
			mostarElementosRepetidos();
			break;
		}
	}
	
	/**
	 * Imprimi um vetor primitivo
	 * 
	 * @param valores
	 */
	public static void imprimirVetorInteiros(int[] valores) {
		if (valores.length == 0) {
			System.out.println("[]");
		} else if (valores.length == 1) {
			System.out.println("[" + valores[0] + "]");
		} else {
			System.out.print("[");
			for (int i = 0; i < valores.length - 1; i++) {
				System.out.print(valores[i] + ", ");
			}
			System.out.println(valores[valores.length - 1] + "]");
		}
	}

	/**
	 * Método responsável por chamar o método da classe Exercício, passando como
	 * parâmetro o tamanho do vetor.
	 */
	public static void mostraVetor() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");

		List<Integer> lista = Exercicios.mostraVetor(tamanho);
		System.out.println("A lista é: " + lista);
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
		int tamanhoVetor = Console.recuperaInteiro("Qual o tamanho do vetor? ");

		System.out.println("O menor elemento está na posição " + Exercicios.menorElemento(tamanhoVetor));

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

		System.out.println("O resultado dos vetores multiplicados é: " + Exercicios.multiplicarVetor(tamanho) + "\n");

	}

	public static void produtoEscalar() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");

		Integer resultado = Exercicios.calcularProdutoEscalavel(tamanho);
		System.out.println("O produto escalar entre dois vetores é: " + resultado);

	}

	/**
	 * Cria serie de Fibonacci com vetor e Array
	 */
	public static void criarSerieFibonacci() {
		int quantidade = Console.recuperaInteiro("Informe a quantidade de elementos da serie: ");

		System.out.println("Vetor primitivo");
		imprimirVetorInteiros(Exercicios.criaSeriefibonacciComVetor(quantidade));

		ArrayList<Integer> fiboArray = Exercicios.criarSerieFibonacciComArray(quantidade);
		System.out.println("Array List");
		System.out.println(fiboArray);
	}

	/**
	 * Cria o método que retorna a soma dos números pares de um vetor
	 */
	public static void produtorioNumerosPares() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");
		
		System.out.println("A soma dos números pares é: " + Exercicios.produtorioNumerosPares(tamanho) + "\n");
	}
	
	/**
	 * Vetor ordenado do menor para o maior elemento.
	 */
	public static void ordenaMaior() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");
		
		System.out.println("Vetor ordenado do menor para o maior " + Exercicios.ordenaMaior(tamanho) + "\n");
	}
	
	/**
	 * Imprimi os elementos repetidos do vetor 
	 */
	public static void mostarElementosRepetidos() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");
		
		System.out.println("Os elementos repetidos do vetor são: " + Exercicios.verificarElementosRepetidosArray(tamanho) + "\n");
	}
	
	public static void criarVetorPrimitivo() {
		int tamanho = Console.recuperaInteiro("Digite o tamanho do seu vetor: ");

		int[] vetor = new int[tamanho];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = vetor[i];
		}
	}

}